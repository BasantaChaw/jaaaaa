/**
 * 
 */
package Chawbasanta;

import java.util.Scanner;

/**
 * @author basanta Chaw Wap to find The Largest Number Among The Any Three
 *         Numbers Given From Users The Program IS Code By Basanta Chaw
 */
public class FindLargestNumAmong3Number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		System.out.print("Enter any Three Numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
//		if (num1 > num2) {
//			if (num1 > num3) {
//				System.out.print("The Largest Number Is : " + num1);
//			} else {
//				System.out.print("The L:argest Number Is : " + num3);
//			}
//		} else if (num2 > num3) {
//			System.out.print("The Largest Number Is : " + num2);
//		} else {
//			System.out.print("The Largest Number Is : " + num3);
//		}
		if ((num1 > num2 && num1 > num3)) {
			System.out.print("The Largest Number Is : " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.print("THe LArgest Number Is : " + num2);
		} else {
			System.out.print("The Largest Number Is : " + num3);
		}
	}

}
