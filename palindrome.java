import java.util.*;
public class palindrome {
    public boolean isPalindrome(int x) {
        int a=0;
        int b=x;
        if((x<0)||(x%10==0 )&& (x!=0)){
            return false;
        }

        while(x!=0){
            a=a*10+(x%10);
            x=x/10;
        }

        if(b==a){
            return true;
        }
        return false;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter : ");
        int input = sc.nextInt();
        palindrome ob=new palindrome();
        System.out.println(ob.isPalindrome(input));
        sc.close();
    }
}