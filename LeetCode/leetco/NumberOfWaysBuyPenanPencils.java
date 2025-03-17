package leetco;

public class NumberOfWaysBuyPenanPencils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long s =NumPen(5,10,10);
		System.out.println(s);
	}
	
	
	public static long NumPen(int total ,int cost1,int cost2 ) {
		long counter=0;
		int pencost=cost1;
		int pencilCost=cost2;
		int maxpens=total/pencost;
	
		for(int i=0;i<=maxpens;i++) {
			int rembud=total-(i*pencost);
			
			int maxpencils=rembud/pencilCost;
			
			counter += maxpencils+1;
		}
		return counter;
	}

}
