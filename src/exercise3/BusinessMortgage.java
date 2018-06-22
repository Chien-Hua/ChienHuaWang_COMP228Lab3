package exercise3;

public class BusinessMortgage extends Mortgage{
/*BusinessMortgage – extends Mortgage. Its constructor sets the interest rate to 1% over the current prime rate.*/

    public BusinessMortgage(String mortgageNum, String customerName, double amountOfMortgage, double interestRate, int term) {
        super(mortgageNum, customerName, amountOfMortgage, interestRate, term);

        if (interestRate > 0.01) {
            throw new IllegalArgumentException(" Interest Rate must be <= 0.01");
        }
    }

}
