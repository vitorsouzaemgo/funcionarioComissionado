public class FuncionarioComissionado extends Funcionario{
    private boolean metaAtingida;
    private double comissao;
    private double salarioComissionado;

    public FuncionarioComissionado(String primeiro_nome, String segundo_nome, double salario, boolean metaAtingida, double comissao){
        super(primeiro_nome, segundo_nome, salario);
        this.metaAtingida = metaAtingida;
        this.comissao = comissao;
    }

    public boolean getMetaAtingida(){
        return metaAtingida;
    }

    public double getComissao(){
        return comissao;
    }

    public double salarioComissionado(){
        if(this.metaAtingida == true){
            this.salarioComissionado = getSalario() * (1 + this.getComissao());
            return this.salarioComissionado;
        }
        else{
            return getSalario();
        }
    }
}
