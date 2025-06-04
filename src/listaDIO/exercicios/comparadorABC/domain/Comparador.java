package listaDIO.exercicios.comparadorABC.domain;

public class Comparador {
    public boolean isGreaterThanSum(int A, int B, int C){
        int sum = A + B;
        return C > sum;
    }
}
