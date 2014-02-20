// @ author: Mohamed Khan
public class leapyears {

	public static void main(String[] args) {
		// This method determines leapyears between year 0-2014 
		int n;
		int i= 2014;
		for (n=0; n<=i; n++){
		
		int l = n%4;

		if (l == 0) {
			System.out.println("Leap year:" + n);

		}

	}

}
}