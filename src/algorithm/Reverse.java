package src.algorithm;

public class Reverse {

    public static int number(int number) {
        int rev = 0;
        while (number != 0) {
            int pop = number % 10;
            number /= 10;
            rev = rev * 10 + pop;
        }
        return rev;
    }

}
