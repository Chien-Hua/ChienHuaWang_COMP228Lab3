package exercise3;
/*ProcessMortgage – a main class that create an array of 3 mortgages. Prompt the user for the current interest rate.
 Then in a loop prompts the user for a mortgage type and all relevant information for that mortgage.
Store the created Mortgage objects in the array. When data entry is complete, display all mortgages.
 */
import javax.swing.*;
import java.util.Scanner;
public class ProcessMortgage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mortgage[] mortgage1 = new Mortgage[3];
        System.out.print("Please enter the current rate: ");
        double rate = Double.parseDouble(input.next()); // save use's input
        for (int i = 0; i < 3; i++) {
            System.out.print("Please enter the type of mortgage 'personal' or 'business': ");// prompt
            String type = input.next(); // save use's input
            System.out.print("Please enter the mortgage number: ");// prompt
            String number = input.next(); // save use's input
            System.out.print("Please enter your name: ");// prompt
            String name = input.next(); // save use's input
            System.out.print("Please enter your amount of mortgage: ");// prompt
            double amount =Double.parseDouble(input.next()) ; // save use's input
            System.out.print("Please enter your term '1', '3', '5': ");// prompt
            int term = Integer.parseInt(input.next()); // save use's input
            if (type.equalsIgnoreCase("personal")){
                 mortgage1[i] = new PersonalMortgage(number,name,amount,rate,term);

                System.out.println(mortgage1[i].getMortgageInfo());
            } else{
                mortgage1[i] = new BusinessMortgage(number,name,amount,rate,term);
                JOptionPane.showMessageDialog(null,mortgage1[i].getMortgageInfo());
                //System.out.println(mortgage1[i].getMortgageInfo());
            }
        }
    }
}