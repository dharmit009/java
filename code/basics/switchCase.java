import java.util.Scanner;

public class switchCase{
    public static void main(String args[]){

        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char input = myscanner.next().charAt(0);

        /*
        int num1 = myscanner.nextInt();
        float num1 = myscanner.nextFloat();
        double num1 = myscanner.nextDouble();
        String num1 = myscanner.nextLine();
        */

        switch(input){
            case 'a':
                    System.out.println("this is a vowel");
                break;
            case 'e':
                    System.out.println("this is a vowel");
                break;
            case 'i':
                    System.out.println("this is a vowel");
                break;
            case 'o':
                    System.out.println("this is a vowel");
                break;
            case 'u':
                    System.out.println("this is a vowel");
                break;
            default:
                System.out.println("this is a consonant");
        }

    }
}
