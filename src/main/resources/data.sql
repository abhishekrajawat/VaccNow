INSERT INTO `branches` (`branch_id`, `name`, `address`) VALUES (101, 'Delhi', 'Jia Sarai');
INSERT INTO `branches` (`branch_id`, `name`, `address`) VALUES (102, 'Gurgaon', 'Aravali Nagar');

INSERT INTO `vaccines` (`vaccine_id`, `name`) VALUES (1, 'Bharat Vaccine');
INSERT INTO `vaccines` (`vaccine_id`, `name`) VALUES (2, 'Moderna');

INSERT INTO `branch_vaccine` (`branch_id`, `vaccine_id`) VALUES (101, 1);
INSERT INTO `branch_vaccine` (`branch_id`, `vaccine_id`) VALUES (102, 1);
INSERT INTO `branch_vaccine` (`branch_id`, `vaccine_id`) VALUES (101, 2);
INSERT INTO `branch_vaccine` (`branch_id`, `vaccine_id`) VALUES (102, 2);

INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (1, 101, '09:00AM-09:15AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (2, 101, '09:15AM-09:30AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (3, 101, '09:30AM-09:45AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (4, 101, '09:45AM-10:00AM');

INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (5, 101, '10:00AM-10:15AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (6, 101, '10:15AM-10:30AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (7, 101, '10:30AM-10:45AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (8, 101, '10:45AM-11:00AM');

INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (9, 101, '11:00AM-11:15AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (10, 101, '11:15AM-11:30AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (11, 101, '11:30AM-11:45AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (12, 101, '11:45AM-12:00PM');

INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (13, 102, '10:00AM-10:15AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (14, 102, '10:15AM-10:30AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (15, 102, '10:30AM-10:45AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (16, 102, '10:45AM-11:00AM');

INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (17, 102, '11:00AM-11:15AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (18, 102, '11:15AM-11:30AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (19, 102, '11:30AM-11:45AM');
INSERT INTO `branch_timeslots` (`slot_id`, `branch_id`, `timeslot`) VALUES (20, 102, '11:45AM-12:00PM');

INSERT INTO `vaccination` (`branch_id`,`vaccine_id`, `timeslot`, `user_id`, `is_confirmed`, `applied_time`) VALUES (101, 1, '11:45AM-12:00PM', '111111', true, sysdate-2);
INSERT INTO `vaccination` (`branch_id`,`vaccine_id`, `timeslot`, `user_id`, `is_confirmed`,`applied_time`) VALUES (101, 1, '10:45AM-11:00PM', '111112', false, sysdate);