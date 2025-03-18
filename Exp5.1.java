import java.util.ArrayList;
import java.util.List;

public class IntegerSumCalculator {

    // Method to parse a string into an Integer
    public static Integer parseStringToInteger(String str) {
        try {
            return Integer.parseInt(str);  // Autoboxing happens here
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + str);
            return null;
        }
    }

    // Method to calculate the sum of a list of integers
    public static int calculateSum(List<Integer> integers) {
        int sum = 0;
        for (Integer num : integers) {
            if (num != null) {
                sum += num;  // Unboxing happens here
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Test Case 1: Mix of integers and valid strings
        numbers.add(10);      // Autoboxing int to Integer
        numbers.add(20);
        numbers.add(30);
        numbers.add(parseStringToInteger("40"));
        numbers.add(parseStringToInteger("50"));
        System.out.println("The sum of the list is: " + calculateSum(numbers));

        // Test Case 2: All values parsed from strings
        numbers.clear();
        numbers.add(parseStringToInteger("100"));
        numbers.add(parseStringToInteger("200"));
        numbers.add(parseStringToInteger("300"));
        System.out.println("The sum of the list is: " + calculateSum(numbers));

        // Test Case 3: Invalid input in the list
        numbers.clear();
        numbers.add(parseStringToInteger("50"));
        numbers.add(parseStringToInteger("invalid"));
        numbers.add(parseStringToInteger("70"));
        System.out.println("The sum of the list is: " + calculateSum(numbers));
    }
}
