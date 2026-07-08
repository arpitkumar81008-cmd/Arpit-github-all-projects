import java.util.*;
class sorting
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int array[]=new int[5];
		System.out.println("- : enter array : -");
		for(int i=0;i<5;i++)
			array[i]=sc.nextInt();
		sorting ob = new sorting();
		System.out.println("enter soting technique \n bubble = a \n selection = b \n insertion = c ");
		char q=sc.next().charAt(0);
		switch(q)
		{
			case 'a':
			ob.bubble(array,array.length);
			break;
			case 'b':
			ob.selection(array,array.length);
			break;
			case 'c':
			ob.insertion(array,array.length);
			break;
			default:
			System.out.println("enter valid input.");
			System.exit(0);
		}
		System.out.print("search element = ");
		int num=sc.nextInt();
		System.out.println(ob.ls(array,num));
		System.out.println(ob.bs(array,num));
		sc.close();
	}
	
	int ls(int[] arr,int num)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
				return i;
		}
		return -1;
	}
	
	int bs(int arr[],int num)
	{
		int low =0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(num==arr[mid])
				return mid;
			else if(num<arr[mid])
				high=mid-1;
			else if(num>arr[mid])
				low=mid+1;
		}
		return -1;
	}
	
	void bubble(int list[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(list[j]>list[j+1])
				{
					int temp=list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
				}
			}
		}
	}
	
	void selection(int list[],int n)
	{
		for(int i=0;i<n;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(list[j]<list[min])
					min=j;
			}
			int temp=list[min];
			list[min]=list[i];
			list[i]=temp;
		}
	}
	
	void insertion(int []list,int n)
	{
		for(int i=1;i<n;i++)
		{
			int key=list[i];
			int j=i-1;
			while((j>=0)&&(list[j]>key))
			{
				list[j+1]=list[j];
				j--;
			}
			list[j+1]=key;
		}
	}
}