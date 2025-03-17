package patterns;

import java.util.Scanner;

public class Xpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N : ");
		int n= s.nextInt();
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j||j==n-i+1) {
					System.out.print(i+"");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		s.close();
	}

}
