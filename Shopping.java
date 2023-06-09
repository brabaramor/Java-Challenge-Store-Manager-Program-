public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, Loja[] lojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = lojas;
    }

    // Métodos de acesso para os atributos
    //getters
    public String getNome() {
        return nome;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
    
    public Loja[] getLojas() {
        return lojas
            }

    //setters
     public void setNome(String nome) {
        this.nome = nome;
    }
    
       public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }  
  
    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

//metodos
public Loja insereLoja(){
}

public String removeLoja(){
}

public String quantidadeLojasPorTipo(){
}

public void lojaSeguroMaisCaro(){
}
}

