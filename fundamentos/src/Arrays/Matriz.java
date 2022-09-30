package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int qtdeAlunos = in.nextInt();

        System.out.print("Quantas notas por aluno? ");
        int qtdeNotas = in.nextInt();

        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {

                System.out.printf("Informe a nota%d do aluno %d: ",n +1  , a + 1);

                notasDaTurma[a][n] = in.nextDouble();
                total += notasDaTurma[a][n];
            }
        }

        double media = total / (qtdeAlunos * qtdeNotas);
        System.out.println("Media da turma é: " + media);

        for(double[] notasDoAluno: notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }

        in.close();
    }
}
