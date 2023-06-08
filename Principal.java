public class Principal {
    public static void main (String[] args){
        System.out.println("(1) criar uma loja");
        System.out.println("(2) criar um produto");
        System.out.println("(3) sair");
  
        String numero = Teclado.leString("Digite número, de acordo com o menu acima:");
        System.out.println("A opção selecionada foi "+ numero);

        if (numero == "1"){
            criarLoja()
        }
    }
    
}
