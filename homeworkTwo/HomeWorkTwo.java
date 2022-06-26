package homeworkTwo;
import javax.xml.namespace.QName;
import java.util.Scanner;
public class HomeWorkTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi x: ");
        int x;
        x = scanner.nextInt();
        boolean isPositiveNum = true;
        boolean isNegativeNum = false;
        if (x >= 0) {
            System.out.println(isPositiveNum);
        } else {
            System.out.println(isNegativeNum);
        }

// uzdevums 2

        System.out.println("Ievadi menesa numuru");
        int month;
        month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("Janvaris");
                break;
            case 2:
                System.out.println("Februaris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprilis");
                break;
            case 5:
                System.out.println("Maijs");
                break;
            case 6:
                System.out.println("Junijs");
                break;
            case 7:
                System.out.println("Julijs");
                break;
            case 8:
                System.out.println("Augusts");
                break;
            case 9:
                System.out.println("Septembris");
                break;
            case 10:
                System.out.println("Oktobris");
                break;
            case 11:
                System.out.println("Novembris");
                break;
            case 12:
                System.out.println("Decembris");
                break;
            default:
                System.out.println("Nav tada menesa");
        }

        // uzdevums 3

        System.out.println("Ievadi skaitli a");
        int a;
        a = scanner.nextInt();
        System.out.println("Ievadi skaitli b");
        int b;
        b = scanner.nextInt();
        System.out.println("Ievadi skaitli c");
        int c;
        c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("lielaks ir a");
        } else if (b > a && b > c) {
            System.out.println("lielaks ir b");
        } else if (c > a && c > b) {
            System.out.println("lielaks ir c");
        } else {
            System.out.println("All numbers are equal");

        }
// uzdevums 4

        Scanner newScanner = new Scanner(System.in);

        String darbibaViens = "Stop";
        String darbibaDivi = "Wait";
        String darbibaTris = "Go";
        System.out.println("Traffic light color");
        String trafficLight = newScanner.nextLine();

        if (trafficLight.equals("Red")) {
            System.out.println(darbibaViens);
        }
        else if (trafficLight.equals("Yellow")) {
                System.out.println(darbibaDivi);
        }
        else if (trafficLight.equals("Green")) {
            System.out.println(darbibaTris);
        }
        else {
            System.out.println("Watch both sides and cross if no cars");
        }

//5 uzdevums
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

        // 6 uzdevums
        printBusinessCardTwo("Liga", "Kalnina", "+371123123123", "1965");
        printBusinessCardTwo("Juris", "Vitols", "+37123456789", "1930");

        // 7 uzdevums
        int summa = sum(4, 10);
        System.out.println(summa);

        // 8 uzdevums
        System.out.println(average(10.2, 23.4, 421.4));
    }

    // 5 uzdevums
    public static void printBusinessCard () {
        System.out.println("5 uzdevums");
        System.out.println("Vizitkarte");
        System.out.println("###############");
        String vards = "Vards: Janis";
        System.out.println(vards);
    String uzvards = "Uzvards: Berzins";
        System.out.println(uzvards);
    String telNumurs = "Telefona numurs: +37112345678";
        System.out.println(telNumurs);
    String dzimsanasGads = "Dzimsanas gads: 1990";
        System.out.println(dzimsanasGads);


    }
//6 uzdevums
    public static void printBusinessCardTwo(String name, String surname, String telephone, String dateOfBirth) {
        System.out.println("6 uzdevums");
        System.out.println("Vizitkarte");
        System.out.println("###############");
        System.out.println("Vards: " + name);
        System.out.println("Uzvards: " + surname);
        System.out.println("Telephone number: " + telephone);
        System.out.println("Date of birth: " + dateOfBirth);
    }

    public static int sum (int a, int b){
        System.out.println("7 Uzdevums");
        return a+b;
    }

    public static double average (double a, double b, double c){
        System.out.println("8 Uzdevums");
        return (a + b + c) / 3;
    }

}
