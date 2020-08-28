package Q14;
import java.lang.Math; 
import java.util.Arrays;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] A = {
				{0, 0, 0, 9, 0} ,
				{0, 0, 0, 0, 0} ,
				{0, 0, 8, 0, 0} ,
				{0, 0, 25, 0, 0} ,
				{0, 0, 0, 0, 15}		
		};
		int [][] B = {
				{0, 0, 0, 9, 0} ,
				{0, 0, 0, 0, 0} ,
				{0, 0, 8, 0, 0} ,
				{0, 0, 0, 0, 0} ,
				{0, 11, 0, 11, 15}		
		};
		//test isSparse מטריצה דלילה ?
		System.out.println(isSparse(A));
		System.out.println(isSparse(B));
		
		// test building  a sparse matrix   
		int[] Mvalues = {9,8,25,15};
		int[] Mi  = {1,3,4,5};
		int[] Mj = {4,3,3,5};
		int size = 25;
		
		int[][] Sparse1 = buildM(Mvalues, Mi, Mj, size);
		displayMatrix(Sparse1);
		
		System.out.println();
		
		int[] Mvalues2 = {33,4,11,3};
		int[] Mi2  = {1,3,3,5};
		int[] Mj2 = {2,3,4,4};
		int size2 = 36;
		
		int[][] Sparse2 = buildM(Mvalues2, Mi2, Mj2, size2);
		displayMatrix(Sparse2);
		

}
public static boolean isSparse (int [][] mat) {
	boolean sparse = true;
	int nonZeros = 0;
	int nonZerosRow = 0;
	int numbers = (mat.length) * (mat[0].length);
	for ( int i=0; i<mat.length; i++) {
		nonZerosRow =0;
	
		for (int j=0; j<mat[0].length; j++) {
			if (mat[i][j] != 0) {
				nonZeros ++;
				nonZerosRow ++;
				if (nonZerosRow >2)
					return false;
				}			
	}//end j loop
   }// end i loop	
	//System.out.println(numbers * 0.2 + " "+nonZeros);
	if (nonZeros > (numbers*0.2) )
			sparse = false;
	
	
	return sparse;

	
}
public  static int[][] buildM (int[]values, int[]I, int[]J, int s){
	int len = (int) Math.sqrt(s);
	int [][] M = new int[len][len];
	for (int k =0 ; k < values.length; k++ )
		M [I[k]-1][J[k]-1]  = values[k];			
			
	return M;
}

public static void displayMatrix(int[][] mat) {
	for (int i=0; i< mat.length; i++) {
		System.out.println(Arrays.toString(mat[i]));
	}
}
}

