import java.util.Scanner;

public class JavaHypCalc {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first side");
		int a = scan.nextInt();
		
		System.out.println("Enter your second side");
		int b = scan.nextInt();
		
		System.out.println("The triangle's hypotenuse is " + (int) Math.sqrt((a * a) + (b * b)));
	}

}
