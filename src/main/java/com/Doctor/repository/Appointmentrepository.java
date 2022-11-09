package com.Doctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Doctor.model.Appointment;



public interface Appointmentrepository extends JpaRepository<Appointment, Long>{

}
