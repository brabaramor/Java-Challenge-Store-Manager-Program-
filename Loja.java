/* Olá!! :)
    Meu nome é Bárbara Mór da Mata, sou aluna do curso de Sistemas para Internet, estou matriculada na turma GR96002-00581 de Laboratório I
*/

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
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantProdutosEstoque){
       
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        //etapa 2
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        //etapa 4
        this.estoqueProdutos = new Produto[quantProdutosEstoque];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantProdutosEstoque){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        salarioBaseFuncionario = -1.0;
        //etapa 4
        this.estoqueProdutos = new Produto[quantProdutosEstoque];
        
        for(int i = 0; i < estoqueProdutos.length; i++){

        estoqueProdutos[i] = null;
        }
    }

//Métodos para inserir e remover produto (o método de imprimir tá no final do código)
    public boolean insereProduto(Produto produto){

        if (estoqueProdutos[estoqueProdutos.length - 1] != null)
 
            for(int i=0; i < estoqueProdutos.length; i++){
                if(estoqueProdutos[i] == null){
                    estoqueProdutos[i] = produto;
                //esse 'if' acima adiciona um produto na primeira posição nula do array
                    return true;
                }
            }
        return false;
    }

    public boolean removeProduto(String nomeProduto) {
        
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)) {
                estoqueProdutos[i] = null; // Remove o produto, atribuindo nulo à posição
                return true; // Indica que o produto foi removido com sucesso
            }
        }

        return false; // Indica que o produto não foi encontrado no estoque
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
    
    //método alternativo para conseguir achar o 'tipo' da loja na classe Shopping
    public String getTipo() {
        if (this instanceof Alimentacao) {
            return "Alimentação";
        } else if (this instanceof Bijuteria) {
            return "Bijuteria";
        } else if (this instanceof Cosmetico){
            return "Cosmético";
        } else if (this instanceof Informatica){
            return "Informática";
        } else if (this instanceof Vestuario){
            return "Vestuário";
        }
        // Adicione mais condições para outros tipos de lojas, se necessário
        return "Tipo Desconhecido";
    }
}


