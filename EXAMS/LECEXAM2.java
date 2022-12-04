import java.util.Scanner;
public class LECEXAM2

{
    public static void main(String[] args)
    {

        int i, j, k, n;

        Scanner in = new Scanner(System.in);

        do {

            System.out.println("****ASTERISK****");

            System.out.print("Enter value of star: ");

            n = in.nextInt();

            for (i= 0; i<= n-1 ; i++)

            {

                for (j=0; j<i; j++)

                {



                }

                for (k=i; k<=n-1; k++)

                {

                    System.out.print("*" + " ");

                }

                System.out.println();

            }

            for (i= n-1; i>= 0; i--)

            {

                for (j=0; j<i; j++)

                {



                }

                for (k=i; k<=n-1; k++)
                {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }

        }while (true);

    }

}