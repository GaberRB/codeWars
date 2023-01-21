package Introduction;

import java.util.Scanner;

public class EndOfFIle {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var i = 0;
        while (scanner.hasNext()){
            i++;
            System.out.println(i + " " + scanner.nextLine());
        }
    }
}
