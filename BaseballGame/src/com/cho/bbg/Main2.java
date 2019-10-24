package com.cho.bbg;

import java.util.Scanner;

public class Main2 {
	final static int NO_COUNT = 3;
	
	public static void setRandomArray(int[] array) {
		for (int i = 0; i < NO_COUNT; i++) {
			int randomValue = (int) ((Math.random() * 9) + 1);
			for (int j = 0; j < i + 1; j++) {
				if (array[j] == randomValue) {
					i--;
					break;
				} 
				else if (array[j] == 0) {
					array[j] = randomValue;
					break;
				}
			}
		}
	}
	
	public static void setUserArray(Scanner scan, int[] userNoArray) {
		for (int i = 0; i < NO_COUNT; i++) {
			System.out.print("값을 입력하세요 : ");
			userNoArray[i] = scan.nextInt();
			if (userNoArray[i] > 9 || userNoArray[i] < 1) {
				i--;
			}
		}
	}
	
	public static int checkFinish(int[] randomNoArray, int[] userNoArray) {
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
		
		return s;
	}
	
	
	
	
	public static void main(String[] args) {
		

		int[] randomNoArray = new int[NO_COUNT];
		int[] userNoArray = new int[NO_COUNT];

		setRandomArray(randomNoArray);
		
		
		
		// 콘솔에서 값을 입력받기 위한 객체

		Scanner scan = new Scanner(System.in);
		

		for (int item : randomNoArray) {
			System.out.println(item);
		}
		System.out.println();

		while (true) {
			setUserArray(scan, userNoArray);
			int s = checkFinish(randomNoArray, userNoArray);
			

			if (s == NO_COUNT) {
				System.out.println("-- 게임 종료 - -");
				break;
			}
		}
		scan.close();

	}
	
}
