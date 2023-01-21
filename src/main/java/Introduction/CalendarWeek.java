package Introduction;

import java.io.*;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class CalendarWeek {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        var dayWeeke = LocalDate.of(day, month, year).getDayOfWeek();
        return dayWeeke.name();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var v1 = scanner.nextInt();
        var v2 = scanner.nextInt();
        var v3 = scanner.nextInt();

        System.out.println(findDay(v1,v2,v3));
    }

}

