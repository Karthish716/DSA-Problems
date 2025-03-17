package patterns;

import java.util.Scanner;

public class TriangleSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N : ");
		int n= s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int sp=1;sp<=n-i;sp++) {
				System.out.print("  ");
			}
			
			for(int star=1;star<=2*i-1;star++) {
				if(star==1||star==2*i-1||i==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}

}
