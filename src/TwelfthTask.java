public class TwelfthTask {
    public static void main(String[] args) {
        int sum;
        int prev1 = 1;
        int prev2 = 0;
        System.out.println(prev1);
        for (int i = 0; i < 10 ; i++) {
            sum = prev1 + prev2;
            System.out.println(sum);
            prev2 = prev1;
            prev1 = sum;
        }
    }
}
