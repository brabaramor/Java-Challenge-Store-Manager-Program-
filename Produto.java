/* Etapa 1 */
public class Produto{
    private String nome;
    private double preco;
    
// Método Construtor
    public Produto (String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

//Método de acesso
//Get
    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

//Set
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

//Método toString
    public String toString() {
        return "Nome: " + nome + "/ Preço: " + preco;
    }
}
/* Fim da Etapa 1 */