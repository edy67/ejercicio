import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de lotes: ");
        int m = scanner.nextInt();
        int l = 0;

        for (int i = 1; i <= m; i++) {
            Scanner scannerNum = new Scanner(System.in);
            System.out.print("Ingrese n: ");
            int n = scannerNum.nextInt();
            int t = 8;
            int p = 9;

            while (n != 0) {
                int d = n % 10;

                if (d % 2 == 0) {
                    if (d < t) {
                        t = d;
                    }
                }
                if (d % 2 != 0) {
                    if (d <= p) {
                        p = d;
                    }
                }
                n = n / 10;
            }
            int nv = t * 10 + p;
            System.out.println("El nuevo número del lote " + i + " es: " + nv);
            l = l * 100 + nv;
        }
        System.out.println("Número combinado de todos los lotes: " + l);
    }
}
        
    
