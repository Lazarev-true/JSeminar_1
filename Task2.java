import java.util.Scanner;
 
public class Task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = iScanner.nextInt();
        iScanner.close();

        if (n < 1) {
            System.out.printf("Числа от еденицы");
        }
        else{
            int result = 1;
            for ( int i = 1; i <= n; i++ ) {
                result *= i;
            }
            System.out.println(result);
        }
    }
}