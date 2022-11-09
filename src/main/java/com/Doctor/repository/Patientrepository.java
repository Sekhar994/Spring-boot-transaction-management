package com.Doctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Doctor.model.Patient;

public interface Patientrepository extends JpaRepository<Patient, Long>{

}
