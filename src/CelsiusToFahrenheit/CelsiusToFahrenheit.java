/*
 * Prompt the user to enter degrees in celsius
 * Convert celsius to fahrenheit with the formula (9.0 / 5.0) * celsius + 32
 * Display the optput of the degrees in fahrenheit
 */
package CelsiusToFahrenheit;
import java.util.Scanner;

/**
 *
 * @author cfull
 */
public class CelsiusToFahrenheit {
    
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter the degrees in Celsius: ");
        celsius = keyboard.nextDouble();
        
        fahrenheit = (9.0 / 5.0) * celsius + 32;
        System.out.println("It's " + fahrenheit + " degrees fahrenheit.");  
    }
    
}
