package application;

import java.util.Scanner;

import static entities.CountLetter.countLetterA;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma string: ");
        String userInput = scanner.nextLine();

        // Conta a quantidade de 'a' e 'A'
        int count = countLetterA(userInput);

        if (count > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) ocorre " + count + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' (maiúscula ou minúscula) não ocorre na string.");
        }

        scanner.close();
    }
}