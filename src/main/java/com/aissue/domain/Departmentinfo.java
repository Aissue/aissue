package com.aissue.domain;

public class Departmentinfo {
  private Long departid;
  private String departname;
  private Long userid;
  private Long managerid;

  public Long getDepartid() {
    return departid;
  }

  public void setDepartid(Long departid) {
    this.departid = departid;
  }

  public String getDepartname() {
    return departname;
  }

  public void setDepartname(String departname) {
    this.departname = departname;
  }

  public Long getUserid() {
    return userid;
  }

  public void setUserid(Long userid) {
    this.userid = userid;
  }

  public Long getManagerid() {
    return managerid;
  }

  public void setManagerid(Long managerid) {
    this.managerid = managerid;
  }
}
