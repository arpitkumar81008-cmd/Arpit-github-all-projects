import java.util.*;
class prog14
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("n=");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		int ii=0,jj=0,id=1;
		for(int i=0,j=0;;)
		{
			if(i==n)
			{
				i=0;
				j=++ii;
			}
			if(j==n)
			{
				j=0;
				i=++jj;
			}
			if(i==n-1&&j==0)
			{
				a[i][j]=id;
				break;
			}
			a[i++][j++]=id++;
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}