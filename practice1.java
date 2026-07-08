import java.util.*;
class practice1
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("**INPUT SENTENCE**");
		String str=sc.nextLine().toUpperCase();
		str=str.substring(0,str.length()-1);
		StringTokenizer ss=new StringTokenizer(str);
		int n=ss.countTokens();
		String a[]=new String[n];
		for(int i=0;i<n;i++)
		{
			a[i]=ss.nextToken();
		}
		System.out.println("**WORD**\t**FREQUENCY**");
		
		for(int i=0;i<n;i++)
		{
			if(a[i]==null)
				continue;
			String s=a[i];
			int c=0;
			for(int j=i;j<n;j++)
			{
				if(a[j]==null)
					continue;
				if(s.equals(a[j]))
				{
					c++;
					a[j]=null;
				}
			}
			System.out.println(s+"\t"+c);
		}
		sc.close();
	}
}