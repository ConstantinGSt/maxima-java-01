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
		System.out.println(maxDigitsSumPosition(arr));

		System.out.println(daysCount((byte) 2, 1900));
		System.out.println(isSimple(111));

	}
	public static byte daysCount(byte month, int year) {
		switch(month) {
			case 2:
				if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
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
		int i=2;
		for(; i <= n; i++) {
			if ((n % i == 0) && (i < n)) {
				break;
			} else if((n % i == 0) && (i == n)) {
				return 0;
			}
		} return i;
	}

	public static int[] arrayCreat(int num) {
		arr = new int [num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
		}  return arr;
	}
	public static byte maxDigitsSumPosition(int[] arr) {
		int[] sum = new int[arr.length];
		int max = sum[sum.length-1];
		byte maxIndex = 0;
		for(int i = arr.length-1; i >=0 ; i--) {
			int tempNum = arr[i];
			while(tempNum > 0) {
				sum[i] += tempNum % 10;
				tempNum /= 10;
			}
			if(max < sum[i]) {
				max = sum[i];
				maxIndex = (byte) i;
			}
		}
		return maxIndex;
	}
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


