package patterns;

import java.util.Scanner;

public class Patterns0s1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N : ");
		int n= s.nextInt();
		int pt = 1;
		for(int i=1;i<=n;i++) {
			pt = i%2==0? 0 : 1;
			for(int j =1; j<=i;j++) {
				System.out.print(pt+" ");
			  pt= pt==0? 1:0;
			}
			System.out.println("");
		}
		s.close();
	}

}
