import java.util.Scanner;
public class promedio_n_Numeros
{
    public static void main(String[] args)
    {


    double n,p=0;
    int notas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de notas a las que desea sacar el promedio");
        notas = sc.nextInt();

            for (int i = 0; i < notas; i++)
            {
                System.out.println("Ingrese la nota");
                n = sc.nextDouble();
                p = n + p;
            }

        System.out.println("El promedio es = " + p / 3);
    }
}
