import java.util.Scanner;
public class AreaOfCirc {
   public static void main(String args[]){
      int radius;
      double area;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the radius :");
      radius = sc.nextInt();
      area = (radius*radius)*3.14;
      System.out.println("Area of the circle is ::"+area);
   }
}