/**
 * 
 */
package com.gqt.corejava.patternsnew;
import java.util.Scanner;
/**
 * 
 */
public class Alphabetpattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
	//Alphabet A
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || j==(n-1) ||
				   i==(n/2)) 
				{
					System.out.print("A ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Alphabet B
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1) || j==0 || j==(n-1) ||
				   i==(n/2)) 
				{
					System.out.print("B ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Alphabet C
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1) || j==0 ) 
				{
					System.out.print("C ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
  //Alphabet D
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1) || j==0 || j==(n-1) ) 
				{
					System.out.print("D ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Alphabet E 
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1) || j==0 || i==(n/2) ) 
				{
					System.out.print("E ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Alphabet F
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==(n/2) ) 
				{
					System.out.print("F ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Alphabet G
			for(int j=0;j<n;j++) {
				if(i==0 ||i==(n-1) || j==0 || i+j>(n-1)+(n/2) || i==(n/2)&&i+j>=(n-1))
				{
					System.out.print("G ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Alphabet H
			for(int j=0;j<n;j++) {
				if(j==0 ||j==(n-1) || i==(n/2))
				{
					System.out.print("H ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Alphabet I
			for(int j=0;j<n;j++) {
				if(i==0 ||i==(n-1) || j==(n/2))
				{
					System.out.print("I ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Alphabet J
			for(int j=0;j<n;j++) {
				if(i==0 ||i==(n-1)&& i+j<(n-1+(n/2)) || j==(n/2))
				{
					System.out.print("J ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Alphabet K
			for(int j=0;j<n;j++) {
				if(j==0 || i+j==(n/2) || i-j==(n/2) )
				{
					System.out.print("K ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
	//Alphabet L
			for(int j=0;j<n;j++) {
				if(j==0 || i==(n-1) )
				{
					System.out.print("L ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Alphabet M
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n-1) || i==j&&i<=(n/2) || i+j==(n-1) && i<=(n/2))
				{
					System.out.print("M ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Alphabet N
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n-1) || i==j )
				{
					System.out.print("N ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Alphabet O
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n-1) || i==(n-1) || i==0 )
				{
					System.out.print("O ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Alphabet P
			for(int j=0;j<n;j++) {
				if(j==0  || i==(n/2) || i==0 || j==(n-1)&&i<(n/2) )
				{
					System.out.print("P ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Alphabet Q
			for(int j=0;j<n;j++) {
				if(j==0  || i==(n-1) || i==0 || j==(n-1) || i==j&&i>=(n/2))
				{
					System.out.print("Q ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Alphabet R
			for(int j=0;j<n;j++) {
				if(j==0 || i==0 || i==(n/2) || j==(n-1) && i<=(n/2) || i==j && j>=(n/2))
				{
					System.out.print("R ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Alphabet S
			for(int j=0;j<n;j++) {
				if( i==0 || i==(n/2) ||i==(n-1)||j==0&&i<=(n/2)||j==(n-1)&&i>=(n/2)) 
				{
					System.out.print("S ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Alphabet T
			for(int j=0;j<n;j++) {
				if( i==0 || j==(n/2)) 
				{
					System.out.print("T ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Alphabet U
			for(int j=0;j<n;j++) {
				if( j==0 || i==(n-1)||j==(n-1)) 
				{
					System.out.print("U ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Alphabet V
			for(int j=0;j<n;j++) {
				if( i-j==(n/2)|| i+j==(n-1)+(n/2)||j==0 &&i<=(n/2)|| j==(n-1)&&i<=2) 
				{
					System.out.print("V ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Alphabet W
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n-1)|| i+j==(n-1)&&i>=(n/2)||i==j&&i>=(n/2)) 
				{
					System.out.print("W ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Alphabet X
			for(int j=0;j<n;j++) {
				if( i+j==(n-1)||i==j) 
				{
					System.out.print("X ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Alphabet Y
			for(int j=0;j<n;j++) {
				if( i+j==(n-1)&&i<=(n/2)||i==j&&i<=(n/2)||j==(n/2)&&i>=(n/2)) 
				{
					System.out.print("Y ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
	//Alphabet Z
			for(int j=0;j<n;j++) {
				if( i==0||i+j==(n-1)||i==(n-1)) 
				{
					System.out.print("Z ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			System.out.println();
		}

	}

}
