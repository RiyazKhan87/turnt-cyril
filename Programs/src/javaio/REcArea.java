package javaio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class REcArea {

	public static void main(String[] args) {
		// This method calculates the area and perimeter of a rectangle 


		{

			int l = 0;

			int w = 0;

			try {

				BufferedReader br1 = new BufferedReader(new InputStreamReader(
						System.in));

				System.out.println("Enter length of rectangle : ");

				l = Integer.parseInt(br1.readLine());

				System.out.println("Enter width of rectangle :");

				w = Integer.parseInt(br1.readLine());

				int area = l * w;

				System.out.println("Area of Rectangle : " + area);

				int perimeter = 2 * (1 + w);

				System.out.println("Perimeter: " + perimeter);

			} catch (Exception e) {
				System.out.println("Error : " + e);

			}
		}

	}
}