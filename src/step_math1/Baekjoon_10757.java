package step_math1;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon_10757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger bigInt1 = sc.nextBigInteger();
        BigInteger bigInt2 = sc.nextBigInteger();

        System.out.println(bigInt1.add(bigInt2));
    }
}
