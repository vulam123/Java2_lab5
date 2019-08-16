package ex1;

import java.util.Scanner;

public class Exercise1 {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a= ");
		int a = sc.nextInt();
		System.out.print("b= ");
		int b = sc.nextInt();
		System.out.println("Căn bậc 2 của a= "+Math.sqrt(a));
		System.out.println("a^b= "+Math.pow(a, b));
		System.out.println("Max= "+Math.max(a, b));
		System.out.println("Min= "+Math.min(a, b));
	}
}
