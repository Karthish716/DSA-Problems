package leetco;


import java.util.Scanner;

public class DuplicateArrayRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s = new Scanner(System.in);
      // int n = s.nextInt();
       //int m = s.nextInt();
		int[][] arr = {{0,1}};
         setmatrix(arr);
		
          for(int i=0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			}
		
	}
	
	
	public static void setmatrix(int[][] nums){
		int col=1;
		for(int i=0;i<nums.length;i++) {
			for(int j = 0;j<nums[i].length;j++) {
				if(nums[i][j]==0) {
					nums[i][0]=0;
					if(j!=0) {
						nums[0][j]=0;
					}else {
						col=0;
					}
					
				}
			}
		}
		
		for(int i=1;i<nums.length;i++) {
			for(int j=1;j<nums[i].length;j++) {
				if(nums[i][j]!=0) {
					
					if(nums[0][j]==0||nums[i][0]==0) {
						nums[i][j]=0;
					}
					
				}
			}
		}
		
		int m=nums[0].length;
		if(nums[0][0]==0) {
			for(int j=0;j<m;j++) {
				nums[0][j]=0;
			}
		}
		if(col==0) {
			for(int i=0;i<nums.length;i++) {
				nums[i][0]=0;
		}
	}
	
	}
}
