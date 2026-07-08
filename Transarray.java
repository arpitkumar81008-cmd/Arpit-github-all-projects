//prog2
import java.util.*;
class Transarray
{
	int arr[][];
	int m,n;
	
	Transarray()
	{
		m=n=20;
		arr=new int[m][n];
	}
	
	Transarray(int mm,int nn)
	{
		m=mm;
		n=nn;
		arr=new int[m][n];
	}
	
	void fillarray()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
	}
	
	void disparray()
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	void Transpose(Transarray A)
	{
		if(A.m==m&&A.n==n&&A.m==n&&A.n==m)
		{
			for(int i=0;i<A.m;i++)
			{
				for(int j=0;j<A.n;j++)
				{
					arr[j][i]=A.arr[i][j];
				}
			}
		}
		else
		{
			System.out.println("matrix is not of same order.");
		}
	}
	
	public static void main(String []args)
	{
		Transarray ob1=new Transarray(4,4);
		ob1.fillarray();
		Transarray ob2=new Transarray(4,4);
		ob2.Transpose(ob1);
		System.out.println("ORIGINAL MATRIX");
		ob1.disparray();
		System.out.println("Transposed matrix");
		ob2.disparray();
	}
}