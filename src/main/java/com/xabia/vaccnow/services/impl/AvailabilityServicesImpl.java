package com.xabia.vaccnow.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.xabia.vaccnow.model.Branches;
import com.xabia.vaccnow.model.TimeSlot;
import com.xabia.vaccnow.model.Vaccines;
import com.xabia.vaccnow.repository.AvailabilityRepository;
import com.xabia.vaccnow.services.AvailabilityServices;

@Service
public class AvailabilityServicesImpl implements AvailabilityServices {

	@Autowired
	AvailabilityRepository availabilityRepo;

	@Override
	public List<Branches> getAllBranches() {
		return availabilityRepo.getAllBranches();
	}

	@Override
	public List<Vaccines> getVaccinesInBranch(@PathVariable("branchid") int branch_id) {
		return availabilityRepo.getVaccinesInBranch(branch_id);
	}

	@Override
	public List<TimeSlot> getAvailableTimeSlots(@PathVariable("branchid") int branch_id) {
		return availabilityRepo.getAvailableTimeSlots(branch_id);
	}

}
