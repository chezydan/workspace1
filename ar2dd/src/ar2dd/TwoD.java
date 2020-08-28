package ar2dd;

public class TwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	int [][] A =  {  {1,2,4,4},
					  {4,6,6,6},
					  {7,8,8,4 }   }  ;

	int [][] B =  {{1,2,4},
			  		{4,6,6},
			  		{7,8,8 },
			  		{1,1,9}   }  ;

	
	//test 2D

	System.out.println(isEven(A,1,1));
	System.out.println(isEven(B,1,1));
	
	
	}
	
	
	
 public static Boolean isEven ( int [][] ar, int ii, int jj	 ) 
 {
	 
	Boolean	 isEven =true;
	
	for (int i =ii ;  i< ar.length; i++) {
		for (int j =jj; j< ar[0].length; j++)
		{
		//System.out.println(ar[i][j]);
			if (ar[i][j] %2 !=0)
			{isEven =false;
			return isEven;
			}
		}
	}
	
	return isEven;
	
			
	
	
 }
	
	

	}

