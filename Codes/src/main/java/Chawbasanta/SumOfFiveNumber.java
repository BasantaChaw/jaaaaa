package Chawbasanta;
//Write a program to find the sum of 5 integers using for loop.
import java.util.Scanner;

public class SumOfFiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for Sum : ");
        num=sc.nextInt();
        for(int i=0;i<num;i++) {
        	sum+=i;
        }
        System.out.print("THe Sum Of Number IS : "+sum);
	}

}
