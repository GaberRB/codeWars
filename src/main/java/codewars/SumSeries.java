package codewars;
import static org.junit.Assert.assertEquals;
public class SumSeries {
    public static void main(String args[]) {
       int res = GetSum(0,-1);
       assertEquals(-1, GetSum(0, -1));
       assertEquals(1, GetSum(0, 1));
    }

    public static int GetSum(int a, int b)
    {
        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }
}
