import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Rainbow color");
        int X = scanner.nextInt();
        switch (X){
            case 1 : System.out.println("Its red color in Rainbow");break;
            case 2 : System.out.println("Its orange color in Rainbow");break;
            case 3 : System.out.println("Its yellow color in Rainbow");break;
            case 4 : System.out.println("Its green color in Rainbow");break;
            case 5 : System.out.println("Its blue color in Rainbow");break;
            case 6 : System.out.println("Its indigo color in Rainbow");break;
            case 7 : System.out.println("Its violet color in Rainbow");break;
            default :
                System.out.println("Rainbow have only 7 colors");
        }
    }
}
