// practical program 2 
import java.util.*;
class anagram
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER FIRST STRING : ");
		String clean1=sc.nextLine().trim().toUpperCase().replace(" ","");
		System.out.print("ENTER SECOND STRING : ");
		String clean2=sc.nextLine().trim().toUpperCase().replace(" ","");
		int l1=clean1.length();
		int l2=clean2.length();
		if(l1!=l2)
		{
			System.out.println("STRINGS ARE NOT ANAGRAMS.");
			System.exit(0);
		}
		for(int i=0;i<l1;i++)
		{
			char ch=clean1.charAt(i);
			if(!Character.isLetter(ch))
			{
				System.out.println("INVALID CHARACTER IN STRING. INVALID INPUT.");
				System.exit(0);
			}
			int c1=clean2.indexOf(ch);
			if(c1==-1)
			{
				System.out.println("STRINGS ARE NOT ANAGRAMS.");
				System.exit(0);
			}
			
			else
				clean2=clean2.substring(0,c1)+clean2.substring(c1+1,clean2.length());
		}
		System.out.println("STRINGS ARE ANAGRAMS.");
		sc.close();
	}
}