package binarySearchProblems;

public class FindPeakElement2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int[][] arr= {{1,2,5,1,4,5},{2,9,3,2,3,2},{1,7,6,0,1,3},{3,6,2,3,7,2}};
         int[] a = peaks(arr);
         for(int i = 0;i<a.length;i++) {
        	 System.out.println(a[i]);
         }
	}

	
	public static int[] peaks(int[][] nums) {
		int n = nums.length;
		int m = nums[0].length;
		
		int s=0; int e=m-1;
		while(s<=e) {
			int mid = (s+e)/2;
			int maxRowindex= findmaxindex(nums,n,m,mid);
			int left = mid-1>=0 ? nums[maxRowindex][mid-1] : -1;
			int right = mid+1 <m ? nums[maxRowindex][mid+1] : -1;
			
			if(nums[maxRowindex][mid]>left && nums[maxRowindex][mid] > right) {
				return new int[]{maxRowindex,mid};
			}
			else if(nums[maxRowindex][mid]<left) {
				e= mid-1;
			}
			else {
				s=mid+1;
			}
		}
		return new int[]{-1,-1};
	}
	
	public static int findmaxindex(int[][] arr,int n, int m , int col) {
		int maxval=-1;
		int index=-1;
		for(int i=0;i<n;i++) {
			if(arr[i][col]>maxval) {
				maxval = arr[i][col];
				index=i;
			}
		}
		return index;
	}
	
}
