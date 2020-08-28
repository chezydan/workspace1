package Q21;
import  java.util.Scanner;
import java.lang.Math; 

public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ;
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number to process: ");
		a = in.nextInt();
		System.out.println("this is the result: ");
		System.out.println( newNumber( a)   );
		 
		
		
	}
public static int newNumber (int n) {
	int newN= 0;
	int copyN = n;
	double digit = 0;
	
	while (copyN >0) {
		//System.out.println( "copyN : "+copyN);
		double twoSmaller = copyN % (Math.pow(10.0,( digit+2)) )  ;
		//System.out.println(twoSmaller);
		copyN = copyN - (int)twoSmaller;
		
		int smaller = (int) (twoSmaller % (Math.pow(10.0, (digit+ 1)) )) ;
		//System.out.println(smaller);
		int greater = (int) (twoSmaller - smaller) ;
		//System.out.println(greater);
		if (greater ==0 )
			newN = newN + smaller;
		else
			newN = newN + smaller * 10 + greater /10;
		
		digit = digit +2;
}
	return newN;
}
}