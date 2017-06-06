package domain;

import javax.persistence.*;

/**
 * Created by Aissue on 2017/6/6.
 *
 */
@Entity
@Table(name = "userinfor", schema = "aissue", catalog = "")
public class UserinforEntity {
    private int id;
    private String name;
    private String gender;
    private Double salary;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "salary")
    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}
