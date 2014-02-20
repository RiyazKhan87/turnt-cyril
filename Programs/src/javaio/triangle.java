package javaio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class triangle {

	public static void main(String[] args) {
		// This lesson in Java programming will teach you the coding for
		// constructing a shape of triangle by using '*'. First of all make a
		// class named 'triangle' under the Java I/O package and as we have to
		// use the Buffer class, the application of all try and catch block is
		// important for avoiding any kind of error. After creating
		// BufferedReader object and input stream reader define an integer 'a'
		// and apply parseInt method for the conversion of string into integer.
		// Now apply the for loop and define an integer 'i' and it should be
		// either less than or equal to the integer "a" (the input number).
		// Again define another integer type variable "j" in another for loop.
		// Here in the second for loop "j" the number of times we have to print
		// *.
		// Now compile and run the program and insert any number on your command
		// window and surely you will get a triangle shape with star *. You can
		// take any other object instead of *.

		try {
			BufferedReader object = new BufferedReader

			(new InputStreamReader(System.in));

			System.out.println("enter the number");

			int a= Integer.parseInt(object.readLine());

			for (int i =1; i<a; i++) {

				for (int j=1; j<=i;j++) {

					System.out.println("*");

				}

				System.out.println("");

			}
		}

		catch (Exception e) {
		}

	}
}
