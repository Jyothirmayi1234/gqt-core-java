package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count");
		int n=sc.nextInt();
	  char ch='A';
	 
		for(int i=0;i<=n;i++) {
			 int a=2*i;
			for(int j=n-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=a;k>=0;k--) {
				System.out.print((char)('A' + k) );
			
			
			}
			
			
			System.out.println();
	}}

}
