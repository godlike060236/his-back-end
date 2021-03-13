package com.his.entity;


import java.sql.Date;

public class Register {
    private Integer id;

    private String casenumber;

    @Override
    public String toString() {
        return "Register{" +
                "id=" + id +
                ", casenumber='" + casenumber + '\'' +
                ", realname='" + realname + '\'' +
                ", gender=" + gender +
                ", idnumber='" + idnumber + '\'' +
                ", birthdate=" + birthdate +
                ", age=" + age +
                ", homeaddress='" + homeaddress + '\'' +
                ", visitdate=" + visitdate +
                ", noon='" + noon + '\'' +
                ", deptid=" + deptid +
                ", userid=" + userid +
                ", registleid=" + registleid +
                ", settleid=" + settleid +
                ", isbook='" + isbook + '\'' +
                ", registerid=" + registerid +
                ", visitstate=" + visitstate +
                '}';
    }

    private String realname;

    private Integer gender;

    private String idnumber;

    private String birthdate;

    private Integer age;

    private String homeaddress;

    private String visitdate;

    private String noon;

    private Integer deptid;

    private Integer userid;

    private Integer registleid;

    private Integer settleid;

    private String isbook;

    private Integer registerid;

    private Integer visitstate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCasenumber() {
        return casenumber;
    }

    public void setCasenumber(String casenumber) {
        this.casenumber = casenumber == null ? null : casenumber.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress == null ? null : homeaddress.trim();
    }

    public String getVisitdate() {
        return visitdate;
    }

    public void setVisitdate(String visitdate) {
        this.visitdate = visitdate;
    }

    public String getNoon() {
        return noon;
    }

    public void setNoon(String noon) {
        this.noon = noon == null ? null : noon.trim();
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getRegistleid() {
        return registleid;
    }

    public void setRegistleid(Integer registleid) {
        this.registleid = registleid;
    }

    public Integer getSettleid() {
        return settleid;
    }

    public void setSettleid(Integer settleid) {
        this.settleid = settleid;
    }

    public String getIsbook() {
        return isbook;
    }

    public void setIsbook(String isbook) {
        this.isbook = isbook == null ? null : isbook.trim();
    }

    public Integer getRegisterid() {
        return registerid;
    }

    public void setRegisterid(Integer registerid) {
        this.registerid = registerid;
    }

    public Integer getVisitstate() {
        return visitstate;
    }

    public void setVisitstate(Integer visitstate) {
        this.visitstate = visitstate;
    }
}