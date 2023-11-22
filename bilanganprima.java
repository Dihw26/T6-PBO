package bilangan.prima;


    public class Main {
    public static void main(String[] args) {
        System.out.println("a. Deret Bilangan Prima dan Bukan:");
        for (int num = 0; num <= 20; num++) {
            if (isPrime(num)) {
                System.out.println(num + " adalah bilangan prima.");
            } else {
                System.out.println(num + " bukan bilangan prima.");
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        int i = 2;
        while (i <= num / 2) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }

        i = 2;
        while (true) {
            if (num % i == 0) {
                return false;
            }
            i++;
            if (i > num / 2) {
                break;
            }
        }

        return true;
    }
}

    

