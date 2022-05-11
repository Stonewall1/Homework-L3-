import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select month number");
        int month = scanner.nextInt();

        if(month == 12 || month == 1 ||month == 2 ){
            System.out.println("Its Winter");
        }
        else if(month == 3 || month == 4 ||month == 5){
            System.out.println("Its Autumn");
        }
        else if(month == 6 || month == 7 ||month == 8){
            System.out.println("Its Summer");
        } else if (month == 9 || month == 10 ||month == 11) {
            System.out.println("Its Spring");
        }
        else{
            System.out.println("No such month");
        }
    }
}

