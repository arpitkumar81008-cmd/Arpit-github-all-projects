import java.util.*;
class prog 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int last = (int)(n%10/10.0)*10;
		System.out.print(last);
		sc.close();
		
	}
}