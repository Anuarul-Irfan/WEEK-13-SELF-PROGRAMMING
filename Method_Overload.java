package method;

import java.util.Scanner;
public class Method_Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = readAge();
		if (age <= 9) {
			System.out.println("Children Category");
		}
		else if (age <= 19) {
			System.out.println("Adolescent Category");
		}
		else {
			System.out.println("Adult Category");
		}

	}
	
	public static int readAge() {
		Scanner sc = new Scanner(System.in);
		int age = 0;
		do {
			System.out.println("Please enter your age (1 - 100): ");
			age = sc.nextInt();
		}
		while ((age < 1) || (age > 100));
		return age;
	}

}
