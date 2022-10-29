import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.print("Please Enter The Year Only : ");
        Scanner inp = new Scanner(System.in);
        year = inp.nextInt();

        if (year%400==0) {
            System.out.println("The Year You Entered is Leap Year");
        } else {
            System.out.println("The Year You Entered is Not a Leap Year");
        }
    }
}
