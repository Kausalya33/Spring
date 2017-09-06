package com.kgfsl.springbootconfig.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empid; 
	private String name; 
	private String address;
    private Float salary;
    
	public Integer getId() {
		return empid;
	}
   public void setId(Integer empid) {
		this.empid = empid;
	}
    public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
    public String getaddress(){
        return address;
    }
    public void setaddress(String address){
        this.address=address;
    }
    public Float getsalary(){
        return salary;
    }
    public void setsalary(Float salary){
        this.salary=salary;
    }
}
	
	