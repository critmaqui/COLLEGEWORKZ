
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class COLLEGEWORKZ {
    Scanner arrayScanner;

    void array() {
        this.arrayScanner = new Scanner(System.in);
    }

    void mainFunction() throws IOException {
        ArrayList<Integer> arrayContainer = new ArrayList();
        boolean BREAKER = false;
        int incrementer = 0;

        do {
            try {
                System.out.print("Enter Value for Index " + incrementer + ": ");
                arrayContainer.add(this.arrayScanner.nextInt());
                if ((Integer)arrayContainer.get(arrayContainer.size() - 1) < 0) {
                    arrayContainer.remove(arrayContainer.size() - 1);
                    System.out.println("Negative Input!");
                    BREAKER = true;
                }
            } catch (InputMismatchException var5) {
                System.out.println("Invalid Input!");
                BREAKER = true;
            }

            ++incrementer;
        } while(!BREAKER);

        System.out.println("List of entered values = " + String.valueOf(arrayContainer));
    }
}
