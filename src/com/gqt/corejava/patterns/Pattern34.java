package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count");
		int n=sc.nextInt();
	  char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print((char)('A' +k ));
		
			}
			for(int l=0;l<i-1;l++) {
				System.out.print((char)('A'+l));
			
			}
			
			
			System.out.println();
		
}
	}

}
