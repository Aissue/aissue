package com.aissue.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Aissue on 2017/6/13.
 */
@Entity
@Table(name = "ae_department")
public class DepartmentinfoEntity implements Serializable{
    private int departId;
    private String departName;
    private int userId;
    private Integer managerId;

    @Id
    @Column(name = "departId",length = 64)
    public int getDepartId() {
        return departId;
    }

    public void setDepartId(int departId) {
        this.departId = departId;
    }

    @Basic
    @Column(name = "departName",length = 64)
    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    @Id
    @Column(name = "userId")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "managerId")
    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

}
