package exercise2;

import java.util.Scanner;

public class StudentDriver {
    public static void main(String[] args) {// Don't forget to type this!!
        Student a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter f is for FullTime or any key for PartTime: ");  // prompt
        String type = scanner.nextLine();   // read user input
        System.out.print("Enter your first name: ");  // prompt
        String first = scanner.next();   // read user input
        System.out.print("Enter your last name: ");  // prompt
        String last = scanner.next();   // read user input
        if(type.equalsIgnoreCase("f"))
        {
            a = new FullTimeStudent(first, last);
        }
        else {
            System.out.print("Enter your Credit Hour: ");  // prompt
            double creditHour = scanner.nextDouble();
            a = new PartTimeStudent(first,last,creditHour);
        }
        System.out.printf("First name: %s,Last name: %s, tuition: $%.2f", a.getfName(), a.getlName(), a.calculateTuition());

    }
}
