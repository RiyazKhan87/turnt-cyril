package javaio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args) {
		//This method will determine whether the given number is palindrome or not. 

		try {
			BufferedReader object = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Enter Number");
			int num = Integer.parseInt(object.readLine());
			int n = num;
			int rev = 0;
			System.out.println("Number: ");
			System.out.println("" + num);
			for (int i = 0; i <= num; i++) {
				int r = num % 10;
				num = num / 10;
				rev = rev * 10 + r;
				i = 0;
			}
			System.out.println("After reversing the number: " + "");
			System.out.println("" + rev);
			if (n == rev) {
				System.out.println("Number is palindrome!");
			} else {
				System.out.println("Number is not palindrom!");

			}
		} catch (Exception e) {
			System.out.println("Out of range!");
		}
	}

}
