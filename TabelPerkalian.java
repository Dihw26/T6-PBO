package perkalian;

import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nilai n (kurang dari atau sama dengan 10): ");
            int n = scanner.nextInt();
            if (n <= 0 || n > 10) {
                System.out.println("Masukkan nilai n yang valid (1-10).");
            } else {
                System.out.println("Tabel Perkalian " + n + " x " + n + ":");
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        System.out.print(i * j + "\t");
                    }
                    System.out.println();
                }
            }
        }
    }
}


