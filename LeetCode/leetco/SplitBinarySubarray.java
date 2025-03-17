package leetco;

public class SplitBinarySubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {7,2,5,10,8};
		int ans= splitingarray(arr,2);
		System.out.println(ans);
	}

	
	public static int splitingarray(int[] nums,int m) {
		int s=0;
		int e=0;
		
		for(int i=0;i<nums.length;i++) {
			s= Math.max(s, nums[i]);
			e=e+nums[i];
		}
		
		while(s<e) {
			int mid = (s+e)/2;
			int sum=0;
			int pieces =1;
			for(int num : nums) {
				
				if(sum+ num >mid) {
					
					sum=num;
					pieces++;
				}
				else {
					sum=sum+num;
				}
			}
			if(pieces>m) {
				s=mid+1;
			}else {
				e=mid;
			}
		}
		return e;
	}
}
