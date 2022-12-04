import java.util.Scanner;
public class QUIZ1 {
    public static void main(String[] args)

    {



        int i, j, rows;

        Scanner sc = new Scanner(System.in);

        System.out.println("*****STAR*****");

        System.out.println(" ");

        System.out.print("Enter the number of stars: ");

        rows = sc.nextInt();

        for (i=rows-1; i>=0; i--)

        {

            for(j=0; j <= i;j++)

            {

                System.out.print("*"+ " ");

            }

            System.out.println();

        }

    }

}