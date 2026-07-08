import java.util.*;
class prog18
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("INPUT : ");
		System.out.print("N = ");
		int n=sc.nextInt();
		int a[][]=new int[(int)Math.pow(2,n)][n];
		int m=n-1,c=0,s=0;
		for(int i=0;i<n;i++)
		{
			int q=(int)Math.pow(2,m);
			for(int j=0;j<Math.pow(2,n);j++)
			{
				if(j==q+(Math.pow(2,m)))
					q=q+2*(int)(Math.pow(2,m));
				if(j<q)
					a[j][i]=-1;
				else if(j>=q)
					a[j][i]=1;
			}
			m--;
		}
		System.out.println("OUTPUT : ");
		for(int i=0;i<Math.pow(2,n);i++)
		{
			s=0;
			for(int j=0;j<n;j++)
			{
				s+=a[i][j]*(j+1);
			}
			if(s==0)
			{
				c++;
				for(int j=0;j<n;j++)
				{
					System.out.print(a[i][j]*(j+1)+"\t");
				}
				System.out.println();
			}
		}
		System.out.println("total number of combinations ="+c);

		sc.close();
	}
}