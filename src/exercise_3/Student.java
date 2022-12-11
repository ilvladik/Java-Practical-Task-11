package exercise_3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Student {

    private String firstName;
    private String lastName;
    private Date birthday;

    public Student(String firstName, String lastName, int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = new Date(calendar.getTimeInMillis());
    }

    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + "\n"
                + "birthday: " + formatBirthday("dd.MM.yyyy");
    }

    public String formatBirthday(String pattern) {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        return formatter.format(birthday);
    }
}
