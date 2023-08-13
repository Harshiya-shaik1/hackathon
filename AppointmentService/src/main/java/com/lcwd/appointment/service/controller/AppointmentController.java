package com.lcwd.appointment.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.appointment.service.Services.AppointmentService;
import com.lcwd.appointment.service.Services.AppointmentServiceImpl;
import com.lcwd.appointment.service.entities.Appointment;

@RestController
public class AppointmentController {
	
	@Autowired
	private AppointmentService appointmentService;
	
	@PostMapping("/appointment")
	public ResponseEntity<Appointment> createAppointment(@RequestBody Appointment appointment){
	Appointment appointment1=appointmentService.saveAppointment(appointment);
	return ResponseEntity.status(HttpStatus.CREATED).body(appointment);
	
}
}
