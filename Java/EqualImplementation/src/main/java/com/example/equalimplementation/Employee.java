package com.example.equalimplementation;

import java.util.Objects;

public class Employee {
    String empid;
    String empcode;
    String name;
    String nic;
    String address;

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getEmpcode() {
        return empcode;
    }

    public void setEmpcode(String empcode) {
        this.empcode = empcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee(String empid, String empcode, String name, String nic, String address) {
        this.empid = empid;
        this.empcode = empcode;
        this.name = name;
        this.nic = nic;
        this.address = address;
    }



    @Override
    public boolean equals(Object obj) {
       Employee emp=(Employee)  obj;
       if (emp.getEmpid()==this.empid && emp.getEmpcode()== this.getEmpcode())
       {
           return true;

       }

       else
       {
           return false;

       }
          }

    @Override
    public int hashCode() {
        return Objects.hash(empid, empcode, name, nic, address);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empid='" + empid + '\'' +
                ", empcode='" + empcode + '\'' +
                ", name='" + name + '\'' +
                ", nic='" + nic + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}
