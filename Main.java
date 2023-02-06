import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        int num = sc.nextInt();

        // getting number of digits present in a number using
        // method of DigitsInNumber - numberOfDigits(int)
        int numberOfDigits = DigitsInNumber.numberOfDigits(num);

        // closing resource
        sc.close();

        // printing number of digits
        System.out.println(numberOfDigits);
    }
}
