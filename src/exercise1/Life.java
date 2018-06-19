package exercise1;

public class Life extends Insurance {

    public Life(String insuranceType, double monthlyCost) {
        super(insuranceType, monthlyCost);
    }

    @Override
    public void setInsuranceCost(double cost) {
        monthlyCost = cost;
    }

    @Override
    public String displayInfo() {

        return String.format("Insurance type: %s - %s %nMonthly cost: $%.2f%n", "Life",getInsuranceType(),getMonthlyCost());
    }
}

