
import java.util.Scanner;
public class labassign1 {
        public static void main(String[] args) {
            String fname;
            String sname;
            int idno;
            Scanner trial = new Scanner(System.in);
            System.out.print("Enter First Name: ");
            fname = trial.nextLine();
            System.out.print("Enter Last Name: ");
            sname = trial.nextLine();
            System.out.print("Enter ID number: ");
            idno = trial.nextInt();
            System.out.println("****************** \n" + "My name is " + fname + " " +
                    sname + "\nID No: " + idno + "\n******************" );
        }

    }
