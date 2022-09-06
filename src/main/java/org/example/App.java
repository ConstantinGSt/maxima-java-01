package org.example;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		int firstVar = 10;
		int secondVar = 15;
		System.out.println("firstVar = " + firstVar);
		System.out.println("secondVar = " + secondVar);

		int tempVar = secondVar;
		secondVar = firstVar;
		firstVar = tempVar;
		System.out.println("firstVar = " + firstVar);
		System.out.println("secondVar = " + secondVar);

		// fibonazzi recursion
		System.out.println(fibonazzi((byte) 50));
	}

	public static long fibonazzi(byte N) {
		if (N == 0) {
			return 0;
		} else if (N == 1) {
			return 1;
		} else {
			return fibonazzi((byte) (N - 1)) + fibonazzi((byte) (N - 2));
		}
	}
}
