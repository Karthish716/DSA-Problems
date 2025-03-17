package arraysHardProblems;

import java.util.ArrayList;

import java.util.List;

public class MajorityNby3Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr= {0,0,0};
		List<Integer> arr1=maj3(arr);
		for(int i : arr1) {
			System.out.print(i + " ");
		}
	}
	
	
	
public static List<Integer> maj3(int nums[]) {
	int count1=0,count2=0;
	int  element1=Integer.MIN_VALUE,element2=Integer.MIN_VALUE;
	for(int i =0;i<nums.length;i++) {
		if(count1==0&& element2!=nums[i]) {
			element1=nums[i];
			count1=1;
		}
		else if(count2==0&&element1!=nums[i]) {
			element2=nums[i];
			count2=1;
		}
		else if(nums[i]==element1) {
			count1++;
		}
		else if(nums[i]==element2) {
			count2++;
		}
		else {
			count1--;
			count2--;
		}
		
	}
	
	List<Integer> s= new ArrayList<Integer>();
	count1=0;
	count2 = 0;
	for(int i = 0;i<nums.length;i++) {
		if(element1==nums[i])count1++;
		if(element2==nums[i])count2++;
	}
	int n=nums.length;
	int min=(n/3)+1;
	if(count1>=min)
    s.add(element1);
	if(count2>=min)
    s.add(element2);
	
   s.sort(null);
return s;
}
}
