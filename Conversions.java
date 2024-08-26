import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Tim Gesell
 * @version 8/21/2022
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Fahrenheit to Kelvin");
        System.out.println("8. Kelvin to Fahrenheit");
        System.out.println("9. Celsius to Kelvin");
        System.out.println("10. Kelvin to Celsius");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            //Fahrenheit to celsius
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            //Celsius to fahrenheit
            System.out.println("Enter Fahrenheit: ");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.printf( "%.2f degrees fahrenheit is %.2f degrees celsius.", fahrenheit, celsius);
        }
        if (selection == 3)
        {
            //Feet and inch to meters
            System.out.println("Enter Feet: ");
            int feet = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Enter Inches: ");
            double inch = keyboard.nextDouble();
            keyboard.nextLine();
            double meter = feet * 0.3048 + inch * 0.0254;
            System.out.printf( feet + " foot " + inch + " inch are %.2f meters.", meter);
        }
        if (selection == 4)
        {
            //Meter to feet and inches
            System.out.println("Enter Meters: ");
            double meter = keyboard.nextDouble();
            keyboard.nextLine();
            int feet = (int)(meter * 3.28084);
            double inch = (meter - feet * 0.3048) * 39.3701;
            System.out.printf( "%.2f meters are " + feet + " feet and %.2f inches.", meter, inch);
        }
        if (selection == 5)
        {
            //Ounces to mililitters
            System.out.println("Enter ounces: ");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double millilitters = ounces * 29.58;
            System.out.printf( "%.2f ounces are %.2f millilitters.", ounces, millilitters);
        }
        if (selection == 6)
        {
            //millilitters to ounces
            System.out.println("Enter millilitters: ");
            double millilitters = keyboard.nextDouble();
            keyboard.nextLine();
            double ounces = millilitters / 29.58;
            System.out.printf( "%.2f millilitters are %.2f ounces.", millilitters, ounces);
        }
        if (selection == 7)
        {
            //fahrenheit to kelvin
            System.out.println("Enter Fahrenheit: ");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double kelvin = (fahrenheit - 32) * 5/9 + 273.15;
            System.out.printf( "%.2f degrees fahrenheit is %.2f degrees kelvin.", fahrenheit, kelvin);
        }
        if (selection == 8)
        {
            //kelvin to fahrenheit
            System.out.println("Enter Kelvin: ");
            double kelvin = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = (kelvin - 273.15) * 9/5 + 32;
            System.out.printf( "%.2f degrees kelvin is %.2f degrees fahrenheit.", kelvin, fahrenheit);
        }
        if (selection == 9)
        {
            //celsius to kelvin
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double kelvin = celsius + 273.15;
            System.out.println(celsius + " degrees celsius is " + kelvin + " degrees kelvin");
        }
        if (selection == 10)
        {
            //kelvin to celsius
            System.out.println("Enter Kelvin: ");
            double kelvin = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = kelvin - 273.15;
            System.out.printf( "%.2f degrees kelvin is %.2f degrees celsius.", kelvin, celsius);
        }
    }
}