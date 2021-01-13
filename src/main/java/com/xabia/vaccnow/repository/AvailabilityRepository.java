package com.xabia.vaccnow.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xabia.vaccnow.model.Branches;
import com.xabia.vaccnow.model.TimeSlot;
import com.xabia.vaccnow.model.Vaccines;

@Repository
public class AvailabilityRepository {

    @Autowired
    JdbcTemplate template;

    public List<Branches> getAllBranches(){
        List<Branches> branches = template.query("select branch_id, name, address from branches",(result,rowNum)->new Branches(result.getInt("branch_id"),
                result.getString("name"), result.getString("address")));
        return branches;
    }

    public List<Vaccines> getVaccinesInBranch(int branch_id){
        List<Vaccines> vaccines = template.query("select v.vaccine_id as vaccine_id, v.name as name from vaccine v, branch_vaccine b where v.vaccine_id = b.vaccine_id and b.branch_id = "+branch_id,(result,rowNum)->new Vaccines(result.getInt("vaccine_id"),
                result.getString("name")));
        return vaccines;
    }
    
    public List<TimeSlot> getAvailableTimeSlots(int branch_id){
        List<TimeSlot> timeslots = template.query("select slot_id, branch_id, timeslot from branch_timeslots where branch_id="+branch_id,(result,rowNum)->new TimeSlot(result.getInt("slot_id"),
        		result.getInt("branch_id"), result.getString("timeslot")));
        return timeslots;
    }    

}
