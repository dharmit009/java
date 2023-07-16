import java.util.Scanner;

public class userinput{

    public static void main(String args[]){

        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = myscanner.nextInt();
        System.out.println("Number: " + num1);

    }
}
