import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= 1000; i++) {
            boolean value = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    value = false;
                    break;
                }
            }

            if (value) {
                primes.add(i);
            }
        }
        System.out.println("Простые числа: " + primes);
    }
}