import java.util.*;
class prog12
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("INPUT : N = ");
		int n=sc.nextInt();
		int A[][]=new int[n][n];
		System.out.print("MATRIX A[][] = ");
		int M[]=new int[n];
		int q=0,sd=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				A[i][j]=sc.nextInt();
				if(i==j)
					M[q++]=A[i][j];
			}
		}
		outer : for(int i=0;i<n;i++)
		{
			int z=A[i][0],y=0;
			for(int j=0;j<n;j++)
			{
				if(A[i][j]<z)
				{
					z=A[i][j];
					y=j;
				}
			}
			for(int k=0;k<n;k++)
			{
				if(z<A[k][y])
					continue outer;
			}
			sd=z;
			break;
		}
		if(sd==0)
		{
			System.out.println("NO SADDLE POINT.");
		}
		else
		{
			System.out.println("SADDLE POINT = "+sd);
		}
		for (int i = 1; i < n; ++i)
		{
            int key = M[i];
            int j = i - 1;
            while (j >= 0 && M[j] > key)
			{
                M[j + 1] = M[j];
                j = j - 1;
            }
            M[j + 1] = key;
        }
		for(int i=0;i<n;i++)
		{
			A[i][i]=M[i];
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
		sc.close();
	}
}