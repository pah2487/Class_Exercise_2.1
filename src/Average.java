import java.util.Scanner;
import java.io.File;

/**
 * This Program takes the average of 10 numbers separated by ,s
 *@author Patrick Hufnagel
 *@version 1.0
 *@since 2017-9-12
 */
public class Average {
    /**
     * @param args not using any argument
     */
    public static void main(String[] args) throws Exception{
        /* This line initiates the main function*/

        Scanner fsc = new Scanner(new File("C:\\Users\\pengu\\IdeaProjects\\Average\\src\\Numbers.txt"));
        /*opens file numbers.txt*/

        System.out.println("Here are the numbers from Numbers.txt if you want to reference them");
        /*allows user to view numbers from numbers.txt file*/

        System.out.println("\t\t" + fsc.nextLine());
        /*prints out the contents of Numbers.txt */

        fsc.close();
        /*closes file numbers.txt*/

        Scanner sc = new Scanner(System.in).useDelimiter(",");
        /* Starts a new scanner labeled sc*/

        System.out.println("\nGive me 10 numbers and I will find their average.");
        System.out.println("Please separate each number with a comma and end with a comma (x,y,z,)");
        /*initial prompt for user to enter their 10 numbers*/

        int n0 = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        int n6 = sc.nextInt();
        int n7 = sc.nextInt();
        int n8 = sc.nextInt();
        int n9 = sc.nextInt();
        /* each line takes the next number from the input and sets a variable for it to be used later*/

        int sum = (n0 + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9);
        /* adds all of the values together*/

        int avg = (sum / 10);
        /*divides the sum to get the average of the 10 numbers*/

        System.out.println("The numbers you entered are: " + n0 + ", " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + ", " + n6 + ", " + n7 + ", " + n8 + ", " + n9 + ".");
        /* lists the numbers given so the user can confirm thecorrect numbers were entered*/

        System.out.println("Their average is: " + avg);
        /*prints the average*/



    }
}