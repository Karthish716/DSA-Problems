package arraysMediumProblems;

public class RearrangeArrayPN {

	//2149 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {-3,2,6,1,-2,-5,2,-4};
		int[] ans2=Rearr(arr);
		for(int i=0;i<arr.length;i++) {
	  	System.out.print(ans2[i]+"  ");
		}
	}

	public static void Rearrage(int[] nums) {
		int x=0,y=0;
		int b=0;
		int[] nums2 = new int[nums.length/2];
		int[] nums3 = new int[nums.length/2];
		for(int i=0;i<nums.length;i++) {
			
			if(b<nums[i]) {
				nums2[x++]=nums[i];	
			}
			else {
				nums3[y++]=nums[i];
			}
		}
		int count=1;
		int u=0;
		int v=0;
		
		for(int j=0;j<nums.length;j++) {
			
			if(count==1) {
			nums[j]=nums2[u++];
			count=0;
			}
			else{
				nums[j]=nums3[v++];
				count=1;
			}
		}
		
	
	}
	
	public static int[] Rearr(int[] nums) {
		int[] ans = new int[nums.length];
		int pos=0,neg=1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<0) {
				ans[neg]=nums[i];
				neg +=2;
			}
			else {
				ans[pos]=nums[i];
				pos +=2;
			}
		}
		return ans;
	}
	
}
