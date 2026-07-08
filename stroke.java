import java.util.*;
class stroke
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("INPUT : ");
		String s=sc.next().toUpperCase();
		String s1="ADGJMPTW";
		String s2="BEHKNQUX";
		String s3="CFILORVY";
		String s4="SZ";
		
		int st=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(s1.indexOf(ch)!=-1)
				st+=1;
			else if(s2.indexOf(ch)!=-1)
				st+=2;
			else if(s3.indexOf(ch)!=-1)
				st+=3;
			else if(s4.indexOf(ch)!=-1)
				st+=4;
			else
			{
				System.out.println("OUTPUT : INVALID ENTRY");
				System.exit(0);
			}
		}
		System.out.print("OUTPUT : Number of keystrokes = "+st);
		sc.close();
	}
}