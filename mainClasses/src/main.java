import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class main{


    public static void main(String[]args) throws IOException {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("enter the number of products: ");
        int numberOfItems = keyboard.nextInt();

        System.out.print("enter the price of the product: ");
        float price = keyboard.nextFloat();

        System.out.print("Enter the 2 letters of the State: ");
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        String state=ob.readLine();

        State s =new State();

//        System.out.println(s.getDiscountByState(state));
        System.out.println("Hello World!");
    }
}