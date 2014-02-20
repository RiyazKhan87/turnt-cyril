package javaio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Alloddnumbers {

	public static void main(String[] args) {
		// This method will list all odd numbers between two numbers
		try {
			BufferedReader br1 = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Enter Number");
			int num = Integer.parseInt(br1.readLine());
			System.out.println("Odd Number : ");
			for (int i = 1; i <= num; i++) {
				if (i % 2 != 0) {
					System.out.println(i + ",");
				}
			}
		} catch (Exception e) {
		}
	}
}
