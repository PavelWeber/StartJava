public class Calculator

{
	
public static void main (String[]args)

{

int a = 2;
int b = 4;
int result;
char sign = '^';

if (sign == '/')

	{
 result = a/b;
 System.out.println (result);
	}
else if (sign == '+')

	{
 result = a+b;
 System.out.println (result);
	}

else if (sign == '-')

	{
 result = a-b;
 System.out.println (result);
	}

else if (sign == '*')

	{
 result = a*b;
 System.out.println (result);
	}

else if (sign == '%')

	{
 result = a%b;
 System.out.println (result);
	}

else if (sign == '^')

	{
		result = 1;

		for(int i=1;i<=b;i++)

		{
			result = result*a;
			
		}


          System.out.println (result);
	}




}

}