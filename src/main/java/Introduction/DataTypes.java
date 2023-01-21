package Introduction;

import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var init = Integer.parseInt(scanner.next());

        for (int i = 0; i <= init; i++) {
            var valueString = scanner.next();
            var valid = true;
            if (valueString.length() > 16){
                System.out.println(valueString +" can't be fitted anywhere.");
                valid = false;
            }
            var value = 0L;
            if(valid){
                value = Long.parseLong(valueString);
            }

            if (value <= Byte.MAX_VALUE && value >= Byte.MIN_VALUE && valid) {
                valid = false;
                System.out.println(value +" can be fitted in:\n" +
                        "* byte\n" +
                        "* short\n" +
                        "* int\n" +
                        "* long");
            }

            if (value <= Short.MAX_VALUE && value >= Short.MIN_VALUE && valid) {
                valid = false;
                System.out.println(value +" can be fitted in:\n" +
                        "* short\n" +
                        "* int\n" +
                        "* long");
            }
            if (value <= Integer.MAX_VALUE && value >= Integer.MIN_VALUE && valid) {
                valid = false;
                System.out.println(value +" can be fitted in:\n" +
                        "* int\n" +
                        "* long");
            }
            if (value <= Long.MAX_VALUE && value >= Long.MIN_VALUE && valid) {
                valid = false;
                System.out.println(value +" can be fitted in:\n" +
                        "* long");
            }

        }
        scanner.close();
    }
}
