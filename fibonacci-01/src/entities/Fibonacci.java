package entities;

public class Fibonacci {

    // Função para verificar se um número pertence à sequência de Fibonacci
    public static boolean isFibonacciNumber(int n) {
        // Inicializa os dois primeiros números da sequência de Fibonacci
        int x = 0;
        int y = 1;

        // Gera números da sequência até encontrar 'n' ou passar por ele
        while (x <= y) {
            if (x == n) {
                return true;
            }
            int next = x + y;
            x = y;
            y = next;
        }

        return false;
    }
}