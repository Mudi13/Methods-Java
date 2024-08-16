import java.util.Scanner;

public class java {

    static boolean isprime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] agrs) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        boolean result = isprime(number);

        if (result) {
            System.out.println(number + " is a prime number");
        }

        else {
            System.out.println(number + " is not a prime number");
        }

    }
}
