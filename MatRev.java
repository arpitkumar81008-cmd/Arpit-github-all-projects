//prog7
import java.util.*;
class MatRev
{
	int arr[][];
	int m,n;
	
	MatRev(int mm,int nn)
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
	
	int reverse(int x)
	{
		int y=0;
		while(x!=0)
		{
			y=y*10+x%10;
			x/=10;
		}
		return y;
	}
	
	void revMat(MatRev p)
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=p.reverse(p.arr[i][j]);
			}
		}
	}
	
	void show()
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
	
	public static void main(String []args)
	{
		MatRev ob1=new MatRev(3,3);
		ob1.fillarray();
		MatRev ob2=new MatRev(3,3);
		ob2.revMat(ob1);
		System.out.println("ORIGINAL");
		ob1.show();
		System.out.println("reversed");
		ob2.show();
	}
}