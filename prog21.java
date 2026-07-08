import java.util.*;
class prog21
{
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
		int count=0;
		do{
			System.out.print(String.valueOf(chars)+"\t");
			count++;
			if(count % 8==0)
				System.out.println();
		}while(nextpermutation(chars));
		System.out.println();
		System.out.println("TOTAL ANAGRAMS : "+count);
		sc.close();
	}
	private static boolean nextpermutation(char[]array)
	{
		int i=array.length-2;
		while(i>=0&&array[i]>=array[i+1])
		{
			i--;
		}
		if(i<0)
			return false;
		int j=array.length-1;
		while(array[j]<=array[i])
		{
			j--;
		}
		char temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		int start=i+1,end=array.length-1;
		while(start<end)
		{
			char swap=array[start];
			array[start]=array[end];
			array[end]=swap;
			start++;
			end--;
		}
		return true;
	}
}