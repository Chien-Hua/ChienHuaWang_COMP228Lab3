package exercise3;

public abstract class Mortgage implements MortgageConstants {
    private String mortgageNum;
    private String customerName;
    private double amountOfMortgage;
    private double interestRate;
    private int term;

    // getter and setter

    public String getMortgageNum() {
        return mortgageNum;
    }

    public void setMortgageNum(String mortgageNum) {
        this.mortgageNum = mortgageNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAmountOfMortage() {
        return amountOfMortgage;
    }

    public void setAmountOfMortage(double amountOfMortage) {
        this.amountOfMortgage = amountOfMortage;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
    // constructor

    public Mortgage(String mortgageNum, String customerName, double amountOfMortgage, double interestRate, int term) {

        if (amountOfMortgage > MAX_AMOUNT) {
            throw new IllegalArgumentException(" Mortgage must be <= 300000");
        }

        // if term is not medium term or long term, set to short term
        if (term != MEDIUM_TERM_YEAR || term != LONG_TERM_YEAR){
            term = SHORT_TERM_YEAR;
        }

        if (interestRate < 0 || interestRate > 0.2) {
            throw new IllegalArgumentException("Interest Rate must be between 0 and 20%");
        }

        this.mortgageNum = mortgageNum;
        this.customerName = customerName;
        this.amountOfMortgage = amountOfMortgage;
        this.interestRate = interestRate;
        this.term = term;
    }

    public String getMortgageInfo () {
        return String.format("%s %s %s%n%s %n%.2f %s %d",
                BAMK_NAME,getMortgageNum(), getCustomerName(),
                "Amount of Mortgage: ", getAmountOfMortage(),
                getInterestRate(), getTerm());
    }
}
