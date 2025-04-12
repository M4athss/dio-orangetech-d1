import movimentobancario.Emprestimo;

public class Main {
    public static void main(String[] args) {
        //Resolucao da parte 1 do exercicio
        /*Scanner input = new Scanner(System.in);
        OperacoesBasicas operacao = new OperacoesBasicas();

        double a = input.nextDouble();
        double b = input.nextDouble();
        operacao.somar(a, b);

        a = input.nextDouble();
        b = input.nextDouble();
        operacao.subtrair(b,a);

        operacao.multiplicar();
        operacao.dividir();



        HoraDia hora = new HoraDia();
        hora.cumprimentar();*/

        Emprestimo novo = new Emprestimo();

        novo.solicitarEmprestimo();

    }
}