package com.cho.bbg.oop;

public class Numbers {
	public final int NO_COUNT;
	private int[] array;
	
	public Numbers(int no_count) {
		NO_COUNT = no_count;
		array = new int[no_count];
	}

	// true 중복값 없음, false 중복값 있음
	public boolean insertValue(int number) {
		boolean result = false;
		for(int i =0; i <array.length; i++) {
			if(array[i] == 0) {
				array[i] = number;
				break;
			}
			else if(array[i] == number) {
				result = false;
				break;
			}
		}
		return result;
	}
	
	public int[] getArray() {
		return array;
	}
	
	
}
