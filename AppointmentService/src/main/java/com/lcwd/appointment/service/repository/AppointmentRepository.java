package com.lcwd.appointment.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.appointment.service.entities.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment,Long>{

}
