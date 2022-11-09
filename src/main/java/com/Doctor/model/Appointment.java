package com.Doctor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long appointmentnum;
	    private long patientnum;
	    private String patientname;
	    private String doctorname;
		public Appointment() {
			super();
		}
		public Appointment(long appointmentnum, String patientname, String doctorname) {
			super();
			this.appointmentnum = appointmentnum;
			this.patientnum = patientnum;
			this.patientname = patientname;
			this.doctorname = doctorname;
		}
		public long getAppointmentnum() {
			return appointmentnum;
		}
		public void setAppointmentnum(long appointmentnum) {
			this.appointmentnum = appointmentnum;
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
		public String getDoctorname() {
			return doctorname;
		}
		public void setDoctorname(String doctorname) {
			this.doctorname = doctorname;
		}

	    
}
