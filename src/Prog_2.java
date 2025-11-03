import java.util.Scanner;

public class Prog_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of steps walked:");
        int steps = sc.nextInt();

        if (steps >= 10000) {
            System.out.println("Good job! You are active today");
        } else {
            System.out.println("You need to walk more for good health");
        }
    }
}
