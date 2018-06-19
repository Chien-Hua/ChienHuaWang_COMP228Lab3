package exercise2;

public class FullTimeStudent extends Student {


    public FullTimeStudent(String fName, String lName) {
        super(fName, lName, true);

    }

    @Override
    public double calculateTuition (){
        return 2000;
        /*
        if (x == true ){
            return 2000;
        } else {
            return creditHour * 100;
        }*/
    }
}
