package Introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        List<String> arrayString = new ArrayList<>();


        for (int i = 0; i < 3; i++) {
            var valueString = scanner.nextLine();
            arrayString.add(valueString);

        }
        scanner.close();
        System.out.println("================================");
        for (String value : arrayString ) {
            var splitString = value.split(" ");
            System.out.printf("%-15s%03d%n", splitString[0],
                    Integer.parseInt(splitString[1]));
        }
        System.out.println("================================");

    }
}
