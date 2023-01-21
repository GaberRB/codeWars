package codewars;

public class Primeiro {
    public static void main(String args[]) {
        int res = 0;
        int number = 10;
        for(int i = 0; i < number; i++){
            if (i % 3 == 0 || i % 5 ==0){
                res = res + i;
                System.out.println(i);
            }
        }
        System.out.println("O res  " + res);
    }
}
