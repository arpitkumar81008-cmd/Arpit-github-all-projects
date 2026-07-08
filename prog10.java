import java.util.*;
class prog10
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("INPUT : ENTER PROJECT DATE : ");
		String date=sc.next().toUpperCase();
		System.out.print("DAY OF THE WEEK : ");
		String day=sc.next().toUpperCase();
		int m[]={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String dn[]={"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
		StringTokenizer st=new StringTokenizer(date,"/");
		int dd=Integer.parseInt(st.nextToken());
		int mm=Integer.parseInt(st.nextToken())-1;
		int yy=Integer.parseInt(st.nextToken());
		if(dd>m[mm])
		{
			System.out.println("OUTPUT : INVALID DATE");
			System.exit(0);
		}
		int d=0;
		{
		while(!(day.equals(dn[d])))
			d++;
		}
		int i=0;
		while(++i!=90)
		{
			if(dd==m[mm])
			{
				dd=0;
				mm++;
				if(mm==12)
				{
					mm=0;
					yy++;
					if((yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0))
						m[1]=29;
					else
						m[1]=28;
				}
			}
			dd++;
			d++;
			if(d==7)
				d=0;
		}
		System.out.println("PROJECT SUBMISSION DATE : "+dd+"/"+(mm+1)+"/"+yy);
		System.out.println("DAY OF THE WEEK : "+dn[d]);
		if(d==6)
		{
			dd++;
			if(dd==m[mm])
			{
				dd=0;
				mm++;
				if(mm==12)
				{
					mm=0;
					yy++;
				}
			}
			d=0;
			System.out.println("PROJECT TO BE SUBMITTED : "+dd+"/"+(mm+1)+"/"+yy);
			System.out.println("DAY OF THE WEEK : "+dn[d]);

		}
		sc.close();
	}
}