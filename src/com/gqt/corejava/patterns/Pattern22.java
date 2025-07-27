package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter the count");
	     int n=sc.nextInt();
	    
	     for(int i=1;i<=n;i++) {
	    	 for(int j=1;j<=n;j++) 
	    		 System.out.print("-");
	    	 
	    		 for(int j1=1;j1<=n;j1++) 
	    			 System.out.print("@");	
	  
	    		 
	    	 
	    	 System.out.println();
	}

}
}