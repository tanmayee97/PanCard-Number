import java.util.*;
public class PanCardValidation {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your PanCard Number:");
		String a=sc.next();
		pancard(a);
	}	
		public static boolean pancard(String s)
		{
			int n=0;int a=0;
			if(s.length()==10)
			{
				for(int i=0;i<s.length();i++)
				{
					
				if((s.charAt(i)>=65 && s.charAt(i)<=90))
				{
					n++;
				}
				if(s.charAt(i)>=48 && s.charAt(i)<=57)
				{
					a++;
				}
			 }
				if(n+a!=0 && a!=0 & n!=0) 
				{
					System.out.println("Valid");
				}
				else 
				{
					System.out.println("Invalid");
				}
			}
				else
				{
					System.out.println("PanCard consistes of 10 characters");
				}
		
			return true;
	}

}
