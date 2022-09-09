package org.example;

import java.sql.SQLOutput;

/**
 * Hello world!
 *
 */
public class App {
	static int[] arr;
	public static void main(String[] args) {
		int num;
		arrayCreat(15);

		System.out.println(daysCount((byte) 9, 1324));
		System.out.println(isSimple(81));

	}
	public static byte daysCount(byte month, int year) {
		switch(month) {
			case 2:
				if((year % 4 == 0 && year % 100 != 100) || year % 400 == 0) {
					return 29;
				} return 28;
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			default:
				return 31;
		}
	}

	public static int isSimple(int n) {
		int minDevider = 0;
		int divider = 0;
		for(int i = 2; i <= n; i++) {
			if(n % i == 0) {
				divider++;
				if(minDevider == 0) {
					minDevider = i;
				}
			} else if(divider > 2) {
				return minDevider;
			}
		} return 0;
	}

	public static int[] arrayCreat(int num) {
		arr = new int [num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
		}  return arr;
	}
	public static byte maxDigitsSumPosition(int[] arr) {

	}
//		int firstVar = 10;
//		int secondVar = 15;
//		System.out.println("firstVar = " + firstVar);
//		System.out.println("secondVar = " + secondVar);
//
//		int tempVar = secondVar;
//		secondVar = firstVar;
//		firstVar = tempVar;
//		System.out.println("firstVar = " + firstVar);
//		System.out.println("secondVar = " + secondVar);
//
//		// fibonazzi recursion
//		System.out.println(fibonazzi((byte) 54));
//	}
//	public static long fibonazzi(byte N) {
//		return (N <= 1) ? N : fibonazzi((byte) (N - 1)) + fibonazzi((byte) (N - 2));
//	}
//	public static long fibonazzi(byte N) {
//		if (N == 0) {
//			return 0;
//		} else if (N == 1) {
//			return 1;
//		} else {
//			return fibonazzi((byte) (N - 1)) + fibonazzi((byte) (N - 2));
//		}

}
