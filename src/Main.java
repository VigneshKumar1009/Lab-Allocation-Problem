import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int x = scanner.nextInt(); // Capacity of Lab L1
        int y = scanner.nextInt(); // Capacity of Lab L2
        int z = scanner.nextInt(); // Capacity of Lab L3
        int n = scanner.nextInt(); // Number of students

        // Determine the suitable lab
        String lab = allocateLab(x, y, z, n);

        // Print the result
        System.out.println(lab);

        // Close the scanner
        scanner.close();
    }

    static String allocateLab(int x, int y, int z, int n) {
        double ratioL1 = (double) x / n;
        double ratioL2 = (double) y / n;
        double ratioL3 = (double) z / n;

        if (ratioL1 >= ratioL2 && ratioL1 >= ratioL3) {
            return "L1";
        } else if (ratioL2 >= ratioL1 && ratioL2 >= ratioL3) {
            return "L2";
        } else {
            return "L3";
        }
    }
}
