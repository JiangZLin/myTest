package com.jzl.Test;

import com.jzl.dao.StudentDao;
import com.jzl.entity.Student;
import com.jzl.util.MyBatisUtils;
import com.jzl.util.ServiceFactory;
import com.jzl.vo.StudentAndClassroomVO;
import com.service.StudentService;
import com.service.impl.StudentServiceImpl;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;


public class test {

    public static void main(String[] args) throws IOException {
//        //1.mybatis 主配置文件
//        String config = "mybatis.xml";
//        //2.读取配置文件
//        InputStream in = Resources.getResourceAsStream(config);
//        //3.创建 SqlSessionFactory 对象,目的是获取 SqlSession
//        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//        //4.获取 SqlSession,SqlSession 能执行 sql 语句
//        SqlSessionFactory factor = builder.build(in);
//
//        SqlSession session = factor.openSession();
//        Student student = session.selectOne("com.jzl.dao.StudentDao.getById",1002);
//        System.out.println(student);
//        session.close();


//==================================================================================================
//          StudentService ss = (StudentService) ServiceFactory.getService(new StudentServiceImpl());
//
//        SqlSession sqlSession = MyBatisUtils.getSession();
//        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
//        Student student1 = studentDao.getById(1002);
//        System.out.println(student1);

//==================================================================================================
//        List<Student> list = ss.getAll();
//        for (Student s : list){
//            System.out.println(s);
//        }

        StudentDao studentDao = MyBatisUtils.getSession().getMapper(StudentDao.class);

        List<StudentAndClassroomVO> sc = studentDao.stuAndclass("张");
        System.out.println(sc);
        for (StudentAndClassroomVO s:sc){
            System.out.println(s);
        }
    }
}
