package com.xabia.vaccnow.services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.xabia.vaccnow.model.Vaccination;

public interface ReportingService {
	
	public List<Vaccination> appliedvaccination(@PathVariable("branchid") int branch_id);
	public List<Vaccination> appliedvaccinationperday(@PathVariable("date") String date);
	public List<Vaccination> listAllConfirmedVaccination(@PathVariable("date1") String date1, @PathVariable("date2") String date2);

}
