package com.mo.Mathematics;
/**
 * ѡ���㷨
 * @author mo
 *
 */
public class ChoiceMathematics {
	private static int[] list = {12,4,5,1,65,21,89,90,55,82,3};
	public static void main(String[] args) {
		sort(list,0);
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
	/**
	 * ˫��ѭ��
	 * @param list
	 */
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
