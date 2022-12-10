import java.util.Scanner;

public class task1
{
    public static int remainder(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        double res = remainder(a, b);
        System.out.print(res);
    }
}
