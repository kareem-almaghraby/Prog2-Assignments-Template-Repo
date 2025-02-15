// kareem ayman abdellaziz
// 20216406
import java.util.Scanner;

public class Main {
    private static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        
        for (int i = 0; i < t; i++) {
           
            int x = sc.nextInt();

            if (isPrime(x)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not");
            }
        }
    }

    
} //05
