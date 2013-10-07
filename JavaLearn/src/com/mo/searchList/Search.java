package com.mo.searchList;
/**
 * 列表的二分查找操作
 */

public class Search {
	public static void main(String[] args) {
		int[] list = {3,5,7,12,23,34,56,78};
		int data = find(list, 78);
		System.out.println(data);
	}
	public static int find(int[] list,int findData){
		int low = 0;
		int hight = list.length-1;
		
		while(low<=hight){
			int middle = (low+hight)/2;
			int middleData = list[middle];
			if(middleData==findData){
				return middle;
			}else if(findData>middleData){
				low = middle + 1;
			}else{
				hight = middle -1;
			}
			
		}
		return -1;
	}
	
}
