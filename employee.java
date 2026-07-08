import java.util.*;
class salary
{
	double salary=0.0;
	double DA=0.0;
	double RA=0.0;
	double TA=0.0;
	double PF=0.0;
	double IT=0.0;
	void set_details()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("SALARY : ");
		salary=sc.nextDouble();
		System.out.print("DA % : ");
		DA=sc.nextDouble();
		System.out.print("RA % : ");
		RA=sc.nextDouble();
		System.out.print("TA % : ");
		TA=sc.nextDouble();
		System.out.print("PF % : ");
		PF=sc.nextDouble();
		System.out.print("IT % : ");
		IT=sc.nextDouble();

		sc.close();
	}
	void print_details()
	{
		double da=salary/100*DA;
		double ra=salary/100*RA;
		double ta=salary/100*TA;
		double pf=salary/100*PF;
		System.out.printf("BASIC SALARY \t\t: %.2f%n", salary);
		System.out.printf("DEARNESS ALLOWANCE \t: %.2f%n", da);
		System.out.printf("HOUSE RENT ALLOWANCE \t: %.2f%n", ra);
		System.out.printf("TRAVEL ALLOWANCE \t: %.2f%n", ta);
		System.out.printf("PROVIDENT FUND \t\t: %.2f%n", pf);
		System.out.printf("GROSS SALARY \t\t: %.2f%n", gross_salary());
		System.out.printf("NET SALARY \t\t: %.2f%n", net_salary());
	}
	double gross_salary()
	{
		double da=salary/100*DA;
		double ra=salary/100*RA;
		double ta=salary/100*TA;
		double pf=salary/100*PF;
		double gs=salary+da+ra+ta+pf;
		return gs;
	}
	double net_salary()
	{
		double gs=gross_salary();
		double it=gs/100*IT;
		double ns=gs-it;
		return ns;
	}
}
class employee extends salary
{
	int eno=0;
	String ename="";
	String grade="";
	String post="";
	employee()
	{
		set_employee();
	}
	void set_employee()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("EMPLOYEE NUMBER \t: ");
		eno=sc.nextInt();
		System.out.print("EMPLOYEE NAME \t: ");
		ename=sc.nextLine();
		ename=sc.nextLine();
		System.out.print("EMPLOYEE GRADE \t: ");
		grade=sc.nextLine();
		System.out.print("EMPLOYEE POST \t: ");
		post=sc.nextLine();
		set_details();

		sc.close();
	}
	void print_employee()
	{
		System.out.println("EMPLOYEE NUMBER \t: "+eno);
		System.out.println("EMPLOYEE NAME \t\t: "+ename);
		System.out.println("EMPLOYEE GRADE \t\t: "+grade);
		System.out.println("EMPLOYEE POST \t\t: "+post);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("NUMBER OF EMPLOYEES : ");
		int n=sc.nextInt();
		employee ar[]=new employee[n];
		
		int i=0;
		do{
			ar[i++] = new employee();
		}while(i<n);
		do{
			System.out.println("MENU : - ");
			System.out.println("ENTER A FOR EMPLOYEE DETAILS.");
			System.out.println("ENTER B FOR EMPLOYEE SALARY SLIP.");
			System.out.println("ENTER C FOR PAYROLL OF ALL EMPLOYEES.");
			char in=sc.next().charAt(0);
			if(in=='A')
			{
				System.out.print("ENTER EMPLOYEE NUMBER : ");
				int num=sc.nextInt();
				for(i=0;i<n;i++)
				{
					if(ar[i].eno==num)
					{
						ar[i].print_employee();
						ar[i].print_details();
						break;
					}
				}
			}
			else if(in=='B')
			{
				System.out.print("ENTER EMPLOYEE NUMBER : ");
				int num=sc.nextInt();
				for(i=0;i<n;i++)
				{
					if(ar[i].eno==num)
					{
						ar[i].print_details();
						break;
					}
				}
			}
			else if(in=='C')
			{
				for(i=0;i<n;i++)
				{
					ar[i].print_employee();
					System.out.printf("GROSS SALARY \t: %.2f%n", ar[i].gross_salary());
					System.out.printf("NET SALARY \t: %.2f%n", ar[i].net_salary());
					System.out.println("----------------------------------------------");
				}
			}
			else
				break;
		}while(true);
		sc.close();
	}
}