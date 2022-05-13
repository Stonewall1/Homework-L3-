import java.util.Scanner;

public class ThirteenthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how much $ you want to deposit");
        float deposit = scanner.nextFloat();
        System.out.println("Enter amount of months you want to keep your deposit in bank");
        int months = scanner.nextInt();
        float result = deposit;
        for (int i = 0; i < months; i++) {
            result = (float) ((result * 0.07) + result);
        }
        System.out.println("You will receive " + result + " $");
    }
}
