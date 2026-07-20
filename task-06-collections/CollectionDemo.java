import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        System.out.println("=== ArrayList Demo ===");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        
        System.out.println("Fruits list: " + fruits);
        System.out.println("Size: " + fruits.size());
        System.out.println("Element at index 2: " + fruits.get(2));
        
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);
        
        System.out.println("Contains Mango? " + fruits.contains("Mango"));
        
        System.out.print("All fruits: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        
        System.out.println("\n=== HashMap Demo ===");
        HashMap<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);
        studentGrades.put("Charlie", 78);
        studentGrades.put("Diana", 95);
        
        System.out.println("Student Grades: " + studentGrades);
        System.out.println("Alice's grade: " + studentGrades.get("Alice"));
        System.out.println("Bob's grade: " + studentGrades.get("Bob"));
        
        studentGrades.put("Bob", 94);
        System.out.println("Updated Bob's grade: " + studentGrades.get("Bob"));
        
        System.out.println("\nAll student grades:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        System.out.println("\n=== HashSet Demo ===");
        HashSet<String> uniqueColors = new HashSet<>();
        uniqueColors.add("Red");
        uniqueColors.add("Blue");
        uniqueColors.add("Green");
        uniqueColors.add("Red");
        
        System.out.println("Unique colors: " + uniqueColors);
        System.out.println("Contains Blue? " + uniqueColors.contains("Blue"));
        System.out.println("Contains Yellow? " + uniqueColors.contains("Yellow"));
        
        uniqueColors.remove("Green");
        System.out.println("After removing Green: " + uniqueColors);
        
        System.out.println("Number of unique colors: " + uniqueColors.size());
        
        System.out.println("\n=== Student Management System ===");
        HashMap<String, ArrayList<String>> studentCourses = new HashMap<>();
        
        studentCourses.put("John", new ArrayList<>(Arrays.asList("Math", "Physics", "CS")));
        studentCourses.put("Maria", new ArrayList<>(Arrays.asList("Biology", "Chemistry", "Math")));
        studentCourses.put("David", new ArrayList<>(Arrays.asList("CS", "English", "History")));
        
        System.out.println("Student Courses:");
        for (Map.Entry<String, ArrayList<String>> entry : studentCourses.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        studentCourses.get("John").add("Art");
        System.out.println("\nJohn's updated courses: " + studentCourses.get("John"));
        
        System.out.println("\nStudents taking CS:");
        for (Map.Entry<String, ArrayList<String>> entry : studentCourses.entrySet()) {
            if (entry.getValue().contains("CS")) {
                System.out.println(entry.getKey());
            }
        }
    }
}