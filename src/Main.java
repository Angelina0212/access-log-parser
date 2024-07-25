import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int b = new Scanner(System.in).nextInt();
        int result1 = a + b;
        System.out.println("Сумма чисел: " + result1);
        int result2 = a - b;
        System.out.println("Разность чисел: " + result2);
        int result3 = a*b;
        System.out.println("Произведение чисел: " + result3);
        double result4 = (double)a/b;
        System.out.println("Частное чисел: " + result4);
    }
}
