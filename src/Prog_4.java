import java.util.Random;
import java.util.Scanner;

public class Prog_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int comp = rd.nextInt(9) +1;
        System.out.println("Enter your number -> ");
        int user = sc.nextInt();

        if (comp == user) {
            System.out.println("You are right");
        }

        else if (Math.abs(comp - user)==1) {
            System.out.println("You are almost right");
        }

        else {
            System.out.println("You are wrong");
        }
    }
}
