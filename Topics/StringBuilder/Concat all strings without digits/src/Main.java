import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        StringBuilder builder = new StringBuilder();
        for (String str:strings) {
            for (int i = 0; i<str.length();i++) {
                if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                    builder.append(str.charAt(i));
                }
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}