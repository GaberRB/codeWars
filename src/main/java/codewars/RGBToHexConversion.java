package codewars;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class RGBToHexConversion {

    public static void main(String[] args) {
        assertEquals("For input: (0, 0, 0)", "000000", RGBToHexConversion.rgb(0, 0, 0));
        assertEquals("For input: (1, 2, 3)", "010203", RGBToHexConversion.rgb(1, 2, 3));
        assertEquals("For input: (255, 255, 255)", "FFFFFF", RGBToHexConversion.rgb(255, 255, 255));
        assertEquals("For input: (254, 253, 252)", "FEFDFC", RGBToHexConversion.rgb(254, 253, 252));
        assertEquals("For input: (-20, 275, 125)", "00FF7D", RGBToHexConversion.rgb(-20, 275, 125));
    }

    public static String rgb(int r, int g, int b) {
        return String.format("%02X%02X%02X", verify(r), verify(g), verify(b));
    }

    private static int verify(int i) {
        return Math.min(255, Math.max(0, i));
    }
}
