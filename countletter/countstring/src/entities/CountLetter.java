package entities;

public class CountLetter {
    // Função para contar a ocorrência de 'a' e 'A' em uma string
    public static int countLetterA(String word) {
        int count = 0;
        // Converte a string para minúsculas para simplificar a contagem
        String lowerCaseWord = word.toLowerCase();

        // Conta a ocorrência de 'a'
        for (char c : lowerCaseWord.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }

        return count;
    }
}