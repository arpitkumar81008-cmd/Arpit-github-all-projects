import java.util.*;
class prog22
{
	static int count=0;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("INPUT : ");
		String  word=sc.next().toUpperCase();
		char sw=word.charAt(0),lw=word.charAt(0);
		
		int i=0;
		for(;i<word.length();i++)
		{
			if(sw>word.charAt(i))
				sw=word.charAt(i);
			if(lw<word.charAt(i))
				lw=word.charAt(i);
		}
		i=0;
		
		String t="";
		for(;i<word.length();i++)
		{
			char ch=word.charAt(i);
			if(t.indexOf(ch)==-1)
				t+=ch;
		}
		i=0;
		word=t;
		char chars[]=new char[word.length()];
		while(sw<=lw)
		{
			int j=0;
			for(;j<word.length()&&sw!=word.charAt(j);j++);
			if(j<word.length()&&sw==word.charAt(j))
			{
				chars[i++]=sw;
			}
			sw++;
		}
		permute(chars,0,chars.length-1);
		System.out.println();
		System.out.println("TOTAL ANAGRAMS : "+count);
		sc.close();
	}
	static void permute(char[]arr,int l,int r)
	{
		if(l==r)
		{
			System.out.print(String.valueOf(arr)+"\t");
			count++;
			if(count%8==0)
				System.out.println();
		}
		else
		{
			for(int i=l;i<=r;i++)
			{
				char temp=arr[l];
				arr[l]=arr[i];
				arr[i]=temp;
				permute(arr,l+1,r);
				char swap=arr[l];
				arr[l]=arr[i];
				arr[i]=swap;
			}
		}
	}
}