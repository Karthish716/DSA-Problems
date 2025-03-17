package binarySearchProblems;

public class Search2Dmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

	
	public static boolean searchmat(int[][] nums,int target) {
		int r=0;
		int c=nums.length-1;
		
		while(r<nums.length && c>=0) {
			if(nums[r][c]==target) {
				return true;
			}
			else if(nums[r][c]<target) {
				r++;
			}
			else {
				c++;
			}
		}
		return false;
	}
}
