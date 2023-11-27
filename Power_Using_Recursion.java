/**
 * Problem:
 * Write a Java Program to calculate x^n (x to the power n) using Recursion. 
 * You can use O(N) time but can’t use any extra space apart from the
 *  Recursion Call Stack Space.
 * @author sagar
 *
 */
public class Power_Using_Recursion {

	public static int power(int n, int p)
	{
	  if(p==1)
		  return 1;
	  
	 return (n*(power(n, p-1)));
	 
	 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println(power(2, 10));

	}

}
