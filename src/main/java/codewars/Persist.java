package codewars;

//Write a function, persistence, that takes in a positive parameter num
//and returns its multiplicative persistence, which is the number of times
//you must multiply the digits in num until you reach a single digit.

import static org.junit.Assert.assertEquals;

public class Persist {
    public static void main(String args[]) {
        System.out.println("****** Basic Tests ******");
        assertEquals(3, Persist.persistence(39));
        assertEquals(0, Persist.persistence(4));
        assertEquals(2, Persist.persistence(25));
        assertEquals(4, Persist.persistence(999));
    }

    public static int persistence(long n) {
        int result = 1;
        int count = 0;
        int size = String.valueOf(n).length();
        String[] nString = String.valueOf(n).split("");
        //(because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
        while (size != 1){
            for (String nS:nString) {
                result *= Integer.parseInt(nS);
            }
            size = String.valueOf(result).length();
            nString = String.valueOf(result).split("");
            count++;
            if (size == 1){
                return count;
            }

            result = 1;
        }

        return count;
    }
}
