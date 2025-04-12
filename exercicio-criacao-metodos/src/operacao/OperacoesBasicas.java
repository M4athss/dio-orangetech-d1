package operacao;

import java.util.Scanner;

public class OperacoesBasicas {

    /**
     * METODO COM PARAMETROS
     * Informar valores que serao somados para A e B
     * SOMA = A + B
     */
    public void somar(double a, double b){
        System.out.println("A soma de A + B = " + (a+b));
    }

    /**
     * METODO COM PARAMETROS
     * Informar valores que serao subtraidos por A e B
     * SUB = A - B
     */
    public void subtrair(double a, double b){
        System.out.println("A Subtracao de A por B = " + (a-b));
    }

    /**
     * METODO SEM PARAMETROS
     * Chama a classe Scanner e le dois valores x e y.
     * Multiplica x por y.
     * X * Y = VALOR
     */
    public void multiplicar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Multiplicacao de X*Y\nInforme o valor de X:");
        double x = input.nextDouble();
        System.out.println("Informe o valor de Y:");
        double y = input.nextDouble();

        System.out.println("X * Y = " + (x*y));
    }

    /**
     * METODO SEM PARAMETROS
     */
    public void dividir(){
        Scanner input = new Scanner(System.in);

        System.out.println("Divisao de X/Y\nInforme o valor de X:");
        double x = input.nextDouble();
        System.out.println("Informe o valor de Y:");
        double y = input.nextDouble();

        System.out.println("X * Y = " + (x/y));

    }


}
