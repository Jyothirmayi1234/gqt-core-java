package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k +" ");
			}
			for(int l=i-1;l>=1;l--) {
				System.out.print(l +" ");
			}
		System.out.println();
		}
		}

	}
	


