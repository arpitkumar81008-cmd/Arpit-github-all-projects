import java.util.*;
class prog1
{
	public static void main (String []args)
	{
		prog1 ob = new prog1();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your input");
		String str = sc.nextLine();
		System.out.println(ob.reverse(str));
		sc.close();
	}
	String reverse(String in)
	{
		String out = "";
		int i = 0;
		
		while (i<in.length())
		{
			out=in.charAt(i++)+out;
		}
		return out;
	}
}