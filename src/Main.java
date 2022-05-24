import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Basamak sayisini giriniz: ");
        n = input.nextInt();

        /*for (int i = 1; i <= 6; i++){
            for (int k = 1; k <= (n-i); k++){
                System.out.print(" ");
            }

            for (int j = 1; j <= ((2*i) - 1); j++){
                System.out.print("*");
            }

            System.out.println();
        }*/

        for (int i = 1; i <= n; i++){
            for (int j=1; j <= (n-i); j++){
                System.out.print(" ");
            }

            for (int k = 1; k <= (2*i-1); k++){
                System.out.print("*");
            }

            System.out.println();
        }

        for (int k = 1; k <= n; k++){
            for (int z = 1; z <= k; z++){
                System.out.print(" ");
            }

            for (int u = 1; u <= 2*(n-k)-1; u++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
