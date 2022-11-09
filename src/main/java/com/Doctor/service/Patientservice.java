package com.Doctor.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Doctor.controller.form.PatientForm;
import com.Doctor.model.Appointment;
import com.Doctor.model.Patient;
import com.Doctor.repository.Appointmentrepository;
import com.Doctor.repository.Patientrepository;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
@Transactional
public class Patientservice {
	
	@Autowired
	private Patientrepository prepo;
	@Autowired
	private Appointmentrepository arepo;
	
	/*
	 * Add data
	 */
	 public String bookAppointment(PatientForm form) {
		 
		 com.Doctor.model.Patient patient = new ObjectMapper().convertValue(form, Patient.class);
		 prepo.save(patient);
		 String name=patient.getPatientname();
		 Long patientnumber = patient.getPatientnum();
		// Long appointmentnumber = Appointment.getAppointmentnum();
		 System.out.println(patientnumber);
		 
		 
		 Appointment appointment = new Appointment(patientnumber, name, "karthik");
	        arepo.save(appointment);
	        Long appnumber = appointment.getAppointmentnum();

	        return "booked appointment "+appnumber;
	 }
	 
	 //view
	 public List<Patient> viewPatient(){
	        return prepo.findAll();
	 }
	 public List<Appointment> viewAppointment(){
	        return arepo.findAll();
	    }
	 
	 //update
	 public Patient updatePatient(long id, Patient patient){
	        return prepo.save(patient);
	    }
	 
	 
	 //delete
	 public void deletePatient(Long id){
	        prepo.deleteById(id);
	    }
	 
	 
	 public void deleteAppointment(long id){
	        arepo.deleteById(id);
	    }
	 
	

	   
}


