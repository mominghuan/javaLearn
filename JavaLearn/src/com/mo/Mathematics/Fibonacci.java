package com.mo.Mathematics;

public class Fibonacci {

	
	public static void main(String[] args) {
		System.out.println(func(8));
		for (int i = 1; i < 100; i++) {
			System.out.print(func2(i) + " ");
		}
		
	}
	public static int func(int n){
		if(n<0){
			return 0;
		}
		int x=1,y=1,temp = 0;
		for (int i = 3; i <= n; i++) {
			temp = x + y;
			x = y;
			y = temp;
		}
		return temp;
	}
	
	public static int func2(int n){
		if(n<1){
			return 0;
		}
		if(n==1 || n==2){
			return 1;
		}else{
			return func2(n-1) + func2(n-2);
		}
	}

}
