public class Vestuario extends Loja{
    private boolean produtosImportados;

//Método construtor
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int quantProdutosEstoque){

        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantProdutosEstoque);
        this.produtosImportados = produtosImportados;
    }
//métodos de acesso
    //get 
    public String getNome(){
        return super.getNome();
    } // isso existe?

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
    public boolean getProdutosImportados(){
        return produtosImportados;
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
    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }

    // sobrescrever toString
    public String toString() {
        return super.toString() + "/ Produtos Importados: " + produtosImportados;
    }
}
