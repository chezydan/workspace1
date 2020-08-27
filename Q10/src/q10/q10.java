package q10;
import java.util.Random;

public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] A = { {1, 1, 1,  1, 2, 1},
		               {1, 4, 1,  2, 1 ,2  },
		              { 10, 1, 16,1, 2, 1 } };	
		
      int [][] B = { {1,10,1},
        {10,100,1},
          { 10,1,16 }  };
		
		
	System.out.println(isPerfect(0,1,A)  );
	System.out.println(isPerfect(0,1,A)  );
	System.out.println(isPerfect(0,3,A)  );
	
	int FLOOR = 10;
	int ROOF = 100;
	
	int [][] C = new int[10] [20];
	
	//fill matrix C 
	for (int i = 0 ; i < C.length ; i ++)
		for (int j =0 ; j < C[0].length ; j++)		
			C[i][j] =FLOOR + (int)(Math.random() * ((ROOF - FLOOR) + 1));	
	

	int perfectD = 0;
	int regularD = 0;
	int noD = 0  ;
	int sumPerfect = 0;
	
	for (int i = 0 ; i < C.length ; i ++) {
		for (int j =0 ; j < C[0].length ; j++) {
			int isPerfect = isPerfect(i,j,C);
			
			switch (isPerfect) {
			case 0: noD = noD + 1;
			break;
			case 1: regularD = regularD + 1;
			break;
			case 2: perfectD = perfectD + 1;
			sumPerfect = sumPerfect + C[i][j]*4;
			}
		        }
				}
	System.out.println("no Diamond :"+ noD);
	System.out.println("regular Diamond :"+ regularD);
	System.out.println("perfect Diamond :"+ perfectD);
	System.out.println("sum of perfect centers :"+ sumPerfect);
	}
	
	
	
public static int isPerfect(int x, int y , int[][] mat)	{
	int maxRow = mat.length-1;
	int maxCol = mat[0].length-1;
	//System.out.println(maxCol);
	
	if ( (x+2)> maxRow || (y +1) > maxCol || y < 1)
		return 0;
	
	if (mat[x][y] != mat[x+1][y-1] || (mat[x+1][y+1] != mat[x+1][y-1]) || ( mat[x+2][y]!= mat[x+1][y-1]))
		return 0;
	int perimeter = 0;
	int center= mat[x+1][y];
	
	perimeter = mat[x][y] + mat[x+1][y-1] + mat[x+1][y+1] + mat[x+2][y] ;
	
	if (perimeter == center )
		return 2;
	else 
		return 1;
	
	
}

}
