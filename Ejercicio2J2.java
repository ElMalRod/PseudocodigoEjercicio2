import java.util.Scanner;

public class Ejercicio2J2 {

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un Numero: ");
        N = sc.nextInt();
        for (int i = 1; i<N; i++) {
            
           System.out.print("\n"+(N-i));
        }

    }
}