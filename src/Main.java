import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
    double meters = 0;
    double miles = 0;
    double feet = 0;
    double inches = 0;
    String trash;

        System.out.println("Enter measurement in meters: ");

        if(in.hasNextDouble())
        {
            meters = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered \"" + trash + "\"");
            System.out.println("Please rerun the program and enter a valid number");
            System.exit(0);
        }

        miles = meters / 1609;
        feet = meters * 3.281;
        inches = meters * 39.37;

        System.out.println(meters + " meters is equivalent to:");
        System.out.println(miles + " miles");
        System.out.println("or");
        System.out.println(feet + " feet");
        System.out.println("or");
        System.out.println(inches + " inches");
    }
}
