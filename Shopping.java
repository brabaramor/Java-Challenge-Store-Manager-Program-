public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantLojas) {
        this.nome = nome;
        this.endereco = endereco;
        //etapa 4
        this.lojas = new Loja[quantLojas];
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
        return lojas;
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

//Métodos da classe loja
    public boolean insereLoja(Loja novaLoja){

        if (lojas[lojas.length - 1] != null)
 
            for(int i=0; i < lojas.length; i++){
                if(lojas[i] == null){
                    lojas[i] = novaLoja;
                //esse 'if' acima adiciona uma nova loja na primeira posição nula do array lojas[]
                    return true;
                }
            }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nomeLoja)) {
                lojas[i] = null; // Remove a loja, atribuindo nulo à posição
                return true; // Indica que a loja foi removida com sucesso
            }
        }

        return false; // Diz que a loja não existe no estoque
    }
   
    public int quantidadeLojasPorTipo(String tipoLoja) {
        int quantLojas = 0;

        if (tipoLoja.equalsIgnoreCase("Cosmético") || tipoLoja.equalsIgnoreCase("Vestuário") ||
            tipoLoja.equalsIgnoreCase("Bijuteria") || tipoLoja.equalsIgnoreCase("Alimentação") ||
            tipoLoja.equalsIgnoreCase("Informática")) {

            for (Loja loja : lojas) {
                if (loja != null && loja.getTipo().equalsIgnoreCase(tipoLoja)) {
                    quantLojas++;
                }
            }

            return quantLojas;
        }

        return -1;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null; //a variável recebe null

        for (Loja novaLoja : lojas) { //percorre todas as lojas criadas do array lojas
            if (novaLoja instanceof Informatica) { //se a nova loja é instancia de Informatica
                Informatica LojaInformatica = (Informatica) novaLoja; //transforma o novaLoja, de Loja, em um objeto informatica, de Informatica
                if (lojaMaisCara == null || LojaInformatica.getSeguroEletronicos() > lojaMaisCara.getSeguroEletronicos()) { //se a lojaMaisCara nao existir (nula) ou se o valor do seguro de eletronica da novaLoja é maior que o da lojaMaisCara atual, 
                    lojaMaisCara = LojaInformatica; //atribui a loja de informatica atual como a loja mais cara
                }
            }
        }

        return lojaMaisCara;
    }


//Método toString
    public String toString() {
        return "Nome: " + nome + "/ Endereços das lojas: " + endereco + "/ Loja: " + lojas;
    }
}