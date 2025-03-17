package leetcoss;

public class Plusone {

	
	public int[] plusone(int[] nums) {
		int d = nums[nums.length-1]+1;
		
		
		if(d == 10) {
			int[] arr = new int[(nums.length)+1];
			
		     for(int i =0; i<arr.length-2;i++) {
		    	 arr[i]= nums[i];
		     }
			arr[arr.length-2]= 1;
			arr[arr.length-1]=0;
			return arr;
		}
		
		int[] arr = new int[nums.length];
		
		
		int i =0;
		while(i<nums.length-1) {
			arr[i] = nums[i];
			i++;
		}
		int temp = nums[i]+1;
	     if(temp == 10) {
	    	 
	    	 arr[i++]=1;
	    	 arr[i]=0;
	     }else
	     {
	    	 arr[i]= temp;
	     }
	
	     
	    return arr; 
	}
	
}
