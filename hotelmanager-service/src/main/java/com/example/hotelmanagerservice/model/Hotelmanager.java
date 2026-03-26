package com.example.hotelmanagerservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Hotelmanager {
    @Id
    private int managerid;
    private String managername;
    private String manageremail;
    private String managerpassword;
    private int managercontactnumber;

    public int getManagerid() {
        return managerid;
    }

    public void setManagerid(int managerid) {
        this.managerid = managerid;
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername;
    }

    public String getManageremail() {
        return manageremail;
    }

    public void setManageremail(String manageremail) {
        this.manageremail = manageremail;
    }

    public String getManagerpassword() {
        return managerpassword;
    }

    public void setManagerpassword(String managerpassword) {
        this.managerpassword = managerpassword;
    }

    public int getManagercontactnumber() {
        return managercontactnumber;
    }

    public void setManagercontactnumber(int managercontactnumber) {
        this.managercontactnumber = managercontactnumber;
    }

    @Override
    public String toString() {
        return "Hotelmanager{" +
                "managerid=" + managerid +
                ", managername='" + managername + '\'' +
                ", manageremail='" + manageremail + '\'' +
                ", managerpassword='" + managerpassword + '\'' +
                ", managercontactnumber=" + managercontactnumber +
                '}';
    }
}
