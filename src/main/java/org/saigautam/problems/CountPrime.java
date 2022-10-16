package org.saigautam.problems;

public class CountPrime {

    public int countPrimes(int n) {

        boolean[] compositeNumberFlag = new boolean[n];
        for (int i = 2; i * i < n; i++) {
            if (!compositeNumberFlag[i]) {
                for (int q = 2; q * i < n; q++) {
                    compositeNumberFlag[q * i] = true;
                }
            }
        }
        int primeCounter = 0;
        for (int i = 2; i < n; i++) {
            if (!compositeNumberFlag[i]) {
                primeCounter++;
            }
        }
        return primeCounter;
    }
}
