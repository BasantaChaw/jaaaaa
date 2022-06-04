package Chawbasanta;

import java.util.Scanner;

//WAP to check whether a person is eligible to enter a club.
public class Club {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("Enter Your Age : ");
		age=sc.nextInt();
		if (age>=16 && age<=45) {
			System.out.print("Welcome To The PArty !");
		}else {
			System.out.print("You are not eligible to enjoy the party !");

		}
	}

}
