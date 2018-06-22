package exercise1;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Insurance[] insurance1 = new Insurance[2]; // Only 2 insurance objects

        for(int i = 0; i<2; i++){
            System.out.print("Please enter the type of insurance 'health' or 'life': ");// prompt
            String type = input.next(); // save use's input
            switch (type.toLowerCase()) {
                case "health":

                    System.out.print("Please enter the monthly cost: ");
                    double monthlyCost = input.nextDouble();

                    insurance1[i] = new Health(type,monthlyCost);
                    break;
                case "life":

                    System.out.print("Please enter the monthly cost: ");
                    double monthlyCostLife = input.nextDouble();

                    insurance1[i] = new Life(type,monthlyCostLife);
                    break;
                default:
                    System.out.print("Incorrect type. Please enter health or life. ");// prompt

            }

        }
// displaying insurane polymorphic
        for (Insurance i: insurance1){
            System.out.println(i.displayInfo());

        }




    }

}