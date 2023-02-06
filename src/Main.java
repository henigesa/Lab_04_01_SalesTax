//import scanner
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declare variables
        int priceItem ;
        double salesTax ;
        //prompt user to enter the price of the item
        System.out.println("Please enter the price of your item:");
        //take the user input
               priceItem = input.nextInt() ;
               //calculate sales tax
                    salesTax = priceItem * 0.05 ;
        //output the calculated sales tax to the user
        System.out.println("Your 5% sales tax is $" + salesTax) ;
    }
}