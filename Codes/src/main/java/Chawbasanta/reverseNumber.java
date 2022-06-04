package Chawbasanta;

import java.util.Scanner;
//WAP to reverse a given number.  
public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter an integer number:");
		int number = new Scanner(System.in).nextInt();
		int reverse = 0;
		int tempNumber = number;
		while (number > 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}

		System.out.print("The reverse of the given number is = " + reverse);

	}

}
