import java.util.Scanner;

public class ControlFlowDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== If-Else Statement ===");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        if (age < 18) {
            System.out.println("You are a minor");
        } else if (age >= 18 && age < 65) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a senior citizen");
        }
        
        System.out.println("\n=== Switch Statement ===");
        System.out.print("Enter a day number (1-7): ");
        int day = scanner.nextInt();
        
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println("Day: " + dayName);
        
        System.out.println("\n=== For Loop ===");
        System.out.println("Numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.println("\n=== While Loop ===");
        int count = 1;
        while (count <= 3) {
            System.out.println("Count: " + count);
            count++;
        }
        
        System.out.println("\n=== Do-While Loop ===");
        int num = 0;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num < 3);
        
        scanner.close();
    }
}