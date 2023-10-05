import java.util.Scanner;

public class CtoFConverter {

    public static void main(String[] args) {

        int celDegrees = 0;
        int equ = 0;
        boolean done = false;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter the temperature in Celsius: ");
            if (in.hasNextInt())
            {
                celDegrees = in.nextInt();
                in.nextLine();
                equ = (celDegrees * 9 / 5) + 32;
                System.out.println("Your Celsius temperature converted to fahrenheit: " + equ);

            } else {
                System.out.println("invalid input try again");
            }
        }while(!done);
    }
}