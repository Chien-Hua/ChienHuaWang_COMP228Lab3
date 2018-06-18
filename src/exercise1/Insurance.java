package exercise1;
/*
* Let Insurance be an abstract superclass and Health and Life two of its subclasses that describe respectively health insurance and life insurance.


The Life and Health class should implement setInsuranceCost and display methods by setting the appropriate monthly fee
and display the information for each insurance type.

Write a driver class to test this hierarchy.
This application should ask the user to enter the type of insurance and its monthly fee.
Then, will create the appropriate object (Life or Health) and display the insurance information.

As you create each insurance object, place an Insurance reference to each new Insurance object into an array.
Each class has its own setInsuranceCost method. Write a polymorphic screen manager that walks through the array
sending setInsuranceCost messages to each object in the array and displaying this information on the screen.
*/
public abstract class Insurance {
    private String insuranceType;
    private double monthlyCost;

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
