package numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //get input
        System.out.println("Enter a natural number:");
        boolean even =false;
        boolean odd = false;
        boolean buzz = false;
        boolean duck= false;

        int natNumber = scanner.nextInt();
        if (natNumber <= 0) {
            System.out.println("This number is not natural!");
        } else {
            if (natNumber % 2 == 1) {
                odd = true;
            } else {
                even = true;
            }
            if (natNumber % 7 == 0 || natNumber%10 == 7) {
                buzz = true;
            }
            if (String.valueOf(natNumber).contains("0")) {
                duck = true;
            }
            System.out.println("Properties of "+natNumber);
            System.out.println("even: "+even);
            System.out.println("odd: "+odd);
            System.out.println("buzz: "+buzz);
            System.out.println("duck: "+duck);
        }
    }
}
