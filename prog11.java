//Program to modify a word into an anagram word.
import java.util.*;
class prog11
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		String str=sc.nextLine().toUpperCase();
		char c=str.charAt(str.length()-1);
		if(c=='.'||c=='?'||c=='!')
		{
		str=str.substring(0,str.length()-1)+" ";
		String st="",out="";
		for(int k=0;k<str.length();k++)
		{
			char ch=str.charAt(k);
			if(ch==' ')
			{
				String rev2="";
				for(int i=0;i<st.length();i++)
				{
					//String temp=st.substring(i,st.length());
					int j=st.length()-1;
					String rev="";
					while(j>=i)
					{
						rev=rev+st.charAt(j--);
					}
					if(rev.equals(st))
					{
						out+=st+rev2+" ";
						break;
					}
					else if(i==st.length()-1)
					{
						out+=st+rev2+" ";
					}
					else
					{
						rev2=st.charAt(i)+rev2;
					}
				}
				st="";
			}
			else
				st=st+ch;
		}
		out=out.substring(0,out.length()-1)+c;
		System.out.println(out);
		}
		else
			System.out.println("INVALID INPUT");

		sc.close();
	}
}