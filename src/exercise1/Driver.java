package exercise1;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Insurance[] insurance1 = new Insurance[2]; // Only 2 insurance objects

        for(int i = 0; i<2; i++){
            System.out.print("Please enter the type of insurance 'health' or 'life'");// prompt
            String type = input.next(); // save use's input
            switch (type.toLowerCase()) {
                case "health":
                    System.out.print("Please enter details for your health insurance: ");
                    String insuranceType = input.next();
                    System.out.print("Please enter the monthly cost: ");
                    double monthlyCost = input.nextDouble();
                    Health healthInsurance = new Health(insuranceType,monthlyCost);
                    insurance1[i] = healthInsurance;
                    break;
                case "life":
                    System.out.print("Please enter details for your life insurance: ");
                    String insuranceLife = input.next();
                    System.out.print("Please enter the monthly cost: ");
                    double monthlyCostLife = input.nextDouble();
                    Life lifeInsurance = new Life(insuranceLife,monthlyCostLife);
                    insurance1[i] = lifeInsurance;
                    break;
                default:
                    System.out.print("Incorrect type. Please enter health or life. ");// prompt

            }

        }
// displaying insurane polymorphic
        for (Insurance i: insurance1){
            System.out.printf(i.displayInfo());

        }




    }

}