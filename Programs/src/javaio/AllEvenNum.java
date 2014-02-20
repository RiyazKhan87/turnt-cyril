/**
 * 
 */
package javaio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Mohamed
 * 
 */
public class AllEvenNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//This method will list out all even numbers between two numbers 


		try {
			BufferedReader br1 = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Enter Number");
			int num = Integer.parseInt(br1.readLine());
			System.out.println("Even number : ");
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 0) {
					System.out.println(i + ",");
				}
			}
		} catch (Exception e) {
		}
	}
}
