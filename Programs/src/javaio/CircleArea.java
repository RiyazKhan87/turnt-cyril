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
public class CircleArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//This method will calculate the area of a circle
		
		int r = 0;
		try {
			BufferedReader br1 = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Enter radius of circle");
			r = Integer.parseInt(br1.readLine());
			double area = java.lang.Math.PI * r * r;
			System.out.println("Area of Circle : " + area);
			double perimeter = 2 * java.lang.Math.PI * r;
			System.out.println("Parameter of Circle : " + perimeter);
		} catch (Exception e) {
			System.out.println("Error : " + e);
		}
	}
}