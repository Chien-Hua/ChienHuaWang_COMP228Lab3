package exercise1;

public abstract class Insurance {
     protected String insuranceType;
    protected double monthlyCost;

    // constructor
    public Insurance(String insuranceType, double monthlyCost) {
        this.insuranceType = insuranceType;
        this.monthlyCost = monthlyCost;
    }

    // getter
    public String getInsuranceType() {
        return insuranceType;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }

    // abstract method
    public abstract void setInsuranceCost (double cost);
    public abstract String displayInfo ();


}
