import java.util.Scanner;

public class AplusB7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println("Case #" + i + ": " + (a + b));
        }
        sc.close();
    }
}
