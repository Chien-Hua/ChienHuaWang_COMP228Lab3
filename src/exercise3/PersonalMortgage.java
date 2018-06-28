package exercise3;
/*PersonalMortgage - extends Mortgage. Its constructor sets the interest rate to 2% over the current prime rate.*/

public class PersonalMortgage extends Mortgage {

    public PersonalMortgage(String mortgageNum, String customerName, double amountOfMortgage, double interestRate, int term) {
        super(mortgageNum, customerName, amountOfMortgage, interestRate + 0.02, term);
    }

}
