import java.util.*;
class Excep
{
	public static void main(String[] args)
	{
		int a, b, d;
		Scanner sc = new Scanner(System.in);
		try
		{
			b = 0;
			System.out.println("Enter a value for a : "); 
			a = sc.nextInt();
			d = a/b;
		}
		catch (Exception e)
		{
			System.out.println("Division by Zero. ");
		}
		System.out.println("After Catch Statement.");
	}
}	
/*
D:\myjava>javac Excep.java

D:\myjava>java Excep
Enter a value for a :
23
Division by Zero.
After Catch Statement.
*/