package exercise1;

public class Health extends Insurance {
    double monthlyCost;

    @Override
    public  void setInsuranceCost (double cost)
    {
        monthlyCost = cost;
    }

    public String displayInfo ()
    {
        return String.format("Insurance type: %s %nMonthly cost: $%.2f", "Health",monthlyCost);
    }
}
