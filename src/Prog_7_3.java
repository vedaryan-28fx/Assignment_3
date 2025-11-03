import java.util.Scanner;

public class Prog_7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        String result = (year % 400 == 0) ? (year + " is a Leap Year.") :
                (year % 100 == 0) ? (year + " is NOT a Leap Year.") :
                        (year % 4 == 0) ? (year + " is a Leap Year.") :
                                (year + " is NOT a Leap Year.");

        System.out.println(result);
    }
}
