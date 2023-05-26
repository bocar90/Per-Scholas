package sba.sms.utils;

import sba.sms.models.Activity;
import sba.sms.models.Volunteer;
import sba.sms.services.ActivityService;
import sba.sms.services.VolunteerService;

public class CommandLine {
    private CommandLine() {
        // Utility classes should not have public constructors
    }

    public static void addData() {

        VolunteerService volunteerService = new VolunteerService();
        ActivityService activityService = new ActivityService();

  //      You can edit or change names as you desire
        String PASSWORD = "1";

        volunteerService.createVolunteer(new Volunteer("James@gmail.com", "James A", PASSWORD));
        volunteerService.createVolunteer(new Volunteer("Matthew@gmail.com", "Matthew B", PASSWORD));
        volunteerService.createVolunteer(new Volunteer("Phillp@gmail.com", "Phillp C", PASSWORD));
        volunteerService.createVolunteer(new Volunteer("John@gmail.com", "John D", PASSWORD));
        volunteerService.createVolunteer(new Volunteer("Peter@gmail.com", "Peter E", PASSWORD));

        activityService.createActivity(new Activity("Basketball"));
        activityService.createActivity(new Activity("Football"));
        activityService.createActivity(new Activity("Hockey"));
        activityService.createActivity(new Activity("Tennies"));
        activityService.createActivity(new Activity("Baseball"));

    }
}
