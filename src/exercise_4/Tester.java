package exercise_4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static exercise_2.Tester.getNumber;

public class Tester {

    public static void main(String[] args) {
        Calendar calendar = getCalendar();
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy 'в' hh.mm a");
        System.out.println(formatter.format(calendar.getTime()));
    }

    public static Calendar getCalendar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Время в формате ГГГГ ММ ДД чч мм: ");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int hours = scanner.nextInt();
        int min = scanner.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day, hours, min);
        return calendar;
    }


}
