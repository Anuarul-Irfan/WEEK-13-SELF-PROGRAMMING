package method;

import java.util.Scanner;
public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		int y = 6;
		
		System.out.println("Introduction for Method");
		showMessage(); //call method
		System.out.println("Hello Jitra");
		showMessage1();
		showMessage("Azman");
		showMessage(5);
		showMessage("Shenhe",7);
		showMessage(x,y);
		int total = showSum(6,7);
		System.out.println("Total is "+ total);
		int avg = total/2;
		System.out.println("Average is "+ avg);
		double total2 = showSum(3.4, 10.6);
		System.out.println("Total2 of Double "+ total2);
		double avg2 = total2/2;
		System.out.println("Average2 is "+avg2);
		int total3 = showSum();
		System.out.println("Total3 is "+total3);
		double total4 = showSumDouble();
		System.out.println("Total4 is "+total4);
	} //main method
	
	public static void showMessage() {
		System.out.println("Hello Malaysia");
	}
	
	public static void showMessage1() {
		System.out.println("Hello UUM");
	}
	
	public static void showMessage(String name) {
		System.out.println("Name is "+name);
	}
	
	public  static void showMessage(int num) {
		System.out.println("Number is "+num);
	}
	
	public static void showMessage(String name, int num) {
		System.out.println("Name is "+name +" number is "+num);
		for (int i = 0; i < num; i++) {
			System.out.println("Name is "+name);
		}
	}
	
	public static void showMessage(int a, int b) {
		int sum = 0;
		System.out.println("First num is "+a);
		System.out.println("Second num is "+b);
		sum = a + b;
		System.out.println("Sum is "+sum);
	}
	
	public static int showSum(int a, int b) {
		int c = 0;
		c = a + b;
		return c;
	}
	
	public static double showSum(double a, double b) {
		double c = 0;
		c = a + b;
		return c;
	}
	
	public static int showSum() {
		int total = 0;
		int num [] = new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five number: ");
		for (int i = 0; i < num.length; i++) {
			 num [i] = sc.nextInt();
			 total = total + num [i];
		}
		return total;
		
	}
	
	public static double showSumDouble() {
		double sum = 0;
		double num [][] = new double [2][2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter four number: ");
		for (int i = 0; i < num.length; i++ ) {
			for (int y = 0; y < num.length; y++) {
				num [i][y] = sc.nextDouble();
				sum = sum + num [i][y];
		}
	  }
	  return sum;

	}
}
