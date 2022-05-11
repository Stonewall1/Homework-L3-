import java.util.Scanner;

public class FourteenthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dimension of MultiTable");
        int dimension = scanner.nextInt();
        int[][] MultiplicationTable = new int[dimension][dimension];
        for (int i = 0; i < MultiplicationTable.length; i++) {
            for (int j = 0; j < MultiplicationTable.length; j++) {
                MultiplicationTable[i][j] = (i + 1) * (j + 1);
                System.out.print(MultiplicationTable[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
