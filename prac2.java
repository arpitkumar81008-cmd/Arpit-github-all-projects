import java.util.*;
class prac2{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("input number");
		int num=sc.nextInt();
		String n=String.valueOf(num)+String.valueOf(num*2)+String.valueOf(num*3);
		System.out.println(String.valueOf(num*2));
		System.out.println(String.valueOf(num*3));
		System.out.println(n);
		char i;
		for(i='1';i<='9';i++){
			if(n.indexOf(i)==-1)
				break;
		}
		if(i>'9')
			System.out.println("facinating number");
		else
			System.out.println("not facinating number");
		sc.close();
	}
}