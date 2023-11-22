package javaapplication25;


    public class Main {
    public static void main(String[] args) {
        System.out.println("b. Deret Bilangan Ganjil dan Genap:");
        
        System.out.println("Menggunakan for loop:");
        for (int num = 0; num <= 20; num++) {
            if (num % 2 == 0) {
                System.out.println(num + " adalah bilangan genap.");
            } else {
                System.out.println(num + " adalah bilangan ganjil.");
            }
        }

        System.out.println("\nMenggunakan while loop:");
        int i = 0;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap.");
            } else {
                System.out.println(i + " adalah bilangan ganjil.");
            }
            i++;
        }

        System.out.println("\nMenggunakan do-while loop:");
        int j = 0;
        do {
            if (j % 2 == 0) {
                System.out.println(j + " adalah bilangan genap.");
            } else {
                System.out.println(j + " adalah bilangan ganjil.");
            }
            j++;
        } while (j <= 20);
    }
}

    

