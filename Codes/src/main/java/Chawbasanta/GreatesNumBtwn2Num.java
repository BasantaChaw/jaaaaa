/**
 * 
 */
package Chawbasanta;

import java.util.Scanner;

/**
 * QN -2
 * 
 * @author basanta Chaw The Program Is Coded By Basanta Chaw wap to find
 *         Greatest Number Between 2 given Numbers from users
 */
public class GreatesNumBtwn2Num {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Two Numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if (num1 > num2) {
			System.out.println("The Greatest Number Is : " + num1);
		} else {
			System.out.println("The Greatest Number Is : " + num2);

		}

	}

}
