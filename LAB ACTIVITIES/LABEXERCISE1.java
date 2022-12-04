import java.util.Scanner;
/* UM GRADING SYSTEM */
public class LABEXERCISE1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("**********GRADING SYSTEM**********");
        double sciIni, sciTotal, engIni, filIni, filTotal;
// SCIENCE
        System.out.println("Science Initial Score: ");
        sciIni = input.nextDouble();
        System.out.println("Science Total Score: ");
        sciTotal = input.nextDouble();
// ENGLISH
        System.out.println("English Initial Score: ");
        engIni = input.nextDouble();
        System.out.println("English Total Score: ");
        //FILIPINO
        System.out.println("Filipino Initial Score: ");
        filIni = input.nextDouble();
        System.out.println("Filipino Total Score: ");
        /* CONDITIONS */
        double sciAve, engAve, filAve;
        sciAve = Math.round(sciIni/sciTotal * 85) + 15;
        System.out.println("Science Grade: " + sciAve);
        engAve = Math.round(engIni/sciTotal * 85) + 15;
        System.out.println("Science Grade: " + engAve);
        filAve = Math.round(filIni/sciTotal * 85) + 15;
        System.out.println("Science Grade: " + filAve);
        if(sciAve>75) {
            System.out.println("SCIENCE PASSED");
        } else {
            System.out.println("SCIENCE FAILED");
        }
        if(engAve>75) {
            System.out.println("ENGLISH PASSED");
        } else {
            System.out.println("ENGLISH FAILED");
        }
        if(filAve>75) {
            System.out.println("FILIPINO PASSED");
        } else {
            System.out.println("FILIPINO FAILED");
        }
    }

}