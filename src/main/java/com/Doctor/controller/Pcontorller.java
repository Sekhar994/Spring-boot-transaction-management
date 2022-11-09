package com.Doctor.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Doctor.controller.form.PatientForm;
import com.Doctor.model.Appointment;
import com.Doctor.model.Patient;
import com.Doctor.service.Patientservice;



@RestController
@RequestMapping("/patient")
public class Pcontorller {

	@Autowired
	private Patientservice service;

	
	 @PostMapping("/add")
	 public void addPatient(@RequestBody PatientForm  form){ 
		 service.bookAppointment(form); 
		 
		 }
	 @GetMapping("/viewp")
	    public List<Patient> viewPatient(){
	        return service.viewPatient();
	    }
	 
	 @GetMapping("/viewa")
	    public List<Appointment> viewAppointment(){
	        return service.viewAppointment();
	    }
	 
	 @PutMapping("/patient/{id}")
	    public Patient updatePatient(@PathVariable("id") long id, @RequestBody Patient patient){
	        return service.updatePatient(id, patient);
	 }
	 
	 
	 @DeleteMapping("deleteP/{id}")
	    public void deletePatient(@PathVariable("id") long id){
	        service.deletePatient(id);
	    }

	 @DeleteMapping("deleteA/{id}")
	    public void deleteAppointment(@PathVariable("id") long id){
	        service.deleteAppointment(id);
	    }
}
