package task1;
import java.util.Scanner;

public class DialogUtils {
    private Scanner scanner;

    public DialogUtils() {
        scanner = new Scanner(System.in);
    }

    public int promptForNumber(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public boolean promptForYesNo(String message) {
        System.out.println(message + " (yes/no)");
        String response = scanner.next().toLowerCase();
        return response.equals("yes") || response.equals("y");
    }
}
