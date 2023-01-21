package Introduction;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        if (n % 2 != 0 || n >= 6 && n <= 20){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }
    }
}
