package Introduction;

import java.util.Scanner;

public class StringConverterInt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        var v = scanner.nextLine();

        Integer r = Integer.parseInt(v);

        if (r.getClass() == Integer.class){
            System.out.println("Good Job");
        }
    }
}
