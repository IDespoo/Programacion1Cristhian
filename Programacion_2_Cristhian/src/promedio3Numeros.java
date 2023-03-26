import java.util.Scanner;
public class promedio3Numeros
{
    public static void main(String[] args)
    {


        int n,p=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tres numeros para sacarle el promedio");

        for (int i = 0; i <= 2; i++) {
            n = sc.nextInt();
            p = n + p;
        }

        System.out.println("El promedio es = " + p / 3);
    }
}
