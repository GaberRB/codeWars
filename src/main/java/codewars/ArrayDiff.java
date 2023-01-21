package codewars;
//
//Your goal in this kata is to implement a difference function,
//which subtracts one list from another and returns the result.
//It should remove all values from list a, which are present in list b keeping their order.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDiff {
//    assertArrayEquals(new int[] {2}, Kata.arrayDiff(new int [] {1,2}, new int[] {1}));
//    assertArrayEquals(new int[] {2,2}, Kata.arrayDiff(new int [] {1,2,2}, new int[] {1}));
//    assertArrayEquals(new int[] {1}, Kata.arrayDiff(new int [] {1,2,2}, new int[] {2}));
//    assertArrayEquals(new int[] {1,2,2}, Kata.arrayDiff(new int [] {1,2,2}, new int[] {}));
//    assertArrayEquals(new int[] {}, Kata.arrayDiff(new int [] {}, new int[] {1,2}));
//
    public static void main(String args[]) {

        int[] a = {1,2,2};
        int[] b = {};
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        listA.removeAll(listB);
        System.out.println(listA);
        System.out.println( listA.stream().mapToInt(e -> e).toArray());

    }
}
