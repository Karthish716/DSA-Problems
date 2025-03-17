package leetcoss;

public class ParingNumbersArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3};
		int a = paring(arr);
		System.out.println(a);
		
	}
	
	public static int paring(int[] nums ) {
		int get=0;
		for(int i =0;i<nums.length;i++) {
			for(int j =i;j<nums.length-1;j++) {
				if(nums[i]==nums[j+1]) {
					get=get+1;
				}
			}
		}
		return get;
	}

}
