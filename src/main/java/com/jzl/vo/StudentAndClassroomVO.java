package com.jzl.vo;

public class StudentAndClassroomVO {
    private Integer sid;
    private String sname;
    private String semail;
    private Integer sage;
    private String sclassroomid;
    private String cid;
    private String cname;

    @Override
    public String toString() {
        return "StudentAndClassroomVO{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", semail='" + semail + '\'' +
                ", sage=" + sage +
                ", sclassroomid='" + sclassroomid + '\'' +
                ", cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSemail() {
        return semail;
    }

    public void setSemail(String semail) {
        this.semail = semail;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getSclassroomid() {
        return sclassroomid;
    }

    public void setSclassroomid(String sclassroomid) {
        this.sclassroomid = sclassroomid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
