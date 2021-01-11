package com.xabia.vaccnow.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xabia.vaccnow.model.Vaccination;

@Repository
public class ReportingRepository {

    @Autowired
    JdbcTemplate template;


    public List<Vaccination> appliedvaccination(int branch_id){
        List<Vaccination> appliedVaccination = template.query("select applied_id, branch_id, vaccine_id, timeslot, user_id, is_confirmed, applied_time from vaccination where branch_id="+branch_id,(result,rowNum)->new Vaccination(result.getInt("applied_id"),
        		result.getInt("vaccine_id"),result.getInt("branch_id"),result.getInt("user_id"),result.getString("timeslot"),result.getBoolean("is_confirmed"), result.getDate("applied_time")));
        return appliedVaccination;
    }
    
    public List<Vaccination> appliedvaccinationperday(String date){
    	List<Vaccination> appliedVaccination = template.query("select applied_id, branch_id, vaccine_id, timeslot, user_id, is_confirmed, applied_time from vaccination where applied_time BETWEEN DATE '"+date+"' AND DATE '"+date+"'",(result,rowNum)->new Vaccination(result.getInt("applied_id"),
        		result.getInt("vaccine_id"),result.getInt("branch_id"),result.getInt("user_id"),result.getString("timeslot"),result.getBoolean("is_confirmed"), result.getDate("applied_time")));
        return appliedVaccination;
    }
    
    public List<Vaccination> listAllConfirmedVaccination(String date1, String date2){
        List<Vaccination> appliedVaccination = template.query("select applied_id, branch_id, vaccine_id, timeslot, user_id, is_confirmed, applied_time from vaccination where is_confirmed is true and applied_time BETWEEN DATE '"+date1+"' AND DATE '"+date2+"'",(result,rowNum)->new Vaccination(result.getInt("applied_id"),
        		result.getInt("vaccine_id"),result.getInt("branch_id"),result.getInt("user_id"),result.getString("timeslot"),result.getBoolean("is_confirmed"), result.getDate("applied_time")));
        return appliedVaccination;
    } 
}
