package listaDIO.exercicios.comparadorABC.test;

import listaDIO.exercicios.comparadorABC.domain.Comparador;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        int A = input.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = input.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = input.nextInt();

        Comparador comparador = new Comparador();
        boolean comparacao = comparador.isGreaterThanSum(A, B, C);
        if (comparacao){
            System.out.println("C -> " + C + " é maior que a soma de A -> " + A + " e B -> " + B);
        }
        else {
            System.out.println("C -> " + C + " é menor que a soma de A -> " + A + " e B -> " + B);
        }
    }
}
