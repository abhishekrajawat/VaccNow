package com.xabia.vaccnow.services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.xabia.vaccnow.model.Branch;
import com.xabia.vaccnow.model.TimeSlot;
import com.xabia.vaccnow.model.Vaccines;

public interface AvailabilityServices {
	
	public List<Branch> getAllBranches();
	public List<Vaccines> getVaccinesInBranch(@PathVariable("branchid") int branch_id);
	public List<TimeSlot> getAvailableTimeSlots(@PathVariable("branchid") int branch_id);
	
}
