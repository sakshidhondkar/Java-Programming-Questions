/**
 * problem:
 * Calculating Frequency of a Digit D in a Number N
 *  Write a program in Java to calculate the number of times a digit ‘D’ 
 *  appears in a number N. 
 *  You have to take N and D as inputs from the user.
 */
import java.util.Scanner;
public class Calculate_Frequency {

	public static void frequency(int N, int D)
	{
		int count=0, digit;
		
		if(N==0)
		System.out.println("number is zero");
		else 
		{
			while(N!=0)
			{
				digit=N%10;
				if(digit==D)
					count++;
				N=N/10;
			}
			System.out.println("Frequency of "+D+" is :"+count);
		}
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number And digit:");
		int No=sc.nextInt();
		int digit=sc.nextInt();
		frequency(No, digit);
	}

}
