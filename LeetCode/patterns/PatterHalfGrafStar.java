package patterns;

import java.util.Scanner;

public class PatterHalfGrafStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N : ");
		int n= s.nextInt();
		for(int i = 1;i<=n*2-1;i++) {
			int rowch = i>n ? (n*2)-i :i;
			for(int j = 1;j<=rowch;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
