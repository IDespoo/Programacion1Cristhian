package Promedio_N_notas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int nnotas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de notas");
        nnotas=sc.nextInt();
        promedio_n_Numeros notas = new promedio_n_Numeros();
        notas.prmedio(nnotas);
    }
}