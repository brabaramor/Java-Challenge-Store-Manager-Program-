public class Informatica extends Loja{
    private double seguroEletronicos;

    //Método construtor
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos, int quantProdutosEstoque){

        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantProdutosEstoque);
        this.seguroEletronicos = seguroEletronicos;
    }
//métodos de acesso
    //get 
    public String getNome(){
        return super.getNome();
    } 

    public int getQuantidadeFuncionarios(){
        return super.getQuantidadeFuncionarios();
    }

    public double getSalarioBaseFuncionario(){
        return super.getSalarioBaseFuncionario();
    }

    public Endereco getEndereco(){
        return super.getEndereco();
    }

    public Data getDataFundacao(){
        return super.getDataFundacao();
    }
    //novo atributo 
    public double getSeguroEletronicos(){
        return seguroEletronicos;
    }

    //set
    public void setNome(String nome){
        super.setNome(nome);
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        super.setQuantidadeFuncionarios(quantidadeFuncionarios);
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        super.setSalarioBaseFuncionario(salarioBaseFuncionario);
    }

    public void setEndereco(Endereco endereco){
        super.setEndereco(endereco);
    }

    public void setDataFundacao(Data dataFundacao){
        super.setDataFundacao(dataFundacao);
    }
    //novo atributo
    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }

    // sobrescrever toString
    public String toString() {
        return super.toString() + "/ Seguro dos Eletrônicos: " + seguroEletronicos;
    }
}