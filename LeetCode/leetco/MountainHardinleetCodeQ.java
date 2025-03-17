package leetco;

public class MountainHardinleetCodeQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	    public int findInMountainArray(int target, MountainArray mountainArr) {
	        
	    int peak = peakmount(mountainArr,mountainArr.length()-1);
			int firsttry= OrderAgnostic(mountainArr,target,0,peak);
			if(firsttry !=-1) {
				return firsttry;
			}
			
			return OrderAgnostic(mountainArr,target,peak+1,mountainArr.length()-1);
		}
		
		public static int peakmount(MountainArray nums,int end) {
			int s=0;
			int e=end;
			
			while(s<e) {
				int mid = (s+e)/2;
	            int midValue=nums.get(mid);
				if(nums.get(midValue)>nums.get(midValue+1)) {
					e=midValue;
				}else {
					s=midValue+1;
				}
			}
			return s;
			}
		
		
		public static int OrderAgnostic(MountainArray arr,int target ,int start,int end) {
			
			int s=start;
			int e = end;
			boolean isAsc=arr.get(s)<arr.get(e);
			
			while(s<=e) {
				int mid = (s+e)/2;
	            int midValue=mid;
				if(arr.get(midValue)==target) {
					return midValue;
				}
				
				if(isAsc) {
					if(target<arr.get(midValue)) {
						e=midValue-1;
					}
					else {
						s=midValue+1;
					}
				}else {
					if(target>arr.get(midValue)) {
						e=midValue-1;
					}
					else {
						s=midValue+1;
					}
				}
			}
			return -1;
		}

	}

