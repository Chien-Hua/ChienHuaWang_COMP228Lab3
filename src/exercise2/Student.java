package exercise2;
/*Create an abstract class called Student. The Student class includes a name and a boolean value representing the full-time status.
        Include an abstract method to determine the tuition, with full-time students paying a flat fee of $2000
        and part-time students paying $100 per credit hour.
        Create two subclasses called FullTimeStudent, PartTimeStudent.
        Create a console application that demonstrates how to create objects of both subclasses.
        Allow the user to choose student type and enter the number of credit hours.*/

public abstract class Student {
    private     String fName;
    private String lName;
    private Boolean fTime;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

// constructor

    public Student(String fName, String lName, Boolean fTime) {
        this.fName = fName;
        this.lName = lName;
        this.fTime = fTime;
    }

    // abstract method
    public abstract double calculateTuition ();

}

