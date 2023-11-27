/**
 * 
 *  problem:
 *  Write a program in Java to count the digits in a number.
 *
 */
public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 0; // count=6
		int count=0;
			
		if(n==0)
			System.out.println("Digit count -> "+n);
		else
		{
			while(n!=0)
			{
				n=n/10;
				count++;
			}
			System.out.println("Digit count -> "+ count);
		}
		
				

	}

}
