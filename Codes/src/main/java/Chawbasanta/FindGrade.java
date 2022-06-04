package Chawbasanta;

import java.util.Scanner;
//The Program IS Coded By Basanta CHaw
//Write a program using if else as well as switch to print grades of students.
//Condition: Below 40 is considered as fail, 40 -50 as third division, 50-60 as second division, 60-80 as first division and 80 above distinction. 

public class FindGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float marks;
		char Grade = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ënter Your Obtained Marks : ");
		marks = sc.nextFloat();
		if (marks >= 80 && marks <= 100) {
			Grade = 'A';
		} else if (marks >= 60 && marks <= 80) {
			Grade = 'B';
		} else if (marks >= 50 && marks <= 60) {
			Grade = 'C';
		} else if (marks >= 40 && marks <= 50) {
			Grade = 'D';
		} else if (marks <= 40) {
			Grade = 'E';
		}
		switch (Grade) {
		case 'A':
			System.out.print("You Have Passed With Distinction ! ");
			break;

		case 'B':
			System.out.print("You Have Passed With First Division ! ");
			break;
		case 'C':
			System.out.print("You Have Passed With Second Division ! ");
			break;
		case 'D':
			System.out.print("You Have Passed With Third Division ! ");
			break;
		case 'E':
			System.out.print("You are   Failed  Plz Try again ! ");
			break;

		}

	}

}
