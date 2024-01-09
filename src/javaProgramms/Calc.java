package javaProgramms;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// To be able to provide input through output console
		
		int a,b,c,d;
		System.out.println("Enter the numbers");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("Enter next element");
		b = sc.nextInt();
		System.out.println("Enter next element");
		c = sc.nextInt();
		System.out.println("Now do the addition and the result is below");
		d = a+b+c;
		
		System.out.println("The addition is " + d);
		
		int res = c-b-a;
		System.out.println("The subs rest is "+ res);

		

	}

}
