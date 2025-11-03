import java.util.Scanner;

public class Prog_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        }
        else if (discriminant == 0) {
            double r1 = -b / (2 * a);
            System.out.println("The equation has one root " + r1);
        }
        else {
            System.out.println("The equation has no real roots");
        }
    }
}
