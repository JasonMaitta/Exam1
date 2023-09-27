import java.util.Scanner;
public class Summer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int userNumber;

        while (true) {
            System.out.print("Enter a number or enter 0 to quit and see your total; ");
            userNumber = scanner.nextInt();

            total += userNumber;

            if (userNumber == 0) {
                System.out.println("Here is your total: " + total);
                break;
            }


        }
    }
}
