package leetcoss;

public class SearchDmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr= {{1,2,3,5},{10,11,16,20},{23,30,34,60}};
		boolean a = searchMatrix(arr,11);
		System.out.println(a);
	}

	  public static boolean searchMatrix(int[][] matrix, int target) {
	      boolean ans = false;  
		  for(int i=0;i<matrix.length;i++) {
	        ans=search(matrix[i],target);
	    	if(ans==true) {
	    	  return ans;
	    	}
	        }
		  return ans;
	    }
	  public static boolean search(int[] nums,int target) {
			
			int s =0;
			int e = nums.length-1;
			
			
			while(s<=e) {
				int mid = (e+s)/2;
				if(target>nums[mid]) {
					s=mid+1;
				}
				else if(target<nums[mid]) {
					e=mid-1;
				}
				else {
					return true;
				}
			}
		 return false;
		}
	
}
