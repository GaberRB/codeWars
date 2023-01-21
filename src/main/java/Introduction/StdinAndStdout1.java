package Introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StdinAndStdout1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        var scanner = new Scanner(System.in);
        List<Integer> myInts = new ArrayList<>();
        for(var i = 0; i < 3; i++){
            myInts.add(scanner.nextInt());
        }
        scanner.close();
        for(var myInt:myInts){
            System.out.println(myInt);
        }

    }
}
