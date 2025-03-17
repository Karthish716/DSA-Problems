package patterns;

import java.util.Scanner;

public class PatternsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N : ");
		int n= s.nextInt();
		for(int i = 1; i<=n;i++) {
			for(int space=1;space<=i-1;space++) {
				System.out.print("  ");
			}
			for(int star=1;star<=n-(i-1);star++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
