import java.util.*;
class prog19
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("INPUT : N = ");
		int n=sc.nextInt();
		System.out.println("OUTPUT : ");
		int a[][]=new int[n][n];
		int id=0,r=n/2,c=n-1;
		while(id++<n*n)
		{
			a[r][c]=id;
			if(r==0&&c==n-1)
			{
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
			sc.close();
		}
	}
}