/*Rostik G.
01/29/25
Exercise 3
 */

import java.util.Scanner;


public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        double fahrenheit = getUserInfo();
        while (fahrenheit > - 460) {
            double tempc = calc(fahrenheit);
            System.out.println(tempc);
            outPut(tempc);
            fahrenheit = getUserInfo();


        }

    }

    static double getUserInfo(){
        System.out.println("Enter a temperature in fahrenheit:");
        double fahrenheit = input.nextDouble();
        input.nextLine();
        return fahrenheit;
    }

    static double calc(double a){
        double celsius = ((a - 32) * 5/9);
        return celsius;

    }
    static void outPut(double tempCelsius){
        System.out.println("It is " + tempCelsius + " degrees celcius." );
    }


}