import java.util.Scanner;
/*** 
 * Problem: 
 * Write a program in Java to generate the Nth Fibonacci Number 
 * using Iteration and Constant Space.
 * Time Complexity: O(N) because we have to travel N terms
 * Auxiliary Space:  O(1) as no extra space is used.
 */


public class Fibo_no {
	
	
/*
	public static int recursive(int n)
	{
		if(n<0)
			System.out.println("Negative number");
		
		else
			return (recursive(n-1)+recursive(n-2));
	}*/
	
	
 public static void fibo(int n)
 {
	 
	 int n1=0;
	 int n2=1;
	 int n3=0;
	 
	 System.out.print(n1+" "+n2);
	 if(n<0)
	 System.out.println("Number can't be negative");
	 
	 if(n==0)
		 System.out.println(n1+" ");
	 else if(n==1)
		 System.out.println(n2+" ");
	 else
	 {
		 
		  for(int i=2;i<n;i++)
		  {
			 n3=n1+n2;
			 System.out.print(" "+n3);
			 n1=n2;
			 n2=n3;
		  }
		  
		 
	 }
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int no= sc.nextInt();
		
		fibo(no);
		 
		
		
		
		

	}

}


