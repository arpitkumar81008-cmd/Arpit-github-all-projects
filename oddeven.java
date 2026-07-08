//prog4
import java.util.*;
class oddeven
{
	int a[];
	int m;
	
	oddeven(int mm)
	{
		m=mm;
		a=new int[m];
	}
	
	void fillarray()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<m;i++)
		{
			a[i]=sc.nextInt();
		}
        sc.close();
	}
	
	oddeven arrange(oddeven p,oddeven q)
	{
		oddeven x=new oddeven(p.m+q.m);
		int id=0;
		
		for(int i=0;i<p.m;i++)
		{
			if(p.a[i]%2==1)
				x.a[id++]=p.a[i];
		}
		for(int i=0;i<q.m;i++)
		{
			if(q.a[i]%2==1)
				x.a[id++]=q.a[i];
		}
		for(int i=0;i<p.m;i++)
		{
			if(p.a[i]%2==0)
				x.a[id++]=p.a[i];
		}
		for(int i=0;i<q.m;i++)
		{
			if(q.a[i]%2==0)
				x.a[id++]=q.a[i];
		}
		return x;
	}
	
	void display()
	{
		for(int i=0;i<m;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String []args)
	{
		oddeven ob1=new oddeven(7);
		ob1.fillarray();
		oddeven ob2=new oddeven(7);
		ob2.fillarray();
		oddeven ob3=new oddeven(7+7);
		ob3=ob3.arrange(ob1,ob2);
		System.out.println("first array");
		ob1.display();
		System.out.println("second array");
		ob2.display();
		System.out.println("arranged array");
		ob3.display();
	}
}