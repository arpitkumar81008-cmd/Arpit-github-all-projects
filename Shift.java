//prog6
import java.util.*;
class Shift
{
	int mat[][];
	int m,n;
	
	Shift(int mm,int nn)
	{
		m=mm;
		n=nn;
		mat=new int[m][n];
	}
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		sc.close();
	}
	
	void cyclic(Shift p)
	{
		if(p.m==m&&p.n==n)
		{
			for(int i=0;i<p.m;i++)
			{
				for(int j=0;j<p.n;j++)
				{
					if(i==0)
						mat[m-1][j]=p.mat[i][j];
					else
						mat[i-1][j]=p.mat[i][j];
				}
			}
		}
		else
			System.out.println("Matrix not of same order");
	}
	
	void display()
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String []args)
	{
		Shift ob1=new Shift(3,3);
		ob1.input();
		Shift ob2=new Shift(3,3);
		ob2.cyclic(ob1);
		System.out.println("ORIGINAL");
		ob1.display();
		System.out.println("cyclic");
		ob2.display();
	}
}