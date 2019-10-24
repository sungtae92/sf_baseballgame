package com.cho.bbg;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final int NO_COUNT = 3;

		int[] randomNoArray = new int[NO_COUNT];
		int[] userNoArray = new int[NO_COUNT];

		// 0 ~ 0.9999999999

		for (int i = 0; i < NO_COUNT; i++) {
			int randomValue = (int) ((Math.random() * 9) + 1);
			for (int j = 0; j < i + 1; j++) {
				if (randomNoArray[j] == randomValue) {
					i--;
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

		for (int item : randomNoArray) {
			System.out.println(item);
		}
		System.out.println();

		while (true) {
			for (int i = 0; i < NO_COUNT; i++) {
				System.out.printf("값을 입력하세요 : ");
				userNoArray[i] = scan.nextInt();
				if (userNoArray[i] > 9 || userNoArray[i] < 1) {
					i--;
				}
			}

			int s = 0, b = 0;

			for (int i = 0; i < NO_COUNT; i++) { // 랜덤
				for (int z = 0; z < NO_COUNT; z++) { // 사용자입력
					if (randomNoArray[i] == userNoArray[z]) {
						if (i == z) {
							s++;
						} else {
							b++;
						}
					}
				}
			}
			System.out.printf("S : %d, B : %d, O : %d\n", s, b, NO_COUNT - (s + b));

			if (s == NO_COUNT) {
				System.out.println("-- 게임 종료 - -");
				break;
			}
		}
		scan.close();

	}
}
