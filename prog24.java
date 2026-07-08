import java.util.*;
public class prog24
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter postfix equation");
        String str = sc.next();
		String uv = "";
		for(int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			if(Character.isLetter(c) && uv.indexOf(c)==-1)
				uv = uv + c;
		}
        double[] vv = new double[uv.length()];
        System.out.println("\nPlease enter the values for the variables:");
		for (int i = 0; i < uv.length(); i++)
		{
            char var = uv.charAt(i);
            System.out.print("Enter value for " + var + ": ");
            vv[i] = sc.nextDouble();
		}
        double[] stack = new double[str.length()];
        int top = -1;
        for (int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
            if (Character.isLetter(c))
			{
				int id = uv.indexOf(c);
                double value = vv[id];
				stack[++top] = value;
            }
			else if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^')
			{
                double val2 = stack[top--];
                double val1 = stack[top--];
				double out = 0.0;
                switch (c)
				{
					case '+': out = val1 + val2; break;
					case '-': out = val1 - val2; break;
					case '*': out = val1 * val2; break;
					case '/': out = val1 / val2; break;
					case '^': out = Math.pow(val1, val2); break;
                }
				stack[++top] = out;
            }
		}
        System.out.println("ANSWER : " + stack[top]);
		
		sc.close();
    }
}
