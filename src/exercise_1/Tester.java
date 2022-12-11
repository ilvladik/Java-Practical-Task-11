package exercise_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tester {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2022, Calendar.OCTOBER, 22, 21, 14);
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy 'в' hh.mm a");
        System.out.println("Developer: Tom Tobasco");
        System.out.println("Task was received: " + formatter.format(calendar.getTime()));
        System.out.println("Task was showed: " + formatter.format(new Date()));
    }
}
