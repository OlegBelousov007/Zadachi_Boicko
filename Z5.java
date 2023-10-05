import java.util.Scanner;

public class Z5 {
    public static void main(String[] args) {
        Scanner z5 = new Scanner(System.in);
        System.out.println("Введите число для поиска его факториала:");
        int n = z5.nextInt();
        int f = 1;
        for (int i = 1; i<=n; i++){
            f = f*i;
        }
        System.out.println("Факториал числа " + n + " равен " + f);
    }
}
