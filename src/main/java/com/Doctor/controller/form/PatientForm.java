package com.Doctor.controller.form;



public class PatientForm {
	
	private String patientname;
    private String mobilenum;
    private int age;
	public PatientForm() {
		super();
	}
	public PatientForm(String patientname, String mobilenum, int age) {
		super();
		this.patientname = patientname;
		this.mobilenum = mobilenum;
		this.age = age;
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
