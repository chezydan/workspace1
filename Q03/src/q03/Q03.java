package q03;
import java.util.Random;

public class Q03 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MAXIMUM=1000;
		int MINIMUM=100;
		int [] Ar = new int [10];
		for (int i = 0; i < 10; i++) {
			Ar[i] =MINIMUM + (int)(Math.random() * ((MAXIMUM - MINIMUM) + 1));
			//System.out.println(Ar[i]);
		}
		int numberOfPalins=0;
		for (int i =0 ; i<Ar.length; i++) {
			for (int j =0 ; j<Ar.length; j++) {
				if( isPalindrome(Ar[i]) && isPalindrome(Ar[j]) ) {
					System.out.println(Ar[i] * Ar[j]);
					numberOfPalins =+ 1;
					
				}
				
				
				
				
			}
		
		}
		if (numberOfPalins==0)
			System.out.println(1);
		}
	public static boolean isPalindrome(int num) {
		int original= num;
		int remainder =0;
		int reversed = 0;
		while( num != 0 )        {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num  /= 10;
        }
		return original == reversed;
	}
	}


