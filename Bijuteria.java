public class Bijuteria {
    private double metaVendas;

    //Método construtor
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas){

        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.metaVendas = metaVendas;
    }
//métodos de acesso
    //get ver se isso existe....
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
    public double metaVendas(){
        return metaVendas;
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
    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }

    // sobrescrever toString
    public String toString() {
        return super.toString() + "/ Meta Vendas: " + metaVendas;
    }
}
