/* Etapa 1: criação da classe */
public class Loja{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
//etapa 2
    private Endereco endereco;
    private Data dataFundacao;
//etapa 4
    private Produto[] estoqueProdutos;

//Metódos Construtores 
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Produto[] estoqueProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        //etapa 2
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        //etapa 4
        this.estoqueProdutos = estoqueProdutos;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, Produto[] estoqueProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        salarioBaseFuncionario = -1.0;
        this.estoqueProdutos = estoqueProdutos;

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
    
    public Endereco getEndereco(){
        return endereco;
    }

    //etapa4
    public Produto[] getEstoqueProdutos(){
        return estoqueProdutos;
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
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    // etapa 4
    public void setEstoqueProdutos(Produto[] estoqueProdutos){
        this.estoqueProdutos = estoqueProdutos;
    }

//Método toString
    public String toString() {
        return "Nome: " + nome + "/ Quantidade de Funcionários: " + quantidadeFuncionarios + "/ Salário Base dos Funcionários: " + salarioBaseFuncionario + "/ Data de Fundação: " + dataFundacao + "/ Endereço da Loja: " + endereco + "/ Estoque de Produtos: " + estoqueProdutos;
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
//etapa 4
    public void imprimeProdutos(){
        System.out.println("Estes são os produtos do estoque: ");
        //criar novo Produto da classe produto para armazenar o nome que o usuario colocar

        for (Produto produto : estoqueProdutos){
            if (produto != null){
            System.out.println(produto);
            }
        }

    }

    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    public String removeProdutos(){
    }
}
