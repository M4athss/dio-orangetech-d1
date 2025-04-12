package horario;

import java.util.Scanner;

public class HoraDia {

    /**
     * Imprime no console uma saudacao tendo como input a hora no formato inteiro.
     * Considere o valor para o padrao de relogio 24 horas.
     */
    public void cumprimentar() {
        Scanner input = new Scanner(System.in);
        int hora_dia;
        boolean validar;

        do {
            System.out.println("Considerando o padrao 24 horas\nDigite a hora:");
            hora_dia = input.nextInt();
            validar = (hora_dia < 0 || hora_dia > 24);
            switch (hora_dia) {
                case 6, 7, 8, 9, 10, 11:
                    System.out.println("Bom dia!");
                    break;
                case 12, 13, 14, 15, 16, 17:
                    System.out.println("Boa tarde!");
                    break;
                case 18, 19, 20, 21, 22, 23, 0, 1, 2, 3, 4, 5:
                    System.out.println("Boa noite!");
                    break;
                default:
                    System.out.println("Hora invalida");
                    break;
            }
        }while (validar);
    }
}
