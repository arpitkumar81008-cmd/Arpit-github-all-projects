//practical program 1
import java.util.*;
class rotate
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("INPUT : M = ");
		int M=sc.nextInt();
		System.out.print("\tN = ");
		int N=sc.nextInt();
		if(N<3||N>9||M<3||M>9)
		{
			System.out.println("SIZE OUT OF RANGE. INVALID ENTRY.");
			System.exit(0);
		}
		int arr[][]=new int[M][N];
		System.out.println("Enter element in the matrix.");
		for(int i=0;i<M;i++)
		{
			for(int j=0;j<N;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("ORIGINAL MATRIX");
		for(int i=0;i<M;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i=0;i<M-1;i++)
		{
			for(int j=0;j<N;j++)
			{
				int t=arr[i][j];
				arr[i][j]=arr[i+1][j];
				arr[i+1][j]=t;
			}
		}
		System.out.println("FORMED MATRIX AFTER ROTATING.");
		int high=arr[0][0];
		int r=0,c=0;
		for(int i=0;i<M;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(arr[i][j]+"\t");
				if(high<arr[i][j])
				{
					high=arr[i][j];
					r=i;
					c=j;
				}
			}
			System.out.println();
		}
		System.out.println("Highest element : "+arr[r][c]+"( Row : "+r+" and Column : "+c);

		sc.close();
	}
}