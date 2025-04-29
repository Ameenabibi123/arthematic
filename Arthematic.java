public class Arthematic {
    public static void main(String[] args) {
        // Initialize the numbers
        int num1 = 10;
        int num2 = 5;

        // Perform arithmetic operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        // Perform additional calculations: square root and cube root
        double sqrtNum1 = Math.sqrt(num1); // Square root of num1
        double sqrtNum2 = Math.sqrt(num2); // Square root of num2
        double cubeRootNum1 = Math.cbrt(num1); // Cube root of num1
        double cubeRootNum2 = Math.cbrt(num2); // Cube root of num2

        // Display the results
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Square Root of " + num1 + ": " + sqrtNum1);
        System.out.println("Square Root of " + num2 + ": " + sqrtNum2);
        System.out.println("Cube Root of " + num1 + ": " + cubeRootNum1);
        System.out.println("Cube Root of " + num2 + ": " + cubeRootNum2);
    }
}
