package codewars;

//Given an array of integers, find the one that appears an odd number of times.
//
//        There will always be only one integer that appears an odd number of times.
//        Examples
//
//        [7] should return 7, because it occurs 1 time (which is odd).
//        [0] should return 0, because it occurs 1 time (which is odd).
//        [1,1,2] should return 2, because it occurs 1 time (which is odd).
//        [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
//        [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
//


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class Findtheoddint {

    public static void main(String[] args) {
        assertEquals(0, Findtheoddint.findIt(new int[]{0,1,0,1,0}));
        assertEquals(-1, Findtheoddint.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        assertEquals(5, Findtheoddint.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        assertEquals(10, Findtheoddint.findIt(new int[]{10}));
        assertEquals(10, Findtheoddint.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        assertEquals(1, Findtheoddint.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
    }

//    public static int findIt(int[] a) {
//        int count = 0;
//        for (int i:a) {
//
//            for (int j = 0; j < a.length; j++) {
//                if (i == a[j]){
//                    count++;
//                }
//
//            }
//            if (count%2 != 0){
//                if (count == 1){
//                    return i;
//                }else if(i%2 !=0){
//                    return i;
//                }
//                return count;
//            }
//            count = 0;
//        }
//        return 0;
//    }

//    quando um elemento é comparado com ele mesmo usando o operador XOR,
//    o resultado é sempre 0. Então, quando todos os outros elementos aparecem pares vezes,
//    o elemento que aparece ímpar vezes será o único que não foi cancelado pelo operador XOR. E esse valor é retornado
    public static int findIt(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        return xor;
    }
}
