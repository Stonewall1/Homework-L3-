import java.util.Scanner;

public class EighthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive number");
        int X = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= X; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }
}
