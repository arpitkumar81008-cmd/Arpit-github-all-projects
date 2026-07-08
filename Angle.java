//prog1
import java.util.*;
class Angle
{
	int deg,min;
	Angle()
	{
		deg=min=0;
	}
	void inputangles()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Degrees : ");
		deg=sc.nextInt();
		System.out.println("Minutes : ");
		min=sc.nextInt();

		sc.close();
	}
	void dispangle()
	{
		System.out.println(deg+" Degrees "+min+" Minutes ");
	}
	Angle sumofangles(Angle t1,Angle t2)
	{
		Angle sm=new Angle();
		sm.deg=t1.deg+t2.deg;
		sm.min=t1.min+t2.min;
		if(sm.min>=60)
		{
			sm.deg=sm.deg+sm.min/60;
			sm.min=sm.min%60;
		}
		return sm;
	}
	public static void main(String []args)
	{
		Angle ob1=new Angle();
		ob1.inputangles();
		Angle ob2=new Angle();
		ob2.inputangles();
		Angle ob3=new Angle();
		ob3=ob3.sumofangles(ob1,ob2);
		System.out.print("First Angle : ");
		ob1.dispangle();
		System.out.print("Second Angle : ");
		ob2.dispangle();
		System.out.print("Sum of Angle : ");
		ob3.dispangle();
	}
}