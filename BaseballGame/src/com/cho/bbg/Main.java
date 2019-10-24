package com.cho.bbg;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final int NO_COUNT = 3;

		int[] randomNoArray = new int[NO_COUNT];
		int[] userNoArray = new int[NO_COUNT];

		// 0 ~ 0.9999999999

		for (int i = 0; i < randomNoArray.length; i++) {
			int randomValue = (int) ((Math.random() * 9) + 1);
			for (int j = 0; j < i + 1; j++) {
				if (randomNoArray[j] == randomValue) {
					j--;
					break;
				} else if (randomNoArray[j] == 0) {
					randomNoArray[j] = randomValue;
					break;
				}

			}
		}
		// 콘솔에서 값을 입력받기 위한 객체

		Scanner scan = new Scanner(System.in);
		/*
		 * int value1 = scan.nextInt(); System.out.println("value1 : " + value1);
		 * 
		 * int value2 = scan.nextInt(); System.out.println("value2 : " + value2);
		 * 
		 * scan.close();
		 */
		for (int i = 0; i < NO_COUNT; i++) {
			System.out.printf("%d번 값을 입력하세요 : ", i + 1);
			userNoArray[i] = scan.nextInt();
			if (userNoArray[i] > 9) {
				i--;
			}
		}
		System.out.println(userNoArray[0]);
		System.out.println(userNoArray[1]);
		System.out.println(userNoArray[2]);
	}
}
