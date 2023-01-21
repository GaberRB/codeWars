package codewars;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class FindTheMissingLetter {

    public static void main(String args[]) {
        assertEquals('e', FindTheMissingLetter.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', FindTheMissingLetter.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }


    public static char findMissingLetter(char[] array)
    {
        char expectableLetter = array[0];
        for(char letter : array){
            if(letter != expectableLetter) break;
            expectableLetter++;
        }
        return expectableLetter;

    }
}
