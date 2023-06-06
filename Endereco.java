public class Endereco {
    private String nomeDaRua;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;

//Método Construtor
    public Endereco(String nomeDaRua, String cidade, String estado, String pais, String cep, String numero, String complemento){
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

//Métodos de acesso
//Get
    public String getNomeDaRua(){
        return nomeDaRua;
    }
    public String getCidade(){
        return cidade;
    }

    public String getEstado(){
        return estado;
    }

    public String getPais(){
        return pais;
    }

    public String getCep(){
        return cep;
    }

    public String getNumero(){
        return numero;
    }

    public String getComplemento(){
        return complemento;
    }

//Set
    public void setNomeDaRua(String nomeDaRua){
        this.nomeDaRua = nomeDaRua;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setComplemento(String complemento){
        this.complemento = complemento;
    }

//Método toString
    public String toString(){
        return "Nome da rua: " + nomeDaRua + "/ Número: " + numero + "/ Complemento: " + complemento + "/ Cidade: " + cidade + "/ Estado: " + estado + "/ País: " + pais + "/ CEP: " + cep;
    }
}
/* Fim da Etapa 1 */
