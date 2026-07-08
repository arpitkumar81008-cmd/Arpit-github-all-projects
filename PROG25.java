import java.util.*;
class prog25
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("INPUT : ");
		System.out.print("DATE : ");
		String date=sc.next().toUpperCase();
		System.out.print("ENTER FIRST DAY OF THE YEAR : ");
		String day=sc.next().toUpperCase();
		int m[]={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String dn[]={"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
		StringTokenizer st=new StringTokenizer(date,"/");
		int dd=Integer.parseInt(st.nextToken());
		int mm=Integer.parseInt(st.nextToken())-1;
		int yy=Integer.parseInt(st.nextToken());
		if((yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0))
			m[1]=29;
		int d=0,i=0,n=0;
		if(dd>m[mm])
		{
			System.out.println("OUTPUT : INVALID DATE");
			System.exit(0);
		}
		{
		while(!(day.equals(dn[d])))
			d++;
		}
		while(mm!=i)
		{
			n+=m[i++];
		}
		d=((n+dd-1)%7+d)%7;
		System.out.println("OUTPUT : ");
		System.out.println("DAY ON "+dd+"/"+(mm+1)+"/"+yy+" : "+dn[d]);

		sc.close();
	}
}