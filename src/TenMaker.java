import java.util.Scanner;
public class TenMaker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a whole number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter a whole number: ");
        int secondNumber = scanner.nextInt();

        int total = makes10(firstNumber, secondNumber);

        if (total == 10)
            System.out.println("Your numbers add up to 10");
        else
            System.out.println("Your numbers do not add up to 10");
    }

    public static int makes10(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
}
