package com.Doctor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long patientnum;
    private String patientname;
    private String mobilenum;
    private int age;
	public Patient() {
		super();
	}
	public Patient(long patientnum, String patientname, String mobilenum, int age) {
		super();
		this.patientnum = patientnum;
		this.patientname = patientname;
		this.mobilenum = mobilenum;
		this.age = age;
	}
	public long getPatientnum() {
		return patientnum;
	}
	public void setPatientnum(long patientnum) {
		this.patientnum = patientnum;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public String getMobilenum() {
		return mobilenum;
	}
	public void setMobilenum(String mobilenum) {
		this.mobilenum = mobilenum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    
    
	
}
