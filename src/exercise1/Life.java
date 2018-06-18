package exercise1;

public class Life extends Insurance {
    double monthlyCost;

    @Override
    public void setInsuranceCost(double cost) {
        monthlyCost = cost;
    }

    @Override
    public String displayInfo() {

        return String.format("Insurance type: %s %nMonthly cost: $%.2f", "Life",monthlyCost);
    }
}

