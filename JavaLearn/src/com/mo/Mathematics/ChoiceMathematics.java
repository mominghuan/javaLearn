package com.mo.Mathematics;
/**
 * ѡ���㷨
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
	//��������
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
	 * ð������
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
	 * �ݹ�
	 * @param list
	 * @param index
	 */
	public static void sort(int[] list,int index) {
		if(index>=list.length){
			return;
		}
		//��ʼһ��ֵ
		int start = list[index];
		int flag = -1;
		for (int i = index+1; i < list.length; i++) {
			if(start<list[i]){//�������ʼֵ�������е�����Ԫ�ضԱȣ�
				//Ȼ��ó�����������ֵ��������start��ͬʱ��¼���ֵ���±�
				start = list[i];
				flag = i;
			}
		}
		if(flag!=-1){
			int temp = list[index];
			list[index] = list[flag];//�����ֵ���ڳ�ʼֵ��λ���ϣ����Ｔ�ǵ�һλ
			list[flag] = temp;
		}
		index++;
		sort(list,index);
		
	}

}
