/* Etapa 1: criação da classe */
public class Loja{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
//etapa 2
    private Data dataFundacao;
    private Endereco enderecoLoja;

//Metódos Construtores 
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        //etapa 2
        dataFundacao = new Data();
        enderecoLoja = new Endereco();
    }

    public Loja(String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
    }

//Métodos de acesso
//Get
    public String getNome(){
        return nome;
    }

    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }
        
    //etapa 2
    public Data getDataFundacao(){
        return dataFundacao;
    }
    
    public Endereco getEnderecoLoja(){
        return enderecoLoja;
    }

//Set
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    
    //etapa 2
    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }
    
    public void setEnderecoLoja(Endereco enderecoLoja){
        this.enderecoLoja = enderecoLoja;
    }

//Método toString
    public String toString() {
        return "Nome: " + nome + "/ Quantidade de Funcionários: " + quantidadeFuncionarios + "/ Salário Base dos Funcionários: " + salarioBaseFuncionario;
    }

//Método gastosComSalario
    public double gastosComSalario(){
        if (salarioBaseFuncionario == -1) {
            return -1;
        } else {
            return (salarioBaseFuncionario * quantidadeFuncionarios);
        }
    }

    public char tamanhoDaLoja(){
        if (quantidadeFuncionarios < 10){
            return 'P';
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30 ){
            return 'M';
        } else {
            return 'G';
        }
    }
}

