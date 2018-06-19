package exercise1;

public class Health extends Insurance {

    public Health(String insuranceType, double monthlyCost) {
        super(insuranceType, monthlyCost);
    }

    @Override
    public  void setInsuranceCost (double cost)
    {
        monthlyCost = cost;
    }

    public String displayInfo ()
    {
        return String.format("Insurance type: %s %nMonthly cost: $%.2f%n", "Health",getMonthlyCost());
    }
}
