//prog3
import java.util.*;
class collection
{
	int arr[];
	int len;
	
	collection()
	{
		len=100;
		arr=new int[len];
	}
	
	collection(int l)
	{
		len=l;
		arr=new int[len];
	}
	
	void inparr()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}

		sc.close();
	}
	
	void arrange()
	{
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
	}
	
	collection common(collection A)
	{
		collection cc=new collection();
		int id=0;
		for(int i=0;i<A.len;i++)
		{
			for(int j=0;j<A.len;j++)
			{
				if(A.arr[i]==arr[j])
					cc.arr[id++]=arr[j];
			}
		}
		cc.len=id;
		return cc;
	}
	
	void display()
	{
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}
			System.out.println();
	}
	
	public static void main(String []args)
	{
		collection ob1=new collection(10);
		ob1.inparr();
		collection ob2=new collection(7);
		ob2.inparr();
		collection ob3=ob1.common(ob2);
		ob3.arrange();
		System.out.println("Array 1");
		ob1.display();
		System.out.println("Array 2");
		ob2.display();
		System.out.println("common elements");
		ob3.display();
	}
}