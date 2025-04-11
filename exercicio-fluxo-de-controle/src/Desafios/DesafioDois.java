package Desafios;

import java.util.Scanner;
/**
 * Resolucao do exercicio 2
 * Data no padrao brasileiro.
 *
 * @author Matheus Assis
 * @version 1.0
 * @since 10/04/2025
 */
public class DesafioDois {
    private boolean valida_semana = true;

    /**
     * Realiza leitura to texto String  com inicio do nome da semana.
     * Exemplo: Segunda, Terca, Quarta.
     * Retorna o indice do item baseado no dia da semana.
     * So finaliza ao digitar o texto esperado, sem acentuacao e com a primeira letra maiuscula.
     */
    public void imprimirSemana() {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Digite a semana desejada");
            String semana = input.next();
            switch (semana) {
                case "Domingo":
                    System.out.println("Indice = " + 1);
                    break;
                case "Segunda":
                    System.out.println("Indice = " + 2);
                    break;
                case "Terca":
                    System.out.println("Indice = " + 3);
                    break;
                case "Quarta":
                    System.out.println("Indice = " + 4);
                    break;
                case "Quinta":
                    System.out.println("Indice = " + 5);
                    break;
                case "Sexta":
                    System.out.println("Indice = " + 6);
                    break;
                case "Sabado":
                    System.out.println("Indice = " + 7);
                    break;
                default:
                    System.out.println("Texto invalido, tente novamente. \n");
                    this.valida_semana = false;
                    break;

            }
        } while (!this.valida_semana);



    }

    public void imprimitInteiro(){
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Digite um numero inteiro:");
            int numero_auxiliar = input.nextInt();
            switch (numero_auxiliar){
                case 1, 2, 3:
                    System.out.println("Certo\n");
                    this.valida_semana = true;
                    break;
                case    4:
                    System.out.println("Errado\n");
                    this.valida_semana = true;
                    break;
                case 5:
                    System.out.println("Talvez\n");
                    this.valida_semana = true;
                    break;
                default:
                    System.out.println("Valor indefinido!\n");
                    this.valida_semana = false;
                    break;
            }

        }while (!this.valida_semana);
    }
}
