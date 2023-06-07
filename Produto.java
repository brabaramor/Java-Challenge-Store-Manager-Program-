/* Etapa 1 */
public class Produto{
    private String nome;
    private double preco;
// etapa 2
    private Data dataValidade;
    
// Método Construtor
    public Produto (String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    //etapa 2
        dataValidade = new Data();
    }

//Método de acesso
//Get
    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }
    //etapa 2
    public Data getDataValidade(){
        return dataValidade;
    }

//Set
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    //etapa 2
    public void setDataValidade(){
        this.dataValidade = dataValidade;
    }

//Método toString
    public String toString() {
        return "Nome: " + nome + "/ Preço: " + preco + "/ Data de validade: " + dataValidade;
    }

//Etapa 2: método estaVencido (receber a data atual; comparar com a data de validade e dizer se está vencido)
    public boolean estaVencido(Data dataAtual){
	    int diaValidade = dataValidade.getDia();
	    int mesValidade = dataValidade.getMes();
	    int anoValidade = dataValidade.getAno();
        
        int diaAtual = dataAtual.getDia
}

