import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LABEXAM3 {
    // GI COPYA KO LANG NING CODE SAKONG KLASMET KAY HAWD KAAYO
    public static void main(String[] args) {
        parallelogram functionParalellogram = new parallelogram();
        stars functionStars = new stars();
        array functionArray = new array();
        Scanner scan = new Scanner(System.in);
        int mainMenu = 0;
        int pressOne = 0;
        System.out.print("ENTER 1 TO PROCEED: ");
        pressOne = scan.nextInt();

        if (pressOne != 1) {
            System.out.println("Okay, Goodbye!");
            System.exit(1);
        }

        System.out.println("\nMAIN MENU SELECTION: \n[1] FORMULA FOR PARALLELOGRAM \n[2] LOOP \n[3] ARRAY");
        System.out.print("Enter selection: ");
        mainMenu = scan.nextInt();

        switch (mainMenu) {
            case 1:
                System.out.println("\nFOR CASE 1: \n[1] SOLVE AREA \n[2] SOLVE HEIGHT \n[3] SOLVE BASE ");
                System.out.print("Enter Solving Method: ");
                functionParalellogram.subLoop(scan.nextInt());
                break;
            case 2:
                functionStars.generateStar();
                break;
            case 3:
                try {
                    functionArray.mainFunction();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            default:
                System.out.println("Incorrect Input!");
                break;
        }
    }
}

class parallelogram {
    public static Scanner scannerParallel = new Scanner(System.in);
    public static double area, base, height;

    static void subLoop(int selection) {
        switch (selection) {
            case 1:
                case1();
                break;
            case 2:
                case2();
                break;
            case 3:
                case3();
                break;
            default:
                System.out.println("Incorrect output");
        }
    }

    static void case1() {
        System.out.println("ENTER HEIGHT OF PARALLELOGRAM:");
        height = scannerParallel.nextInt();
        System.out.println("ENTER BASE OF PARALLELOGRAM:");
        base = scannerParallel.nextInt();

        area = base * height;

        System.out.println("AREA OF PARALLELOGRAM IS: " + area);
    }

    static void case2() {
        System.out.println("ENTER AREA OF PARALLELOGRAM:");
        area = scannerParallel.nextInt();
        System.out.println("ENTER BASE OF PARALLELOGRAM:");
        base = scannerParallel.nextInt();

        height = area / base;
        System.out.println("HEIGHT OF PARALLELOGRAM IS: " + height);
    }

    static void case3() {
        System.out.println("ENTER AREA OF PARALLELOGRAM:");
        area = scannerParallel.nextInt();
        System.out.println("ENTER HEIGHT OF PARALLELOGRAM:");
        height = scannerParallel.nextInt();

        base = height / area;
        System.out.println("BASE OF PARALLELOGRAM IS: " + height);
    }
}

class stars {
    Scanner scannerStars = new Scanner(System.in);

    void generateStar() {
        int starla = 1;
        int starlaa = 1;
        do {
            System.out.println("\nENTER SIZE OF STAR: ");
            mainGenerator(scannerStars.nextInt());

            System.out.println();
            System.out.println("Do you want to continue?");
            System.out.println("" +
                    "\n[1] - Yes" +
                    "\n[0] - No\n");
            System.out.print("Enter here: ");
            starlaa = scannerStars.nextInt();

            if (starlaa == 1 || starlaa == 1) {
                starla = 1;
            } else {
                starla = 0;
            }
        } while (starla == 1);
    }

    void mainGenerator(int size) {
        for (int rows = 0; rows < size; rows++) {
            for (int columns = rows; columns < size; columns++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int row = 1; row <= size; ++row) {
            for (int column = 1; column <= size; ++column) {
                if (column <= row) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}

class array {
    Scanner arrayScanner = new Scanner(System.in);

    void mainFunction() throws IOException {
        ArrayList<Integer> arrayContainer = new ArrayList<>();
        int BREAKER = 0;
        int incrementer = 0;
        do {
            try {
                System.out.print("Enter Value for Index " + incrementer + ": ");
                arrayContainer.add(arrayScanner.nextInt());
                if (arrayContainer.get(arrayContainer.size() - 1) < 0) {
                    arrayContainer.remove(arrayContainer.size() - 1);
                    System.out.println("Negative Input!");
                    BREAKER = 1;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input!");
                BREAKER = 1;
            }
            incrementer++;
        } while (BREAKER == 0);
        System.out.println("List of entered values = " + arrayContainer);
    }
}