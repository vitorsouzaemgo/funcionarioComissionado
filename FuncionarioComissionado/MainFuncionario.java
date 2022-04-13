import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args){

        String nome;
        String sobrenome;
        double salario;
        boolean meta;
        double comissao;

        Scanner ler = new Scanner(System.in);

        System.out.printf("Primeiro nome: ");
        nome = ler.next();
        System.out.printf("Segundo nome: ");
        sobrenome = ler.next();
        System.out.printf("Salário: ");
        salario = ler.nextDouble();

        Funcionario f1 = new Funcionario(nome, sobrenome, salario);

        System.out.printf("\nPrimeiro nome: ");
        nome = ler.next();
        System.out.printf("Segundo nome: ");
        sobrenome = ler.next();
        System.out.printf("Salário: ");
        salario = ler.nextDouble();
        System.out.printf("A meta foi atingida? ");
        meta = ler.nextBoolean();
        System.out.printf("Comissão: ");
        comissao = ler.nextDouble();

        FuncionarioComissionado c1 = new FuncionarioComissionado(nome, sobrenome, salario, meta, comissao);

        System.out.println("O salário de "+f1.getPrimeiro_nome()+" "+f1.getSegundo_nome()+" é "+f1.getSalario());

        System.out.println("O salário de "+c1.getPrimeiro_nome()+" "+c1.getSegundo_nome()+" é "+c1.salarioComissionado());
    }
}
