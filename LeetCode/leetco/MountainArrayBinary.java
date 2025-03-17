package leetco;


// 852. Peak Index in a Mountain array
public class MountainArrayBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		//int[] arr = {0,3,5,12,2};
		int[] arr= {1,1,1,1,2,4,5,1,1,1};
		int a = mountain(arr);
		System.out.println(a );
	}

	
	public static int mountain(int[] nums) {
		int s=0;
		int e=nums.length-1;
		
		while(s<e) {
			int mid = (s+e)/2;
			if(nums[mid]>nums[mid+1]) {
				e=mid;
			}else {
				s=mid+1;
			}
		}
		return s;
		}
}
