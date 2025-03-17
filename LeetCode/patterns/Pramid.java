package patterns;

import java.util.Scanner;

public class Pramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N : ");
		int n= s.nextInt();
		for(int i = 1; i<=n;i++) {
			for(int space = n;space>=i;space--) {
				System.out.print("  ");
			}
			for(int star=1;star<=i;star++) {
				System.out.print("* ");
			}
			for(int st=1;st<i;st++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
