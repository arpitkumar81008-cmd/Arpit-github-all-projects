import java.util.*;
class p2008
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String s=sc.nextLine().toUpperCase();int t=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='.'||ch=='!'||ch=='?')
			{
				t+=1;
			}
		}
		String A[]=new String[t];String se="";int p=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!='.'&&ch!='!'&&ch!='?')
			{
				se=se+ch;
			}
			else
			{
				A[p++]=se;
				se="";
			}
		}
		for(int i=0;i<A.length;i++)
		{
			System.out.println(A[i]);
		}
		System.out.println("SENTENCE\t\tNO. OF VOWELS\t\tNO. OF WORDS");
		for(int i=0;i<t;i++)
		{
			String so=A[i];
			StringTokenizer ss=new StringTokenizer(so);
			int c=ss.countTokens();int v=0;
			for(int j=0;j<so.length();j++)
			{
				if("AEIOU".indexOf(so.charAt(j))!=-1)
				{
					v+=1;
				}
			}
			System.out.println((i+1)+"\t\t\t"+v+"\t\t\t"+c);
		}
		sc.close();
	}
}