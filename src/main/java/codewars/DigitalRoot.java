package codewars;

//Write a function, persistence, that takes in a positive parameter num
//and returns its multiplicative persistence, which is the number of times
//you must multiply the digits in num until you reach a single digit.

import static org.junit.Assert.assertEquals;

public class DigitalRoot {
    public static void main(String args[]) {
        System.out.println("****** Basic Tests ******");
        assertEquals(7, DigitalRoot.reduceDigits(16));
        assertEquals(6, DigitalRoot.reduceDigits(942));
        assertEquals(6, DigitalRoot.reduceDigits(132189));
        assertEquals(2, DigitalRoot.reduceDigits(493193));
    }

    public static int persistence(long n) {
        int result = 0;
        int size = String.valueOf(n).length();
        String[] nString = String.valueOf(n).split("");
        //(because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
        while (size != 1){
            for (String nS:nString) {
                result += Integer.parseInt(nS);
            }
            size = String.valueOf(result).length();
            nString = String.valueOf(result).split("");
            if (size == 1){
                return result;
            }

            result = 0;
        }

        return result;
    }

    public static int reduceDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if (sum > 9) {
            return reduceDigits(sum);
        }
        return sum;
    }
}
