package com.mo.Mathematics;
/**
 * 选择算法
 * @author mo
 *
 */
public class ChoiceMathematics {
	private static int[] list = {12,4,5,1,65,21,89,90,55,82,3};
	public static void main(String[] args) {
		sort3(list);
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
	//插入排序
	public static void sort3(int[] list){
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
	
	/**
	 * 冒泡排序
	 * @param list
	 */
	public static void sort2(int[] list){
		for (int i = list.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(list[j]>list[j+1]){
					int temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
	}
	public static void sort(int[] list) {
		for (int i = 0; i < list.length; i++) {
			
			for (int j = list.length-2; j >= i; j--) {
				if(list[j]>list[j+1]){
					int temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
	}
	/**
	 * 递归
	 * @param list
	 * @param index
	 */
	public static void sort(int[] list,int index) {
		if(index>=list.length){
			return;
		}
		//初始一个值
		int start = list[index];
		int flag = -1;
		for (int i = index+1; i < list.length; i++) {
			if(start<list[i]){//用这个初始值跟数组中的其它元素对比，
				//然后得出数组中最大的值，并赋给start，同时记录最大值的下标
				start = list[i];
				flag = i;
			}
		}
		if(flag!=-1){
			int temp = list[index];
			list[index] = list[flag];//把最大值放在初始值的位置上，这里即是第一位
			list[flag] = temp;
		}
		index++;
		sort(list,index);
		
	}

}
