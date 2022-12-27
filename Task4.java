import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;
        char operation;
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        num1 = iScanner.nextDouble();
        System.out.println("Введите второе число:");
        num2 = iScanner.nextDouble();
        System.out.print("Укажите операцию, которую надо выполнить с этими числами +, -, *, /:\n");
        operation = iScanner.next().charAt(0);
        iScanner.close();
        switch(operation) {
           case '+': result = num1 + num2;
              break;
           case '-': result = num1 - num2;
              break;
           case '*': result = num1 * num2;
              break;
           case '/': result = num1 / num2;
              break;
           default:  System.out.printf("Нет такой операции");
              return;
        }
        System.out.print("\nОтвет:\n");
        System.out.printf(num1 + " " + operation + " " + num2 + " = " + result);
    }
}
    