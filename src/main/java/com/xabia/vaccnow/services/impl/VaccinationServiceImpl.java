package com.xabia.vaccnow.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.xabia.vaccnow.model.PaymentOptions;
import com.xabia.vaccnow.repository.VaccinationRepository;
import com.xabia.vaccnow.services.VaccinationService;
import com.xabia.vaccnow.util.Utility;

@Service
public class VaccinationServiceImpl implements VaccinationService {

	@Autowired
	VaccinationRepository vaccinationRepo;

	@Override
	public Integer schedulevaccination(int branch_id, int vaccine_id, String timeslot, int user_id) {
		return vaccinationRepo.schedulevaccination(branch_id, vaccine_id, timeslot, user_id);
	}

	@Override
	public List<String> choosepayment(@RequestParam("user_id") int user_id) {
		return PaymentOptions.getPaymentOptions();
	}

	@Override
	public String scheduleconfirmationemail(@RequestParam("user_id") int user_id) {
		return Utility.emailUtility();
	}
}
