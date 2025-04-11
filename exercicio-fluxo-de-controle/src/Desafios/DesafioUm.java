package Desafios;

import java.util.Scanner;

/**
 * Resolucao do exercicio 1
 * Data no padrao brasileiro.
 *
 * @author Matheus Assis
 * @version 1.0
 * @since 10/04/2025
 */
public class DesafioUm {


    private boolean valida_mes = true;

    /**
     * Metodo le um inteiro e retorna o nome por extenso.
     * Valida o valor inserido, caso os valores sejam diferentes de 1 a 12,
     * o programa entre repeticao ate que seja informado o valor correto.
     */
    public void imprimirMes() {

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Informe o numero do mes:");
            int mes = input.nextInt();

            validarMes(mes);
            if (this.valida_mes) {
                if (mes == 1) {
                    System.out.println("Janeiro");
                } else if (mes == 2) {
                    System.out.println("Fevereiro");
                } else if (mes == 3) {
                    System.out.println("Marco");
                } else if (mes == 4) {
                    System.out.println("Abril");
                } else if (mes == 5) {
                    System.out.println("Maio");
                } else if (mes == 6) {
                    System.out.println("Junho");
                } else if (mes == 7) {
                    System.out.println("Julho");
                } else if (mes == 8) {
                    System.out.println("Agosto");
                } else if (mes == 9) {
                    System.out.println("Setembro");
                } else if (mes == 10) {
                    System.out.println("Outubro");
                } else if (mes == 11) {
                    System.out.println("Novembro");
                } else if (mes == 12) {
                    System.out.println("Dezembro");
                } else {
                    System.out.println("Mes inavalido! Gentileza informa numero entre 1 e 12! \n");
                }

                if (mes == 1 || mes == 7 || mes == 12) {
                    System.out.println("Ferias!!");
                }

            }
        } while (!this.valida_mes);

        System.out.println("\nMes salvo com sucesso! Finalizando... \n\n");


    }

    /**
     * Recebe um valor inteiro entre 1 e 5.
     * Valores fora desse limite nao encerra o programa.
     * Fazendo com que ele entre em loop ate que seja informado o numero esperado.
     *
     */
    private void validarMes(int mes) {

        if (mes > 12 || mes < 1) {
            this.valida_mes = false;
        }

    }


}
