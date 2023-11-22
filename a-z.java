package huruf.a.z;

public class Main {
    public static void main(String[] args) {
        System.out.println("c. Huruf Z - A:");

        System.out.println("\nMenggunakan for loop:");
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");
        }

        System.out.println("\n\nMenggunakan while loop:");
        char i = 'Z';
        while (i >= 'A') {
            System.out.print(i + " ");
            i--;
        }

        System.out.println("\n\nMenggunakan do-while loop:");
        char j = 'Z';
        do {
            System.out.print(j + " ");
            j--;
        } while (j >= 'A');
    }
}

    

