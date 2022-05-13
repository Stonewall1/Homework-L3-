import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select month number");
        int month = scanner.nextInt();
        switch(month){
            case 1 :
            case 2 :
            case 12 :
                System.out.println("Its Winter");break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Its Autumn");break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("Its Summer");break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("Its Spring");break;
            default : System.out.println("No such month");
        }
    }
}
