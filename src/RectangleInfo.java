import java.util.Scanner;

public class RectangleInfo {

    public static void main(String[] args) {

        double one = 0;
        double two = 0;
        double three = 0;
        double costPer = 0;
        double gasTank = 0;
        double oneOne = 0;
        double twoTwo = 0;
        double threeThree = 0;
        String trash = "";
        boolean done = false;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Length: ");
            if (in.hasNextDouble()) {
                one = in.nextDouble();
                in.nextLine();
                if (one > 0) {
                    oneOne = one;
                    done = true;
                } else {
                    System.out.println("Must enter a valid number [> 0]");}
            } else {
                trash = in.nextLine();
                System.out.println("You must enter a valid number here. Not: " + trash);
            }
        } while(!done);
        do {
            System.out.print("Width: ");
            if (in.hasNextDouble()) {
                one = in.nextDouble();
                in.nextLine();
                if (one > 0) {
                    twoTwo = two;
                    done = true;
                } else {
                    System.out.println("Must enter a valid number [> 0]");}
            } else {
                trash = in.nextLine();
                System.out.println("You must enter a valid number here. Not: " + trash);
            }
        } while(!done);
        double area = oneOne * twoTwo;
        double pythTher = oneOne * twoTwo * oneOne * twoTwo;
        double pythTherOne = one;
        double pythTherTwo = two;
        double diagnol = three;
        System.out.println("the area is " + area + " and the diagnol is " + diagnol);
    }
}