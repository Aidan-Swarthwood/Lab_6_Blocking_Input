import java.util.Scanner;

public class FuelCosts {

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
            System.out.print("The number of gallons of gas in the tank: ");
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
            System.out.print("The fuel efficiency in miles per gallon: ");
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
        do {
            System.out.print("The price of gas per gallon: ");
            if (in.hasNextDouble()) {
                one = in.nextDouble();
                in.nextLine();
                if (one > 0) {
                    threeThree = one;
                    done = true;
                } else {
                    System.out.println("Must enter a valid number [> 0]");}
            } else {
                trash = in.nextLine();
                System.out.println("You must enter a valid number here. Not: " + trash);
            }
        } while(!done);
        costPer = 100/twoTwo * threeThree;
        gasTank = oneOne * twoTwo;
        System.out.println("the cost per 100 miles " + costPer + " and how far the car can go with the gas in the tank " + gasTank);
    }
}