package mpr.exs;

import java.util.*;

public class PrimesGen {

	/*
	 * Generator liczb pierwszych
	 * @param N liczba liczb pierwszych do wygenerowania
	 * @return tablica wygenerowanych liczb pierwszych
	 */
	public static List<Integer> genPrimes(int N) {
		int[] primes = new int[N];
		List<Integer> lista = new ArrayList<Integer>();

		/* wiemy, że najmniejszą liczbą pierwszą jest 2 */
		primes[0] = 2;
		lista.add(2);
		int numOfPrimes = 1;

		/* najbliższym dwójce kandydatem na liczbe pierwszą jest 3 */
		int primeCandidate = 3;

		while (numOfPrimes < N) {
			boolean isPrime = true;
			for (int k = 0; k < numOfPrimes; k++) {
				if (primeCandidate % primes[k] == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primes[numOfPrimes] = primeCandidate;
				lista.add(primeCandidate);
				numOfPrimes++;
			}
			primeCandidate += 2; // liczby parzyste możemy spokojnie pominąć
		}

		return lista;
	}
}