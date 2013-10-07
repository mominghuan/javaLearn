package com.mo.Mathematics;
/**
 * ≤Â»Î≈≈–Ú∑®
 * @author mo
 *
 */
public class InsertMathematics {

	public static void main(String[] args) {
		int[] list = {3,6,1,45,7,32,87,12,90,13,48};
		sort(list);
		for(int i:list){
			System.out.println(i);
		}
	}
	public static void sort(int[] list){
		for (int i = 1; i < list.length; i++) {
			int currentData = list[i];
			int temp = i;
			while(temp>0 && list[temp-1]>currentData){
				list[temp] = list[temp-1];
				temp--;
			}
			list[temp] = currentData;
		}
		
		
	}
}
