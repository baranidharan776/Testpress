import java.util.Scanner;

public class ReverseNumber {

    int value;
    int reverse;

    public ReverseNumber() {
        value = 0;
        reverse = 0;
    }

    public void reverse() {
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Enter a valid 2-4 digit number: ");
            value = input.nextInt();
        }while(value <= 0 || value > 10000);

        while (value > 0) {
            reverse *= 10;
            reverse += value % 10;
            value /= 10;
        }
        System.out.println("Reversed numbers are: " + reverse);
    }

    public static void main(String[] args) {
        ReverseNumber reverseNumber = new ReverseNumber();
        reverseNumber.reverse();
    }

}
