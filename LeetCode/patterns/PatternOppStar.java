package patterns;

import java.util.Scanner;

public class PatternOppStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N : ");
		int n= s.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		s.close();
	}

}
