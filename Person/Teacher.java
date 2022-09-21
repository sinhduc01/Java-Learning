package Person;

public class Teacher extends Person {
    int salary;

    public Teacher(String name, int age, String address, int salary) {
        super(name, age, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher [salary=" + salary + "]";
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        super.display();
    }
}
