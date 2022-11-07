import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dna = scanner.nextLine();
        String compressed = "";
        char letter = dna.charAt(0);
        int frequency = 1;
        for (int i = 1; i < dna.length(); i++) {
            if (dna.charAt(i) == letter) {
                frequency++;
            } else {
                compressed += letter;
                compressed += frequency;
                letter = dna.charAt(i);
                frequency = 1;
            }
        }
        compressed += letter;
        compressed += frequency;
        System.out.println(compressed);
    }
}