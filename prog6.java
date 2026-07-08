import java.util.*;
class prog6
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("INPUT: \t M = ");
		int m=sc.nextInt();
		System.out.print("\tN = ");
		int n=sc.nextInt();
		if(m>9||m<2||n>9||n<2)
		{
			System.out.println("OUTPUT: INVALID INPUT");
			System.exit(0);
		}
		int ar[][]=new int[m][n];
		int out[][]=new int[n][m];
		int odd=0;
		System.out.print("\tENTER ELEMENTS : ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("OUTPUT: ORIGINAL MATRIX");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("\t"+ar[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				out[i][j]=ar[m-j-1][i];
			}
		}
		System.out.println("\tROTATED MATRIX ( 270 ANTI CLOCK WISE )");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print("\t"+out[i][j]);
				odd+=(out[i][j]%2==0?0:out[i][j]);
			}
			System.out.println();
		}
		System.out.print("\tSUM OF ODD ELEMENTS = "+odd);

		sc.close();
	}
}