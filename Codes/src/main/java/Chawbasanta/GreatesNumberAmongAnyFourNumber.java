package Chawbasanta;

import java.util.Scanner;
//Find the greatest number among four numbers without using any logical operators.
public class GreatesNumberAmongAnyFourNumber {
//The Program IS Codeed BY Basanta Chaw
	// Wap to find largest Number Among $ numbers without logical operator
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		int large = 0;
		int[] arr = new int[10];
		System.out.print("How many numbers are there : ");
		num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > large) {
				large = arr[i];
			}

		}
		System.out.print("THe LArgest Number IS : " + large);
	}

}
