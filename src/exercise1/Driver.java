package exercise1;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Insurance insurance1;

        System.out.print("Please enter the type of insurance: ");// prompt
        String type = input.next(); // save use's input

        if(type.toLowerCase() == "health")
        {
            insurance1 = new Health();
        }

        else if (type.toLowerCase() == "life")
        {
            insurance1 = new Life();
        }

        else
        {
            System.out.print("Incorrect type. Please enter health or life: ");// prompt
            type = input.next(); // save use's input
        }

        System.out.print("Please enter the monthly cost: ");
        double fee = input.nextDouble();


    }

}