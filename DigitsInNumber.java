public class DigitsInNumber {

    // tric to find number of digits in a number using maths functions
    public static int numberOfDigits(int num) {
        return (int)(Math.floor(Math.log10(num) + 1));
    }
}
