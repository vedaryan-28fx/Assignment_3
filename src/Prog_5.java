import java.util.Scanner;

public class Prog_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first side of the triangle --->");
        int a = sc.nextInt();

        System.out.println("Enter the second side of the triangle --->");
        int b = sc.nextInt();

        System.out.println("Enter the third side of the triangle --->");
        int c = sc.nextInt();

        if ((a+b)>c && (b+c)>a && (c+a)>b) {
            if (a==b && b==c) {
                System.out.println("It is an Equilateral triangle");
            }
            else if (a==b || b==c || a==c) {
                System.out.println("It is an Isosceles triangle");
            }
            else {
                System.out.println("It is a Scalene triangle");
            }
        }
        else {
            System.out.println("It is not a triangle");
        }
    }
}
