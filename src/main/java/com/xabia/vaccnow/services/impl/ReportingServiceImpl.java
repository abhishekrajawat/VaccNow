package com.xabia.vaccnow.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.xabia.vaccnow.model.Vaccination;
import com.xabia.vaccnow.repository.ReportingRepository;
import com.xabia.vaccnow.services.ReportingService;

@Service
public class ReportingServiceImpl implements ReportingService {
	
	@Autowired
    ReportingRepository reportingRepo;
	
	@Override
	public List<Vaccination> appliedvaccination(@PathVariable("branchid") int branch_id){
        return reportingRepo.appliedvaccination(branch_id);
    }
	
	@Override
	public List<Vaccination> appliedvaccinationperday(@PathVariable("date") String date){
		return reportingRepo.appliedvaccinationperday(date);
	}
	
	@Override
	public List<Vaccination> listAllConfirmedVaccination(@PathVariable("date1") String date1, @PathVariable("date2") String date2){
		return reportingRepo.listAllConfirmedVaccination(date1, date2);
	}

}
