/*
 * 
 * FULL EXCERSICE https://exercism.org/tracks/java/exercises/booking-up-for-beauty
 * 
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        return LocalDateTime.parse(appointmentDateDescription, DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss"));
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
       return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        String dayOfWeek = appointmentDate.getDayOfWeek().toString();
        String month = appointmentDate.getMonth().toString();
        int dayOfMonth = appointmentDate.getDayOfMonth();
        int year = appointmentDate.getYear();
        int hour = appointmentDate.getHour();
        int minute = appointmentDate.getMinute();
        String period = hour < 12 ? "AM" : "PM";
        hour = hour % 12;
        if (hour == 0) {
            hour = 12;
        }

        String time = String.format("%d:%02d %s", hour, minute, period);

        return String.format("You have an appointment on %s, %s %d, %d, at %s.", 
                              capitalizeFirstLetter(dayOfWeek), 
                              capitalizeFirstLetter(month), 
                              dayOfMonth, 
                              year, 
                              time);
    }

    public LocalDate getAnniversaryDate() {
       return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }


    private static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }


    public static void main(String[] args) {
        AppointmentScheduler scheduler = new AppointmentScheduler();
System.out.println(scheduler.schedule("7/25/2019 13:45:00"));// => LocalDateTime.of(2019, 7, 25, 13, 45, 0)
System.out.println(scheduler.hasPassed(LocalDateTime.of(1999, 12, 31, 9, 0, 0)));// => true
System.out.println(scheduler.isAfternoonAppointment(LocalDateTime.of(2019, 03, 29, 15, 0, 0))); // => true
System.out.println(scheduler.getDescription(LocalDateTime.of(2019, 03, 29, 15, 0, 0)));// => "You have an appointment on Friday, March 29, 2019, at 3:00 PM."
System.out.println(scheduler.getAnniversaryDate());// => LocalDate.of(<current year>, 9, 15)
    }
}
