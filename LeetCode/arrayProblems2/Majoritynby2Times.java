package arrayProblems2;

public class Majoritynby2Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Majoritynby2Times m = new Majoritynby2Times();
		int[] nums = {2,1,2,4,3,1,3,2,2,5};
		int r = m.Majority(nums);
		System.out.print(r);
	}

	//moore's voting Algorithm
	public int Majority(int[] nums) {
		int count=1,me=nums[0];
		for(int i=1;i<nums.length;i++) {
			if(me==nums[i]) {
				count++;
			}else {
				count--;
			}
			
			if(count==0) {
				me=nums[i];
				count=1;
			}
		}
		return me;
	}
}
