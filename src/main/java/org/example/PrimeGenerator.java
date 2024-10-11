package org.example;

import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator {

    public static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        int number = 2; // The first prime number

        while (primes.size() < n) {
            if (isPrime(number)) {
                primes.add(number);
            }
            number++;
        }

        return primes;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 10; // Change this to generate more or fewer primes
        List<Integer> primes = generatePrimes(n);

        System.out.println("First " + n + " prime numbers: " + primes);
    }
}