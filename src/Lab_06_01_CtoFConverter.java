/**
 * @author lohbecjz@mail.uc.edu
 */

import java.util.Scanner;

public class Lab_06_01_CtoFConverter
{
    public static void main(String[] args)
    {
        // Declare variables
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0;
        String trash = "";

        // Prompt and input
        System.out.print("Enter temperature in Celsius: ");
        if(in.hasNextDouble())
        {
            celsius = in.nextDouble();
            in.nextLine(); // clear the buffer
        }
        else
        {
            // Not a double. Can't use nextDouble(). Read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("\nMust enter a valid number for Celsius conversion. " + trash + " is not a valid number.");
            System.exit(0); // terminate the program
        }

        // Process and output
        fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");

    }
}