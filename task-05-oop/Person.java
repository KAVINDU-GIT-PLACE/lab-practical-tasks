public class Person {
    private String name;
    private int age;
    private String email;
    
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Name cannot be empty");
        }
    }
    
    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        } else {
            System.out.println("Error: Invalid age");
        }
    }
    
    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Error: Invalid email format");
        }
    }
    
    public void displayInfo() {
        System.out.println("=== Person Information ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Email: " + email);
    }
    
    @Override
    public String toString() {
        return String.format("Person[name=%s, age=%d, email=%s]", name, age, email);
    }
}