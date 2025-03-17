package arraysMediumProblems;

public class Tow2DMatrixRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		
		};

		rotatem(arr);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
			
			}
			System.out.println();
			}
	}
	
	public static int[][] rotateMatrix(int[][] matrix) {
		int[][] m = new int[matrix.length][matrix[0].length]; 
		int l = matrix[0].length-1;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				m[j][l-i]=matrix[i][j];
			}
		}
		return m;
	}

public static void rotatem(int[][] matrix) {

	for(int i=0;i<matrix.length;i++) {
		for(int j=i+1;j<matrix[i].length;j++) {
	    
			int temp = matrix[i][j];
			matrix[i][j]= matrix[j][i];
			matrix[j][i]=temp;
		}
	}
	
	for(int i=0;i<matrix.length;i++) {
		rev(matrix[i]);
	}
	
}
	public static void rev(int[] arr) {
		int a=0,b=arr.length-1;
		while(a<b) {
			int temp=arr[a];
			arr[a]=arr[b];
			arr[b]=temp;
			a++;
			b--;
		}
	}
	
	

}
