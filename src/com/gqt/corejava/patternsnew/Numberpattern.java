/**
 * 
 */
package com.gqt.corejava.patternsnew;

import java.util.Scanner;

/**
 * 
 */
public class Numberpattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
	//Number pattern 0
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0|| j==0||j==(n-1)  || i==(n-1) ) 
				{
					System.out.print("0 ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Number pattern 1
			for(int j=0;j<n;j++) {
				if(i+j==(n/2) || j==(n/2) || i==(n-1) ) 
				{
					System.out.print("1 ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Number pattern 2
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n/2) || j==0 && i>=(n/2)|| i==(n-1) || j==(n-1)&&i<(n/2)) 
				{
					System.out.print("2 ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Number pattern 3
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n/2) ||  i==(n-1) || j==(n-1)) 
				{
					System.out.print("3 ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Number pattern 4
			for(int j=0;j<n;j++) {
				if(i+j==(n/2)|| j==(n/2) ||  i==(n/2) ) 
				{
					System.out.print("4 ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Number pattern 5
			for(int j=0;j<n;j++) {
				if( i==0 || i==(n/2) ||i==(n-1)||j==0&&i<=(n/2)||j==(n-1)&&i>=(n/2)) 
				{
					System.out.print("5 ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Number pattern 6
			for(int j=0;j<n;j++) {
				if( i==0 || i==(n/2) ||i==(n-1)||j==0 ||j==(n-1)&&i>=(n/2)) 
				{
					System.out.print("6 ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Number pattern 7
			for(int j=0;j<n;j++) {
				if( i==0 || j==(n-1)) 
				{
					System.out.print("7 ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Number pattern 8
			for(int j=0;j<n;j++) {
				if( i==0 || j==(n-1)||i==(n-1)||j==0||i==(n/2)) 
				{
					System.out.print("8 ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Number pattern 9
			for(int j=0;j<n;j++) {
				if( i==0 || j==(n-1)||i==(n-1)||j==0&&i<=(n/2)||i==(n/2)) 
				{
					System.out.print("9 ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			System.out.println();
	}

}}
