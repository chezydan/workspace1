package q06;

public class Q06 {
	
public static void main(String[] args){
		// TODO Auto-generated method stub
		
		
		int [][] A = { {1,10,1},
				        {10,10,1},
				          { 10,1,16 }  };	
		int [][] B = { {1,10,1},
		        {10,100,1},
		          { 10,1,16 }  };
		
      System.out.println(frame(A));
      System.out.println( diag(A));
      System.out.println( frameGreater   (A));
      System.out.println( frameGreater (B) );
	}


 public static int frame (int[] [] mat) {
	 	int sum = 0;
	 	for (int i = 0 ; i < mat.length; i++) {
	 		for (int j = 0 ;  j <mat[0].length ; j++) {
	 			if(i==0 || i==(mat[0].length-1) || j==0 || j==(mat.length-1)) {
	 			
	 				sum += mat[i][j];}
	 		}	 
	 		}	 	
	 	return sum;
	 	}
 
 public static int diag (int[] [] mat) {
	 int sum = 0;
	 for (int i = 0 ; i < mat.length; i++) {
 		for (int j = 0 ;  j <mat[0].length ; j++) {
 			if(i==j) 
{			sum += mat[i][j];}
 		}	 	}
 	
 	return sum;
 	}
 
 public static boolean frameGreater (int[] [] mat) { 
	 return frame(mat) > diag(mat);
}

}

// א : מערך A
// ב. ממוש FRAME
