package person;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Student("Tai", 20, "Duc Ninh", 3.8);
        Person p2 = new Teacher("Nha", 39, "Nam Ly", 5000000);
        p1.getName();
        p1.getAge();
        p1.getAddress();
        p1.display();
        p1.setName("Duc");
        p1.setAddress("Bac Ly");
        p1.setAge(1);
        p1.display();
        p2.getAge();
        p2.getName();
        p2.getAddress();
        p2.display();
        p2.setName("Cuong");
        p2.setAddress("Hai Thanh");
        p2.setAge(40);
        p2.display();
    }
}
