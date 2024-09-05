package application;

import java.util.Scanner;

import static entities.Fibonacci.isFibonacciNumber;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        try {
            int number = scanner.nextInt();

            // Verifica se o número pertence à sequência de Fibonacci
            if (isFibonacciNumber(number)) {
                System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
            }
        } catch (Exception e) {
            System.out.println("Por favor, informe um número inteiro válido.");
        } finally {
            scanner.close();
        }
    }
}
