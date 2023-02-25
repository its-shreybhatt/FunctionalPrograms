import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Plz enter value of a :");
        int a = input.nextInt();
        System.out.println("Plz enter value of b :");
        int b = input.nextInt();
        System.out.println("Plz enter value of c :");
        int c = input.nextInt();

        // ax^2 + bx + c
        double delta = b*b - (4*a*c);
        double root1 =(-b + Math.sqrt(delta))/(2*a);
        double root2 =(-b - Math.sqrt(delta))/(2*a);

        System.out.println("Root 1 of x = " +root1);
        System.out.println("Root 2 of x = " +root2);
    }
}