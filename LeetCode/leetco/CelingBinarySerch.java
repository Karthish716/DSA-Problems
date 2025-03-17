package leetco;

public class CelingBinarySerch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {2,3,5,9,14,16,18};
		int a = celing(arr,1);
		
		System.out.print(a);
	}

	
	public static int celing(int[] nums, int target) {
		int s=0;
		int e= nums.length-1;
		
	
		if(target>nums[nums.length-1]||target<nums[0]) {
			return -1;
		}
		while(s<=e) {
			int mid = (e+s)/2;
			if(target>nums[mid]) {
				s=mid+1;
			}
			else if(target<nums[mid]) {
				e=mid-1;
			}
			else {
				return mid;
			}
			
		}
		return s;
	}
}
