package task3;
import java.util.Scanner;

public class MCQSelectionProcess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Sample MCQs
        System.out.println("Choose the correct answer:");
        System.out.println("1. What is 2+2 ?");
        System.out.println("   a) 3");
        System.out.println("   b) 4");
        System.out.println("   c) 5");
        System.out.print("Your answer: ");
              
        String answer = scanner.nextLine();
        
        // Process answer (validate and store)
        System.out.println("Answer selected: " + answer);
    }
}

