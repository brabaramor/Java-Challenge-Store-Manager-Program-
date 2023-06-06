public class Data {
   private int dia;
   private int mes;
   private int ano;

//Método Construtor
    public Data(int dia, int mes, int ano){
        if ((dia > 31 || dia < 1 || mes < 1 || mes > 12) || (!verificaAnoBissexto() && mes == 2 && dia > 29)){
            System.out.println("Data inválida. Digite a data novamente.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        } else{
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

//Métodos de acesso
//Get
    public int getDia(){
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && verificaAnoBissexto()) {
            return 29;
        }
        return diasPorMes[mes - 1];
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }

//Set
    public void setDia(int dia){
        this.dia = dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

//Método toString
    public String toString() {
        return "Dia: " + dia + "/ Mês: " + mes + "/ Ano: " + ano;
    }

//Método de verificação do ano bissexto
    public boolean verificaAnoBissexto(){
        if((ano % 4 == 0) || (ano % 400 == 0)){
            return true;
        } else {
            return false;
        }
    }
}