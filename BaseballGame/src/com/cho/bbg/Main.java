package com.cho.bbg;

public class Main {
	public static void main(String[] args) {
		final int NO_COUNT = 3;
		
		int[] randomNoArray = new int[NO_COUNT];
		int[] userNoArray = new int[NO_COUNT];
		
		// 0 ~ 0.9999999999
		
		
		for(int i = 0; i < randomNoArray.length; i++) {
			int randomValue = (int)((Math.random() * 9) + 1);
			for(int j = 0; j < i+1; j++) {
				if(randomNoArray[j] == randomValue) {
					j--;
					break;
				}
				else if(randomNoArray[j] == 0) {
					randomNoArray[j] = randomValue;
					break;
				}
				
			}
		}
		
	}
}
