import java.util.Scanner;

public class DistanceOfLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter value of x - ");
        int x = input.nextInt();
        System.out.println("enter value of y - ");
        int y = input.nextInt();
        double distance =Math.sqrt(x*x + y*y);
        System.out.println(distance);
    }
}