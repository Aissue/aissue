package domain;

import javax.persistence.*;

/**
 * Created by Aissue on 2017/6/7.
 */
@Entity
@Table(name = "departmentinfo", schema = "aissue", catalog = "")
@IdClass(DepartmentinfoEntityPK.class)
public class DepartmentinfoEntity {
    private int departId;
    private String departName;
    private int userId;
    private Integer managerId;

    @Id
    @Column(name = "departId")
    public int getDepartId() {
        return departId;
    }

    public void setDepartId(int departId) {
        this.departId = departId;
    }

    @Basic
    @Column(name = "departName")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartmentinfoEntity that = (DepartmentinfoEntity) o;

        if (departId != that.departId) return false;
        if (userId != that.userId) return false;
        if (departName != null ? !departName.equals(that.departName) : that.departName != null) return false;
        if (managerId != null ? !managerId.equals(that.managerId) : that.managerId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = departId;
        result = 31 * result + (departName != null ? departName.hashCode() : 0);
        result = 31 * result + userId;
        result = 31 * result + (managerId != null ? managerId.hashCode() : 0);
        return result;
    }
}
