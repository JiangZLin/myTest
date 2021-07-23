package com.jzl.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtils {
    private static SqlSessionFactory factory = null;

    static {
        String config = "mybatis.xml";
        try {
            //通过加载MyBatis的主配置文件mybatis.xml，创建输入流对象
            InputStream in = Resources.getResourceAsStream(config);
            factory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //这里的意思是在线程里面拿session，以保证所有的操作使用的都是同一个session
    //当第一次执行到这里时时创建一个session的操作，第二次以后就是直接拿这个session了
    private static ThreadLocal<SqlSession> t = new ThreadLocal<>();

    //获取SqlSession的方法
    public static SqlSession getSession(){
        //如果线程里面有session就从线程里面拿，没有就创建一个
        SqlSession session = t.get();
        if (session == null){
            session = factory.openSession();
            t.set(session);
        }
        return session;
   }

   //关闭Sqlsession对象
    public static void Close(SqlSession session){
        if (session != null){
            session.close();
            //Session其实并没有被销魂，只是被关闭了。这里回滚事务以保证session是纯净的
            //如果不手动回滚可能会出现错误。
            t.remove();
        }
    }
}
