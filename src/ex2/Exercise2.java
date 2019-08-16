package ex2;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("String 1: ");
		String s1 = sc.next();
		System.out.print("String 2: ");
		String s2 = sc.next();
		try {
			Double d1 = Double.parseDouble(s1);
			Double d2 = Double.parseDouble(s2);
			System.out.println("Sum: "+(Double)(d1+d2));
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
