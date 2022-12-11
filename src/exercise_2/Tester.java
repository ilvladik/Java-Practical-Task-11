package exercise_2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, getNumber("Введите год: ", 0, 10000));
        calendar.set(Calendar.MONTH, getNumber("Введите месяц: ", 1, 12)-1);
        calendar.set(Calendar.DATE, getNumber("Введите день: ", 1, 31));
        calendar.set(Calendar.HOUR, getNumber("Введите часы: ", 0, 23));
        calendar.set(Calendar.MINUTE, getNumber("Введите минуты: ", 0, 59));
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy 'в' hh.mm a");
        Date current = new Date();
        if (current.after(new Date(calendar.getTimeInMillis()))) {
            System.out.println(formatter.format(current) + " after " + formatter.format(calendar.getTime()));
        } else {
            System.out.println(formatter.format(current) + " before " + formatter.format(calendar.getTime()));
        }
    }

    public static int getNumber(String interaction, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(interaction);
            int number = scanner.nextInt();
            if (number >= min && number <= max) {
                return number;
            }
            System.out.println("Значение неверное");
        }
    }

}
