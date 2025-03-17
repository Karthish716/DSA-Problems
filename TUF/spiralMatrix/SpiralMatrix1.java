package spiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix1 {

	public List<Integer> spiral(int[][] matrix) {
		
		List<Integer> ls = new ArrayList<Integer>();
		int i =0,j=0;
		int n= matrix.length;
		while(j<matrix[i].length) {
			ls.add(matrix[i][j++]);
		}
		j--;
		while(i<n) {
			ls.add(matrix[i++][j]);
		}
		i--;
		
		return ls;
		//not finish.......
	}
	
}
