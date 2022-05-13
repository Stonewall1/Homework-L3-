import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature");
        int t = scanner.nextInt();
        if(t <= -20){
            System.out.println("Its cold");
        }
        else if(t <= -5){
            System.out.println("Its normal");
        }
        else System.out.println("Its warm");
    }
}
