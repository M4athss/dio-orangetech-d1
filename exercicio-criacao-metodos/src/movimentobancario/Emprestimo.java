package movimentobancario;

import java.util.Scanner;

public class Emprestimo {
    private String nome;
    private int idade;
    private boolean empregado;
    private double renda_mensal;
    private int parcelas_solicitadas;
    private int parcelas_minimas;
    private double valor_solicitado;
    private static final double SALARIO_MINIMO = 1500.00;

    private boolean habilitado;


    public void solicitarEmprestimo() {
        cadastroBasico();
        validarEmprego();
        validarApto();
    }

    private void cadastroBasico() {
        Scanner input = new Scanner(System.in);

        System.out.println("""
                ########################################################
                ####      Bem vindo ao sistema de Emprestimos!      ####                
                ####  Para iniciarmos, faremos um cadastro basico.  ####
                ########################################################
                                
                Informe o nome:
                """);

        this.nome = input.next();
        System.out.println("Idade:");
        this.idade = input.nextInt();
    }

    private void validarEmprego() {
        Scanner input = new Scanner(System.in);
        boolean aux = false;
        String empregado;
        System.out.println("Esta empregado ou eh aposentado ou pensionista?");
        do {
            empregado = input.next();
            switch (empregado) {
                case "Sim", "sim", "SIM", "S", "s":
                    this.empregado = true;
                    aux = false;
                    System.out.println("Qual a sua renda mensal?");
                    this.renda_mensal = input.nextDouble();
                    break;
                case "Nao", "nao", "NAO", "N", "n":
                    this.empregado = false;
                    aux = false;
                    break;
                default:
                    System.out.println("Resposta invalida!");
                    aux = true;
                    break;
            }
        } while (aux);
    }

    private void validarApto() {
        if (!empregado || this.renda_mensal < this.SALARIO_MINIMO) {
            System.out.println("""
                    ATENCAO!
                    Solicitante Nao esta apto a realizar Emprestimo!
                    O Sistema sera encerrado...
                    """);
            System.exit(0);

        } else {
            System.out.println("Usuario apto a realizar emprestimo");
        }
    }
}
