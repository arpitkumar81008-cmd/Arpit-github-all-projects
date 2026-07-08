/*
00	01	02	03	04
10	11	12	13	14
20	21	22	23	24
30	31	32	33	34
40	41	42	43	44
*/
import java.util.*;
class prog15
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("N = ");
		int n=sc.nextInt();
		int k=1,i=0,j=0,n2=n*n;
		int A[][]=new int[n][n];
		System.out.println("MENU :-");
		System.out.println("ENTER 1 FOR CLOCKWISE");
		System.out.println("ENTER 2 FOR ANTICLOCKWISE");
		String m=sc.next();
		if(m.equals("2"))
		while(k<=n2)
		{
			A[i][j]=k++;
			if(i+j<n-1&&j<=i)
				i++;
			else if(i+j>=n-1&&j<i)
				j++;
			else if(i+j>n-1&&j>=i)
				i--;
			else if(i+j<=n-1&&j>i+1)
				j--;
			else
				i++;
		}
		else if(m.equals("1"))
			while(k<=n2)
		{
			A[i][j]=k++;
			if(i+j<n-1&&j>=i)
				j++;
			else if(i+j>=n-1&&j>i)
				i++;
			else if(i+j>n-1&&j<=i)
				j--;
			else if(i+j<=n-1&&1+j<i)
				i--;
			else
				j++;
		}
		else 
		{
			System.out.println("INVALID INPUT! TERMINATING!");
			System.exit(0);
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
		sc.close();
	}
}