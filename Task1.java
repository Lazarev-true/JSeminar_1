import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = iScanner.nextInt();
        iScanner.close();
        if (n < 1) {
            System.out.printf("Числа от еденицы");
        }
        else{
            System.out.printf("Треугольное число: %d\n", numbers(n));
        }
    }

    public static int numbers(int a) {
        return (a * (a + 1)) / 2;
    }
}