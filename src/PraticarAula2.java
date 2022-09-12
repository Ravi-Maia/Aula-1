import java.util.Scanner;
/**
 * 
 * @author Ravi
 * @see System#in
 */
public class PraticarAula2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many miles did you drive today?");
		double miles = scanner.nextDouble();
		
		System.out.println("Today's milage: " + miles);
		
		boolean overMiles = miles >= 100;
		//boolean bellowMiles = miles < 100;
		
		double overBy = miles - 100.0;
		double underBy = 100.0 - miles;
		
		if(overMiles) {
			System.out.println("you are over the limit by " + overBy);
		} else {
			System.out.println("you are under the limit by " + underBy);
		}
		
		scanner.close();
		
		int i = 10;
		
		if(i % 1 == 0) {
			System.out.println("Divisible by 10");
	
		}
	
		int aNum = 2;
		int aNumBox = aNum++;
		System.out.println(aNum + " " + aNumBox);
		
		for(int z = 0; z < 10; ++z) {
			System.out.println(z);
		}
		
		//Casting
		
		int in_t = 257;
		int in_t2;
		byte b;
		double dou = 22.222; 
		b = (byte) in_t;
		in_t2 = (int) dou; 
		System.out.println("int into byte: " + b); //remainder of division of 257 and 256 (range of a byte)
		System.out.println("int into byte: " + in_t2); //fractional component is lost
	
		//Type Promotion Rules
		
		double ar;
		double ab = 2.22;
		int arr = 2;
		
		ar = ab * arr;
		System.out.println(ar);
	}
}
