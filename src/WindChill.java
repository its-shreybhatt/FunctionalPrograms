import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of t : ");
        int t = input.nextInt();
        System.out.println("Enter the value of v : ");
        int v = input.nextInt();

        double windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Wind Chill = " + windChill);
    }
}