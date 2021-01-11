package com.xabia.vaccnow.services;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

public interface VaccinationService {
	
	public Integer schedulevaccination(int branch_id, int vaccine_id, String timeslot, int user_id);
	public List<String> choosepayment(@RequestParam("user_id") int user_id);
	public String scheduleconfirmationemail(@RequestParam("user_id") int user_id);

}
