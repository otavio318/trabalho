package concurso;

import java.util.Scanner;

public class concursos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de pessoas: ");
        int N = sc.nextInt();
        
       
          String[] nomes = new String[N];
          double[] notaEtapa1 = new double[N];
          double[] notaEtapa2 = new double[N];
          double[] medias = new double[N];
        
        
        for (int i = 0; i < N; i++) {
            System.out.print("Nome da pessoa " + (i + 1) + ": ");
            sc.nextLine();  
            nomes[i] = sc.nextLine();
            
            System.out.print("Nota da etapa 1: ");
            notaEtapa1[i] = sc.nextDouble();
            
            System.out.print("Nota da etapa 2: ");
            notaEtapa2[i] = sc.nextDouble();
            
          
            medias[i] = (notaEtapa1[i] + notaEtapa2[i]) / 2;
        }
        
       
        System.out.println("\nTabela de Pessoas:");
        System.out.println("Nome\tEtapa 1\tEtapa 2\tMédia");
        for (int i = 0; i < N; i++) {
            System.out.printf("%s\t%.1f\t%.1f\t%.1f\n", nomes[i], notaEtapa1[i], notaEtapa2[i], medias[i]);
        }
        
        
        System.out.println("\nPessoas Aprovadas:");
        int aprovados = 0;
        double somaMediasAprovados = 0;
        for (int i = 0; i < N; i++) {
            if (medias[i] >= 70) {
                System.out.println(nomes[i]);
                aprovados++;
                somaMediasAprovados += medias[i];
            }
        }
        
       
        double porcentagemAprovacao = (aprovados * 100.0) / N;
        System.out.printf("\nPorcentagem de aprovação: %.2f%%\n", porcentagemAprovacao);
        
        
        int indiceMaiorMedia = 0;
        for (int i = 1; i < N; i++) {
            if (medias[i] > medias[indiceMaiorMedia]) {
                indiceMaiorMedia = i;
            }
        }
        System.out.println("Pessoa com maior média: " + nomes[indiceMaiorMedia]);
        
        
        if (aprovados > 0) {
            double mediaAprovados = somaMediasAprovados / aprovados;
            System.out.printf("A Média foi: %.2f\n", mediaAprovados);
        } else {
            System.out.println("Não há candidatos aprovados.");
        }
        
        sc.close();
    }
}
