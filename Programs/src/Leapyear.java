import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Leapyear {

	public static void main(String[] args) {
		// This method let's you determine Leap Year

		try {
			BufferedReader br1 = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Enter Year");
			int num = Integer.parseInt(br1.readLine());
			if (num % 4 == 0) {
				System.out.println("The given year is leap");
			} else {
				System.out.println("This is not a leap year");
			}

		} catch (Exception e) {
		}
	}
}
