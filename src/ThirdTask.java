import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int X = scanner.nextInt();
        if(X % 2 == 0){
            System.out.println("Number " + X + " is even");
        }
        else System.out.println("Number " + X + " is odd");
    }
}
