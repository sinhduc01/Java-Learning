package IEmployee;

public class TestIEmployee {
    public static void main(String[] args) {
        IEmployee employee1 = new PartTimeEmployee("Duc", 30000, 8);
        System.out.println("Name: " + employee1.getName());
        System.out.println("Salary per day: " + employee1.calculateSalary());

        IEmployee employee2 = new FullTimeEmployee("Tai", 70000);
        System.out.println("Name: " + employee2.getName());
        System.out.println("Salary per day: " + employee2.calculateSalary());
    }
}
