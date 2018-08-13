package com.changmq.partymanager.domain;
/**
 * 
 * @ClassName Class
 * @Description TODO
 * @author ChangMQ267
 * @date 2018/08/13
 */
public class Class {
    private Integer classId;

    private String cFaculty;

    private String cGrade;

    private Integer cNo;

    private String cProfession;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getcFaculty() {
        return cFaculty;
    }

    public void setcFaculty(String cFaculty) {
        this.cFaculty = cFaculty == null ? null : cFaculty.trim();
    }

    public String getcGrade() {
        return cGrade;
    }

    public void setcGrade(String cGrade) {
        this.cGrade = cGrade == null ? null : cGrade.trim();
    }

    public Integer getcNo() {
        return cNo;
    }

    public void setcNo(Integer cNo) {
        this.cNo = cNo;
    }

    public String getcProfession() {
        return cProfession;
    }

    public void setcProfession(String cProfession) {
        this.cProfession = cProfession == null ? null : cProfession.trim();
    }
}