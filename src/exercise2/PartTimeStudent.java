package exercise2;

public class PartTimeStudent extends Student {
    double creditHour =0;

    public double getCreditHour() {
        return creditHour;
    }

    public void setCreditHour(double creditHour) {
        this.creditHour = creditHour;
    }

    public PartTimeStudent(String fName, String lName, double creditHour) {
        super(fName, lName, false);
        this.creditHour = creditHour;
    }

    @Override
    public double calculateTuition (){
        return creditHour * 100;
    }
}
