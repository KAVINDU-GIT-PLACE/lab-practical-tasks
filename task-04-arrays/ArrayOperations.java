import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 34, 67, 23, 56};
        
        System.out.println("=== Array Operations Demo ===");
        
        System.out.print("Original array: ");
        printArray(numbers);
        
        Arrays.sort(numbers);
        System.out.print("Sorted array: ");
        printArray(numbers);
        
        int searchValue = 34;
        int index = Arrays.binarySearch(numbers, searchValue);
        if (index >= 0) {
            System.out.println("Element " + searchValue + " found at index: " + index);
        } else {
            System.out.println("Element " + searchValue + " not found");
        }
        
        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;
        
        for (int num : numbers) {
            sum += num;
            if (num > max) max = num;
            if (num < min) min = num;
        }
        
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average: " + (double)sum / numbers.length);
        
        System.out.println("\n=== 2D Array Demo ===");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println();
    }
}