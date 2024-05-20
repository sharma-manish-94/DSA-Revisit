package HackerRank;

import java.math.BigInteger;

public class BigIntegerFactorial {
    public static void main(String [] args) {
        System.out.println(factorial(25));
    }

    private static BigInteger factorial(int number) {
        return number == 0? BigInteger.ONE: BigInteger.valueOf(number).multiply(factorial(number - 1));
    }
    
}
