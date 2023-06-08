public class Cosmetico extends Loja{
    private double taxaComercializacao;

    //Construtor
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao){
        
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.taxaComercializacao = taxaComercializacao;

    }

    //métodos de acesso: verificar se preciso incluir todos os métodos de acesso de todos os atributos, segundo o chatGPT, não é necessário, mas nao entendi isso muito bem

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
        public double getTaxaComercializacao(){
        return taxaComercializacao;
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
    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao;
    }
// sobrescrever toString
    public String toString() {
        return super.toString() + "/ Taxa de Comercialização: " + taxaComercializacao;
    }
}