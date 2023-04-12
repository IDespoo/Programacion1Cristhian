package Promedio_N_notas;

import java.util.Scanner;
public class promedio_n_Numeros
{
    public void prmedio(int notas)
    {
        double n, p = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < notas; i++) {
            System.out.println("Ingrese la nota");
            String var = sc.next();
            n=Double.valueOf(var);
            p = n + p;
        }

        System.out.println("El promedio es = " + p / notas);
    }
}
