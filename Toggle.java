/**
 * Problem:
 * Write a program in Java to Toggle the case of every character of a string.
 *  For instance, if the input string is “ApPLe”, the output should be “aPplE”.
 *  
 * @author sagar
 *
 */
public class Toggle {

	public static void toggle(String str)
	{
		String tstr= "";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
				tstr= tstr + (char)(str.charAt(i)-32);
			else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
				tstr= tstr + (char) (str.charAt(i)+32);
			else
				tstr = tstr+str.charAt(i);
		}
		System.out.println("String After Toggle:"+ tstr);
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="HellOO";
		
		System.out.println("String Before Toggle:"+ str);
		 toggle(str);
	}

}
