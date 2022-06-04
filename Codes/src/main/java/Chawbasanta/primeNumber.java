package Chawbasanta;
//Write a program to display prime numbers from 1 to 100.
public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, chk;

		System.out.println("---Prime Numbers from 1 to 100---");
		for (i = 2; i <= 100; i++) {
			chk = 0;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					chk++;
					break;
				}
			}
			if (chk == 0)
				System.out.println(i);
		}
	}

}
