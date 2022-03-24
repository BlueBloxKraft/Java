import java.util.Scanner;

public class SimpleCalculator {

	static Scanner s = new Scanner(System.in);
	static String[] eq = {
			"add",
			"subtract",
			"multiply",
			"divide"
	};
	
	public static void main(String[] args) {
		startup();
		calculate();
	}
	
	private static void startup() {
		System.out.println("These are the possible equations you can use:");
		for(int i = 0; i < eq.length; i++) {
			System.out.println(eq[i]);
		}
	}
	
	private static void calculate() {
		
		String success = "Your answer is: ";
		String str = getUserString();
		
		System.out.println("Give me the first number!");
		int a = s.nextInt();
		
		System.out.println("Give me the second number!");
		int b = s.nextInt();
		
		
		if(str.equals(eq[0])) {
			System.out.println(success + (a + b));
		}
		
		if(str.equals(eq[1])) {
			System.out.println(success + (a - b));
		}
		
		if(str.equals(eq[2])) {
			System.out.println(success + (a * b));
		}
		
		if(str.equals(eq[3])) {
			System.out.println(success + (a / b));
		}
		
	}
	
	private static String getUserString() {
		String somename = null;
		String str = s.nextLine();
		
		for(int i = 0; i < eq.length; i++) {
			if(str.equals(eq[i])) {
				somename = eq[i];
				System.out.println("Give me two numbers to " + eq[i] + "!");
				System.out.println("-------------------------------------");
			}
		}
		return somename;
	}
	
}
