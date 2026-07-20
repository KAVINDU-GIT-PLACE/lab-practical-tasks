public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice Johnson", 25, "alice@email.com");
        Person person2 = new Person("Bob Smith", 30, "bob@email.com");
        
        person1.displayInfo();
        System.out.println();
        person2.displayInfo();
        System.out.println();
        
        System.out.println("=== Testing Setters ===");
        person1.setName("Alice J.");
        person1.setAge(26);
        person1.setEmail("alice.j@email.com");
        
        person1.displayInfo();
        System.out.println();
        
        System.out.println("Using toString(): " + person2.toString());
        
        System.out.println("\n=== Person Array ===");
        Person[] people = {
            new Person("Charlie Brown", 22, "charlie@email.com"),
            new Person("Diana Prince", 28, "diana@email.com"),
            new Person("Evan Wright", 35, "evan@email.com")
        };
        
        for (Person p : people) {
            System.out.println(p);
        }
    }
}