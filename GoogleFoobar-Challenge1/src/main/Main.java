// Task manager with quick sort
package main;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Ana's google Foobar challenge!");
        String option = "";

        do {
            List<Integer> list = new ArrayList<Integer>();
            System.out.print("\nPlease enter your numbers here: ");
            Scanner scanner = new Scanner(System.in);

            while (scanner.hasNextBigInteger())
                list.add(scanner.nextInt());

            scanner.nextLine();
            System.out.println("\nType the number of occurrences you wish to remove (x): ");
            int n = scanner.nextInt();
            Solution.solution(list, n);

            System.out.println("Do you want to go again? Y or N");
            option = scanner.next();
        }while(option.toLowerCase().equals("y"));

        System.out.println("\t\t\tGoodbye!");
    }
}
