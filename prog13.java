import java.util.*;
class prog13
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("INPUT : Amount = ");
		String in=sc.next();
		String out=" PAISE ONLY";
		prog13 ob=new prog13();
		int id=in.indexOf('.');
		if(id==-1)
			in+=".0";
		in+="0";
		id=in.indexOf('.');
		long num2=Long.parseLong(in.substring(0,id));
		if(num2>999999999||num2<0)
		{
			System.out.println("AMOUNT EITHER NEGATIVE OR MORE THAN 9 DIGITS!! ABORTING!!");
			System.exit(0);
		}
		int num=Integer.parseInt(in.substring(0,id));
		String dis=in.substring(id+1,id+3);
		int dec=Integer.parseInt(in.substring(id+1,id+3));
		if(dec==0)
			out=" AND "+"ZERO"+out;
		else
			out=" AND "+ob.word(dec)+out;
		if(num==0)
			out="ZERO"+out;
		else 
		{
			if(num>0)
				out=ob.word(num%100)+out;
			if(num>99)
				out=ob.word(num%1000/100)+" HUNDRED "+out;
			if(num>999)
				out=ob.word(num%100000/1000)+" THOUSAND "+out;
			if(num>99999)
				out=ob.word(num%10000000/100000)+" LAKHS "+out;
			if(num>9999999)
				out=ob.word(num/10000000)+" CRORE "+out;
		}
		System.out.println("OUTPUT : Amount = "+num+"."+dis);
		System.out.println("RUPEES "+out);
		sc.close();
	}
	String word(int i)
	{
		String dig[]={"","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN"};
		String dig1[]={"","","TWENTY","THIRTY","FOURTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINETY"};
		if(i<20)
		{
			return dig[i];
		}
		return  dig1[i/10]+" "+dig[i%10];
	}
}