//Descrição dos Arrays Unidimensionais e Multidimensionais
//Arrays Unidimensionais são estruturas de dados que possuem uma dimensão, 
//são conhecidos como vetores, e funcionam como arranjos de valores do mesmo tipo
//de dado, como se tivessimos uma linha numa tabela onde temos varias celulas e cada uma
//pode receber 1 valor somente.
//Arrays Multidimensionais são matrizes que diferentemente dos vetores tem a capacidade de armazenar
//valores em duas dimensões ou mais

package array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
      
        
        int[] nota = new int[5];
            Scanner entrada = new Scanner(System.in);


            for(int indice=0 ; indice < 5 ; indice++){
                System.out.print("\nInsira o primeiro número " + (indice+1) + ": ");
                nota[indice] = entrada.nextInt();
            }


            for(int indice=0 ; indice < 5 ; indice++){
                System.out.printf("Número %d -> Valor armazenado: %d\n",indice+1, nota[indice]);
            }
        int[][] matriz = new int[3][3];

            System.out.println("Matriz M[3][3]\n");

            for(int linha=0 ; linha < 3 ; linha++){
                for(int coluna = 0; coluna < 3 ; coluna ++){
                    System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
                    matriz[linha][coluna]=entrada.nextInt();
                }
            }

            System.out.println("\nA Matriz ficou: \n");
            for(int linha=0 ; linha < 3 ; linha++){
                for(int coluna = 0; coluna < 3 ; coluna ++){
                    System.out.printf("\t %d \t",matriz[linha][coluna]);
                }
                System.out.println();
            }
    }
    }
    

