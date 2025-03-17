package leetcoss;

public class RotateTrueOrFalse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] arr= {1,1,1,1,1,1,1,2,1,1,1,1};
     int s = mountain(arr);
     System.out.println(s);
	}

	
	public static boolean search(int[] nums, int target) {

        if(nums.length==1){
            if(nums[0]==target){
                return true;
            }
            else{
                return false;
            }
        }
		int piv = mountain(nums);
		System.out.println(piv);
        boolean ans=binarysearch(nums,target,0,piv);
        if(ans==false){
            ans=binarysearch(nums,target,piv+1,nums.length-1);
        }
    
    return ans;
    }

    public static boolean binarysearch(int[] arr,int target,int s,int e) {
		
		int start =s;
		int end = e;
		boolean asc=false;
		if(arr[start]<arr[end]) {
			asc=true;
		}

		while(start<=end) {
			int mid = (start+end)/2;
			if(asc) {
			if(target>arr[mid]) {
				start=mid+1;
			}
			else if(target<arr[mid]) {
				end=mid-1;
			}
			else {
				return true;
			}
			}

			else {
				if(target>arr[mid]) {
					end=end-1;
				}
				else if(target<arr[mid]) {
					start = start + 1;
				}
				else {
					return true;
				}
				
			}
		}
	 return false;
	}

    public static int peakmount(int[] nums) {
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
