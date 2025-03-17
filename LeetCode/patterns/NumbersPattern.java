package patterns;

import java.util.Scanner;

public class NumbersPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N : ");
		int n= s.nextInt();
		for(int i = 1;i<=(n*2)-1;i++) {
			for(int j=1;j<=(n*2)-1;j++) {
				int top=i,down=(n*2)-i,left =j, right=(n*2)-j;
			int mins= Math.min(Math.min(top,down),Math.min(left,right));
			System.out.print(mins+" ");
			}
			System.out.println("");
		}
		s.close();
	}

}
