//prog5
import java.util.*;
class EqMat
{
	int a[][];
	int m,n;
	
	EqMat(int mm,int nn)
	{
		m=mm;
		n=nn;
		a=new int[m][n];
	}
	
	void readarray()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		sc.close();
	}
	
	int check(EqMat p,EqMat q)
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(p.a[i][j]!=q.a[i][j])
					return 0;
			}
		}
		return 1;
	}
	
	void print()
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String []args)
	{
		EqMat ob1=new EqMat(3,3);
		ob1.readarray();
		EqMat ob2=new EqMat(3,3);
		ob2.readarray();
		System.out.println("first matrix");
		ob1.print();
		System.out.println("second matrix");
		ob2.print();
		System.out.println();
		if(1==ob1.check(ob1,ob2))
			System.out.println("equal matrix");
		else
			System.out.println("not equal matrix");
	}
}