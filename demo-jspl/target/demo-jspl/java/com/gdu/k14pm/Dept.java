package com.gdu.k14pm;

import java.util.HashSet;
import java.util.Set;

public class Dept {
    private int deptNo;
    private Sting deptName;
    private String location;
    private Set<Emp> emloyees;
    
    public Dept() {
    }
    public Dept(int deptNo, Sting deptName, String location, Set<Emp> emloyees) {
        this.deptNo = deptNo;
        this.deptName = deptName;
        this.location = location;
        this.emloyees = emloyees;
    }
    public Sting getDeptName() {
        return deptName;
    }
    public void setDeptName(Sting deptName) {
        this.deptName = deptName;
    }
    public int getDeptNo() {
        return deptNo;
    }
    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }
    public Set<Emp> getEmloyees() {
        return emloyees;
    }
    public void setEmloyees(Set<Emp> emloyees) {
        this.emloyees = emloyees;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public Set<Emp> getEmloees(){
        return emloyees;
    }
    public void setEmloyees(Set<Emp> emloyees){
        this.emloyees = emloyees;
    }
    public void addEmployee(Emp emloyee){
        if (this.emloyees == null) {
            this.emloyees = new HashSet<Emp>();
        }
        this.emloyees.add(emloyee);
    }
}
