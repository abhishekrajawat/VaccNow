

## Table of contents
* Project information
* Technologies Used
* Setup

## Project information
As a procedure defined after Covid-19 pendamic, VaccNow is an healthcare organization managing the process of Covid-19 vaccine to public,
so that the VaccNow is planning to build multi their digital channels.
	
## Technologies
Project is created with:
* Java: 8
* Springboot: 1.5.10.RELEASE with RESTful Services
* H2 Database
	
## Setup
To run this project:
Import Project as Maven project
```
Start Application with VaccNowApplication.java
```

Sample data:
 1. Branches  -Delhi and Gurgaon
 2. Vaccines  - Bharat Vaccine and Moderna
 3. Entries - Appointment user1@user.com, user2@user.com and user3@user.com

## Availability

 * Get a list of all branches
http://localhost:8080/availability/branches
 * Get a list of all available vaccines per branch
http://localhost:8080/availability/branches/{branchid}/vaccines (use branchid = 101)
 * Get a specific availability by branch
http://localhost:8080/availability/branches/{branchid}/availabletimeslot (use branchid = 101)

## Reporting

 * Get a list of Applied Vaccination per branch
http://localhost:8080/reporting/branches/{branchid}/appliedvaccination (can use branchid = 101)
 * get applied vaccination date
http://localhost:8080/reporting/appliedvaccinationperday/{date} (can use date= 2021-12-12)
 * Get a list of all confirmed Vaccination
http://localhost:8080/reporting/listallconfirmedvaccination/{date1}/{date2} (use date1= 2021-12-12, date2= 2021-10-12)

## Vaccination

 * Check whether vaccination is fixed
http://localhost:8080/vaccination/schedulevaccination
 * Choose Payment Option
http://localhost:8080/vaccination/choosepayment (need to add "?user_id=111111")
 * Send schedule confirmation email
http://localhost:8080/vaccination/scheduleconfirmationemail (need to add "?user_id=111111")

 * Unit Tests
AvaibilityTests.java

 * H2 Database
 http://localhost:8080/h2-console
 jdbc:h2:mem:vaccnow
 user - sa
 password - 

