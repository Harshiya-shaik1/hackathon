package com.lcwd.appointment.service.Services;

import org.springframework.stereotype.Service;

import com.lcwd.appointment.service.entities.Appointment;

@Service
public interface AppointmentService {
	
	
	Appointment saveAppointment(Appointment appointment);
	
	
	

}
