package person;

public class Student extends Person {
    double gpa;

    public Student(String name, int age, String address, double gpa) {
        super(name, age, address);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        super.display();
        System.out.println("GPA: " + gpa);
    }

}
