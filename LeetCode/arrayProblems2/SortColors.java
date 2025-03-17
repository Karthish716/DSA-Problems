package arrayProblems2;

public class SortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 SortColors s = new  SortColors();
         int nums[] = {2,1,2,0,1,0,2,2,0,0,1,1};
         int nums2[]=s.Sortcolor(nums);
         for(int i =0;i<nums2.length;i++) {
        	 System.out.print(nums[i]);
         }
         
	}
	
	
  public int[] Sortcolor(int[] nums) {
	  
	  int low=0,mid=0,high=nums.length-1;
	  while(mid<=high) {
		  if(nums[mid]==0) {
			  int temp= nums[low];
			  nums[low]=nums[mid];
			  nums[mid]=temp;
			  mid++;
			  low++;
		  }
		  else if(nums[mid]==2) {
			  int temp=nums[high];
			  nums[high]=nums[mid];
			  nums[mid]=temp;
		      high--;
		  }
		  else {
			  mid++;
		  }
	  }
	  return nums;
  }

}
