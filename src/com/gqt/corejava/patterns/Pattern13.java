package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count");
		int n=sc.nextInt();
		int a;
		for(int i=1;i<=n;i++) {
		a=i;
			for(int j=1;j<=n;j++) {
				System.out.print(a+ " ");
				a=a+n;
			}
		
			System.out.println();


	}

}
}
