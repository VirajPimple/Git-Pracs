import java.util.Scanner;
public class Arithematic
{
  public static void main(String[] args)
  {
   int a,b;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the first no.:");
   a=sc.nextInt();
   System.out.println("Enter the second no.:");
   b=sc.nextInt();
   System.out.println("a+b="+(a+b));
   System.out.println("a-b="+(a-b));
   System.out.println("a/b="+(a/b));
   System.out.println("a%b="+(a%b));
   System.out.println("--b="+(--b));
   System.out.println("++a="+(++a));
   System.out.println("a++="+(a++));
   System.out.println("b--="+(b--));
   }
 }
  
  
/*  D:\myjava>javac Arithematic.java

D:\myjava>java Arithematic
Enter the first no.:
10
Enter the second no.:
5
a+b=15
a-b=5
a/b=2
a%b=0
--b=4
++a=11
a++=11
b--=4
*/