package com.xabia.vaccnow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xabia.vaccnow.model.PaymentOptions;
import com.xabia.vaccnow.services.VaccinationService;
import com.xabia.vaccnow.util.Utility;

@RestController
@RequestMapping("/vaccination")
public class VaccinationController {
	@Autowired
	VaccinationService vaccinationServices;

	@RequestMapping(value = "/schedulevaccination", method = RequestMethod.POST)
	@ResponseBody
	public String schedulevaccination(@RequestParam("branch_id") int branch_id,
			@RequestParam("vaccine_id") int vaccine_id, @RequestParam("timeslot") String timeslot,
			@RequestParam("user_id") int user_id) {

		if (vaccinationServices.schedulevaccination(branch_id, vaccine_id, timeslot, user_id) >= 1) {
			return "Successfully Scheduled";
		} else {
			return "Something went wrong!";
		}
	}

	@RequestMapping(value = "/choosepayment", method = RequestMethod.POST)
	@ResponseBody
	public List<String> choosepayment(@RequestParam("user_id") int user_id) {
		return PaymentOptions.getPaymentOptions();
	}

	@RequestMapping(value = "/scheduleconfirmationemail", method = RequestMethod.GET)
	@ResponseBody
	public String scheduleconfirmationemail(@RequestParam("user_id") int user_id) {

		return Utility.emailUtility();
	}
}