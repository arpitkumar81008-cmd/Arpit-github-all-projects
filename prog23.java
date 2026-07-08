import java.util.*;
class prog23
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("INPUT");
		System.out.print("Number : ");
		String str=sc.next().trim();
		long num=Long.valueOf(str);
		int n=str.length();
		
		sc.close();

		if(n%2!=0)
		{
			System.out.println("INVALID!!Please input even digits number");
			return;
		}
		int fl=n/2;
		boolean flag=true;
		long start=(long)Math.pow(10,fl-1)-1,end=(long)Math.pow(10,fl)-1;
		while(++start<end)
		{
			if(num%start!=0||num/start>=end)
				continue;
			end=num/start;
			if(check(str,start,end))
			{
				if(flag)
				{
					System.out.println(num+" is a vampire number");
					System.out.println("Combinations : ");
					flag=false;
				}
				System.out.println(start+"X"+end);
			}
		}
	}
	static boolean check(String n,long ll,long rr)
	{
		String l=String.valueOf(ll);
		String r=String.valueOf(rr);
		int len=n.length();
		for(int i=0;i<len;i++)
		{
			char ch=n.charAt(i);
			if(l.indexOf(ch)!=-1)
			{
				l=l.substring(0,l.indexOf(ch))+l.substring(l.indexOf(ch)+1,l.length());
				continue;
			}
			if(r.indexOf(ch)!=-1)
			{
				r=r.substring(0,r.indexOf(ch))+r.substring(r.indexOf(ch)+1,r.length());
				continue;
			}
			return false;
		}
		return true;
	}
}