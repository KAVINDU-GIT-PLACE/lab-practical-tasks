public class DataTypesDemo {
    public static void main(String[] args) {
        byte byteVar = 100;
        short shortVar = 10000;
        int intVar = 100000;
        long longVar = 1000000000L;
        
        float floatVar = 3.14f;
        double doubleVar = 3.14159265359;
        
        char charVar = 'A';
        boolean booleanVar = true;
        
        System.out.println("=== Data Types Demo ===");
        System.out.println("Byte: " + byteVar);
        System.out.println("Short: " + shortVar);
        System.out.println("Int: " + intVar);
        System.out.println("Long: " + longVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Double: " + doubleVar);
        System.out.println("Char: " + charVar);
        System.out.println("Boolean: " + booleanVar);
        
        double converted = intVar;
        System.out.println("\nImplicit conversion: int to double = " + converted);
        
        int explicitConversion = (int) doubleVar;
        System.out.println("Explicit conversion: double to int = " + explicitConversion);
    }
}