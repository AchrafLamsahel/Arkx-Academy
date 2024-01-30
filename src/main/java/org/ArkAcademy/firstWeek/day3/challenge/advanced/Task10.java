package day3.challenge.advanced;

public class Task10 {
    public static void main(String[] args) {
        // Challenge 10: Fibonacci Series with For Loop
        int n1 = 0;
        int n2 = 1;
        for (int i = 1; i <= 8; ++i) {
            int result = n1 + n2;
            System.out.println(n1+" + "+ n2 + " = " + result);
            n1=n2;
            n2= result;
        }
    }
}
