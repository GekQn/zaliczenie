import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Zadanie 2.1: Hello World
        System.out.println("Hello World!!!");

        // Zadanie 2.2: Wypisywanie liczby
        int number = 42;
        System.out.println("Wartość zmiennej: " + number);

        // Zadanie 2.3: Suma
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        double a = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę:");
        double b = scanner.nextDouble();
        double sum = a + b;
        System.out.println("Suma: " + sum);

        // Zadanie 2.4: Kalkulator
        System.out.println("Wybierz operację: 1 - suma, 2 - różnica, 3 - iloczyn, 4 - iloraz");
        int operation = scanner.nextInt();
        System.out.println("Podaj pierwszą liczbę:");
        double x = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę:");
        double y = scanner.nextDouble();
        double result = 0;
        switch (operation) {
            case 1:
                result = x + y;
                break;
            case 2:
                result = x - y;
                break;
            case 3:
                result = x * y;
                break;
            case 4:
                if (y != 0)
                    result = x / y;
                else
                    System.out.println("Nie można dzielić przez zero!");
                break;
            default:
                System.out.println("Niepoprawny wybór operacji.");
        }
        if (operation >= 1 && operation <= 4) {
            System.out.println("Wynik: " + result);
        }

        // Zadanie 2.5: Liczby parzyste
        System.out.println("Liczby parzyste do 100:");
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }

        // Zadanie 2.6: Test liczby pierwszej
        System.out.println("Podaj liczbę do sprawdzenia czy jest liczbą pierwszą:");
        int numToCheck = scanner.nextInt();
        boolean isPrime = true;
        if (numToCheck <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numToCheck); i++) {
                if (numToCheck % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime)
            System.out.println(numToCheck + " jest liczbą pierwszą.");
        else
            System.out.println(numToCheck + " nie jest liczbą pierwszą.");
    }
}
