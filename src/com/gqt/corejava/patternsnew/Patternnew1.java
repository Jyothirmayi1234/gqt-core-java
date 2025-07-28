/**
 * 
 */
package com.gqt.corejava.patternsnew;

import java.util.Scanner;

/**
 * # # # # #
   # - - - #
   # - - - #
   # - - - #
   # - - - #
  */
/**
 * @author JYOTHIRMAYI
 * @category Patternnew1
 * @description this is an example for conditional statements
 * 
 */

public class Patternnew1 {

	/**
	 * @param args
	 * @description this is source code of program
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the size");
int n=sc.nextInt();
for(int i=0;i<=n-1;i++) {
	for(int j=0;j<=n-1;j++) {
 		if(i==0 || i==(n-1) ||j==0 || j==(n-1)) {
 			System.out.print("# ");
}
	else {
		System.out.print("- ");
		
	}
}
System.out.println();

	}
	}

}
