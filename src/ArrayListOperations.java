import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            ArrayList<String> cart = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                cart.add(scanner.next());
            }

            String searchItem = scanner.next();

            Collections.sort(cart);

            System.out.println("Sorted Items: " + cart);

            if (cart.contains(searchItem)) {
                System.out.println("Found");
            } else {
                System.out.println("Not Found");
            }
        }

        scanner.close();
    }
}
