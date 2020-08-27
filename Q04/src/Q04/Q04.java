package Q04;
import java.util.Arrays;
import java.util.Scanner;


public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter number of columns: (M)");
		int M=in.nextInt();
		System.out.println("enter number of rows (N):");
		int N= in.nextInt();
		System.out.println("enter initial number:");
		int k = in.nextInt();
				
		int [][] A = new int[N] [M];
		
		for (int i = 0  ; i < A.length; i++) {
			
			
			for (int j = 0 ; j < A[0].length ; j++) {
				A[i][j]= k+i;
			}
		}
		
		System.out.println("display matrix A");
		
		for (int i = 0 ; i<A.length ; i++)
		System.out.println(Arrays.toString(A[i]));
	}

}
