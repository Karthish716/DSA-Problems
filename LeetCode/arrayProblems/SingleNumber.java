package arrayProblems;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr= {1,3,2,1,3};
         System.out.print(singlenum(arr));
         
	}

	
	public static int singlenum(int[] nums) {
		int single= nums[0];
		for(int i=1;i<nums.length;i++) {
			single = single^nums[i];
		}
		return single;
	}
}
