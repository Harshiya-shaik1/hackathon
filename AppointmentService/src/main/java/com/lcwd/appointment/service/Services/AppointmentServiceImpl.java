package com.lcwd.appointment.service.Services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.appointment.service.entities.Appointment;
import com.lcwd.appointment.service.repository.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@Override
	public Appointment saveAppointment(Appointment appointment) {
//		 UUID uuid = UUID.randomUUID();
//		long randomId=uuid.getMostSignificantBits();
//		appointment.setPatient(randomId);
		return appointmentRepository.save(appointment);
	}

}
