package net.dohaw.acidrain;

import java.time.ZonedDateTime;

public class ScheduleInfo {

    private ZonedDateTime startTimeAndDate;
    private ZonedDateTime endTimeAndDate;
    private String world;

    public ScheduleInfo(ZonedDateTime startTimeAndDate, ZonedDateTime endTimeAndDate, String world) {
        this.startTimeAndDate = startTimeAndDate;
        this.endTimeAndDate = endTimeAndDate;
        this.world = world;
    }

    public ZonedDateTime getStartTimeAndDate() {
        return startTimeAndDate;
    }

    public ZonedDateTime getEndTimeAndDate() {
        return endTimeAndDate;
    }

    public String getWorld() {
        return world;
    }

}
