package leetco;

public class Solu {

	  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int n = nums1.length;
	        int m = nums2.length;
	        int i = 0, j = 0, m1 = 0, m2 = 0;

	        // Find median.
	        for (int count = 0; count <= (n + m) / 2; count++) {
	            m2 = m1;
	            if (i != n && j != m) {
	                if (nums1[i] > nums2[j]) {
	                    m1 = nums2[j++];
	                } else {
	                    m1 = nums1[i++];
	                }
	            } else if (i < n) {
	                m1 = nums1[i++];
	            } else {
	                m1 = nums2[j++];
	            }
	        }

	        // Check if the sum of n and m is odd.
	        if ((n + m) % 2 == 1) {
	            return (double) m1;
	        } else {
	            double ans = (double) m1 + (double) m2;
	            return ans / 2.0;
	        }
	    }
	
	
	public static void main(String[] args) {
	
	int num1[] = {1,5,6,7,10};
	int num2[] = {5,8,9,10};
	
    Solu c = new Solu();
     double t = c.findMedianSortedArrays(num1, num2);
	System.out.println(t);
	}

}
