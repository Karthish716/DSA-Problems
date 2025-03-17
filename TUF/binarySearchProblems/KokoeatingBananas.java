package binarySearchProblems;

public class KokoeatingBananas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {3,6,7,11};
		int a = minimumEat(arr,8);
		System.out.println(a);
	}

	
	public static int minimumEat(int[] nums,int h) {
		int s=1;
		int e=findmax(nums);
		
		while(s<=e) {
			int mid=(s+e)/2;
			
			int totalHour = calculateTotalHour(nums,mid);
			if(totalHour <= h) {
				e=mid -1;
			}
			else {
				s=mid+1;
			}
		}
		return s;
	}
	
	public static int findmax(int[] arr) {
		int maxi = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			
			maxi=Math.max(maxi,arr[i]);
		}
		return maxi;
	}
	
	public static int calculateTotalHour(int[] arr,int hourly) {
		int total=0;
		for(int i =0;i<arr.length;i++) {
			total += Math.ceil((double)arr[i]/(double)hourly);
			}
		return total;
	}
	
}
