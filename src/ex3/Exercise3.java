package ex3;

import java.util.Scanner;

public class Exercise3 {
	@Deprecated
	public static boolean cardNumber(String card) {
		try {
		String []s = card.replace(" ","").split("");
		int sum = 0;
		for(String t:s) {
			sum+= Integer.parseInt(t);
		}
		if(sum%2==0) {
			return true;
		}
		}
		catch(Exception ex) {
			System.out.print(ex);
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Input string: ");
		String card = sc.next();
		System.out.print(cardNumber(card));
	}
	
}
