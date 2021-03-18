package practica1;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
//        ejercicio1();
//        ejercicio2();
//        ejercicio3();
        ejercicio4();
    }

    static void ejercicio1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar numero");
        int n = scanner.nextInt();

        for(int i = 0; i <= 2*n; i++) {
            if(i % 2 == 0) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }

    static void ejercicio2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar n");
        int n = scanner.nextInt();

        System.out.print("Ingresar m");
        int m = scanner.nextInt();

        for(int i = 0; i <= n; i++) {
                System.out.print(i*m);
                System.out.print(" ");
        }
    }

    static void ejercicio3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar n");
        int n = scanner.nextInt();
        boolean prime = true;


        for(int i = 2; i <= Math.sqrt(n); i++) {
            System.out.print(i);
            System.out.print(n % i );

            if(n % i == 0) {
                prime = false;
                break;
            }
        }
        if(prime) {
            System.out.print(n + "  Es primo");
        } else {
            System.out.print(n + " NO Es primo");
        }
    }

    static void ejercicio4() {
        Scanner scanner = new Scanner(System.in);
        int primes_count = 0;
        int current_number = 3;
        System.out.print("Ingresar n");
        int n = scanner.nextInt();
        boolean isPrime = false;
        System.out.print(2);

        while(primes_count < n - 1) {
            isPrime = true;
            for(int i = 2; i <= Math.sqrt(current_number); i++) {
                if(current_number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                primes_count++;
                System.out.print(current_number);
            }
            current_number++;
        }
    }
}
