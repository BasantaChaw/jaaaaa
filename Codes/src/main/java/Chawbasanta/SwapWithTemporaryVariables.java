/**
 * 
 */
package Chawbasanta;

import java.util.Scanner;

/**
 * QN - 1
 * 
 * @author basanta Chaw
 * The Program Is Coded By Basanta Chaw
 * wap to swap to numbers using temporary variables
 */
public class SwapWithTemporaryVariables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Any Number : ");
		x=sc.nextInt();
		System.out.print("Enter Second Any Number : ");
        y=sc.nextInt();
		z=x;
		x=y;
		y=z;
		System.out.println("The Swapped Values are X=  "+x+"&  Y = "+y);
	}

}
