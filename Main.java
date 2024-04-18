import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter in a float or quit to quit: ");
        String input = scanner.nextLine();
        ArrayList<Float> numbers = new ArrayList<Float>();
        int errorCount = 0;
        while(!input.equals("quit")) {
            try {
                float number = Float.parseFloat(input);
                System.out.println("You entered: " + number);
                numbers.add(number);
                errorCount = 0;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a float.");
                errorCount++;
                if (errorCount > 2) {
                    System.out.println("Too many errors. Exiting program.");
                    break;
                }
            }
            System.out.print("Enter in a float or quit to quit: ");
            input = scanner.nextLine();
        }
        scanner.close();
        System.out.println("The sum of the numbers is: " + sum(numbers));
    }

    private static float sum(ArrayList<Float> numbers) {
        float sum = 0;
        for (float number : numbers) {
            sum += number;
        }
        return sum;
    }
}