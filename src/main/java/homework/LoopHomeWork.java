package homework;

import java.util.Scanner;

public class LoopHomeWork {

    public static void main(String[] args) {

        System.out.println("Uzdevums Nr.1");

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int summa = 0;
        while (summa <= 100) {
            System.out.println("Ievadiet veselo skaitli: ");
            number = scanner.nextInt();
            summa = summa + number;
            System.out.println("Ievadīto vērtību summa = " + summa);
        }
        System.out.println("Gatavs! Ievadīto vērtību summa pārsniedz 100! Summa = " + summa);

        System.out.println("\n");
        System.out.println("Uzdevums Nr.2");

        int n;
        System.out.println("Ievadiet naturālo skaitli: ");
        n = scanner.nextInt();
        if (n <= 1){
            System.out.printf("Ievadītais skaitlis %s nav pirmskaitlis: %n", n);
        }
        else if (n % 2 == 0 && n != 2 ){
            System.out.printf("Ievadītais skaitlis %s nav pirmskaitlis: %n", n);
        }
        else if (n % 3 == 0 && n != 3){
            System.out.printf("Ievadītais skaitlis %s nav pirmskaitlis: %n", n);
        }else {
            System.out.printf("Ievadītais skaitlis %s ir pirmskaitlis: %n", n);
        }




        System.out.println("\n");
        System.out.println("Uzdevums Nr.3");

        int[] numberArray = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        String[] autoArray = {"Volvo", "Subaru", "Mercedes", "Lexus", "Toyota"};
        char[] charArray = {'!', '@', '#', '%', '^', '&', '*', '$'};

        int a = 0;
        while (a < numberArray.length) {
            System.out.println(numberArray[a]);
            a++;
        }

        int b = 0;
        while (b < autoArray.length) {
            System.out.println(autoArray[b]);
            b++;
        }

        int c = 0;
        while (c < charArray.length) {
            System.out.println(charArray[c]);
            c++;
        }

        int d = 0;
        do {
            System.out.println(numberArray[d]);
            d++;
        }while (d < numberArray.length);

        int e = 0;
        do {
            System.out.println(autoArray[e]);
            e++;
        }while (e < autoArray.length);

        int f = 0;
        do {
            System.out.println(charArray[f]);
            f++;
        }while (f < charArray.length);

        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);

        }

        for (int i = 0; i < autoArray.length; i++) {
            System.out.println(autoArray[i]);

        }
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);

        }

        for (int j : numberArray) {
            System.out.println(j);

        }
        for (String s : autoArray) {
            System.out.println(s);

        }
        for (char value : charArray) {
            System.out.println(value);

        }



        System.out.println("\n");
        System.out.println("Uzdevums Nr.4");

        int[] array100 = new int[100];

        for (int i = 0; i < array100.length; i++) {
            array100[i]=i*2+2;
        }

        for (int i : array100) {
            System.out.print(i);

        }



        System.out.println("\n");
        System.out.println("Uzdevums Nr.5");

        int faktorials;
        long multiplication = 1L;

        System.out.println("Ievadiet naturālo skaitli: ");
        faktorials = scanner.nextInt();

        while (faktorials > 1) {
            multiplication = multiplication * faktorials;
            faktorials--;
        }
        System.out.println("Faktoriāls ir: " + multiplication);

        System.out.println("\n");
        System.out.println("Uzdevums Nr.6");

        final int pin = 12345;
        int enteredPin;
        int meginajuSkaits = 3;
        do {
            System.out.println("Ievadiet PIN paroli:");
            enteredPin = scanner.nextInt();

            meginajuSkaits = meginajuSkaits - 1;
            if (enteredPin != pin && meginajuSkaits > 0){
                System.out.println("Nepareizs PIN, mēģiniet vēlreiz");
            }
            else if (enteredPin != pin && meginajuSkaits == 0){
                System.out.println("Atvainojiet, bet jūs esat bloķēts");
            }
            else {
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ");
            }

        }
        while ((enteredPin != pin) && (meginajuSkaits > 0));


    }

}