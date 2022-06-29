package part1;

import java.util.Scanner;

public class Week {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean a = false;
        //
        System.out.println("1-7");
        do {
            int num = in.nextInt();

            if (num == 1) {
                System.out.println("Понедiлок");
            } else if (num == 2) {
                System.out.println("Вiвторок");
            } else if (num == 3) {
                System.out.println("Середа");
            } else if (num == 4) {
                System.out.println("Четвер");
            } else if (num == 5) {
                System.out.println("П’ятниця");
            } else if (num == 6) {
                System.out.println("Субота");
            } else if (num == 7) {
                System.out.println("Недiля");
            } else {
                System.out.println("Это не 1-7");
            }
        } while (!a);

    }
}
