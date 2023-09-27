import java.util.Scanner;
public class BeverageSelector {
    public static void main(String[] Args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please choose your beverage:\n1: Water\n2: Coke\n3: Coffee\nEnter the number corresponding to your beverage:");
    int beverageNumber = scanner.nextInt();

    if (beverageNumber == 1)
        System.out.println("Enjoy your Water");

    else if (beverageNumber == 2)
        System.out.println("Enjoy your Coke");

    else if (beverageNumber == 3)
        System.out.println("Enjoy your Coffee");

    }
}
