package Introduction;

import java.util.Scanner;

public class StaticInitialBlock {

    static Scanner scanner = new Scanner(System.in);

    static int b = scanner.nextInt();
    static int h = scanner.nextInt();

    public static void main(String[] args) {

        if (b <= 0 || h <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else {
            System.out.println(b*h);
        }
    }
}
