package com.xabia.vaccnow.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xabia.vaccnow.model.Branches;
import com.xabia.vaccnow.model.TimeSlot;
import com.xabia.vaccnow.model.Vaccines;
import com.xabia.vaccnow.services.AvailabilityServices;

@RestController
@RequestMapping("/availability")
public class AvailabilityController {
    @Autowired
    AvailabilityServices availabilityService;

    @RequestMapping(value="/branches", method = RequestMethod.GET)
    @ResponseBody
    public List<Branches> getAllBranches(){
        return availabilityService.getAllBranches();
    }

    @RequestMapping(value="/branches/{branchid}/vaccines", method = RequestMethod.GET)
    @ResponseBody
    public List<Vaccines> getVaccinesInBranch(@PathVariable("branchid") int branch_id){
        return availabilityService.getVaccinesInBranch(branch_id);
    }

	@RequestMapping(value="/branches/{branchid}/availabletimeslot", method = RequestMethod.GET)
	public List<TimeSlot> getAvailableSlotInBranch(@PathVariable("branchid") int branch_id){
		return availabilityService.getAvailableTimeSlots(branch_id);
	}
}