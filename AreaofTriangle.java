import java.util.Scanner;
public class AreaofTriangle{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the height of the triangle:");
        double h = sc.nextDouble();
        System.out.println("Enter the base of the triangle:");
        double b = sc.nextDouble();
        double area = 0.5*b*h;
        System.out.println("Area of the triangle = " + area);
        sc.close();
    }
}