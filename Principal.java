public class Principal {
    public static void main (String[] args){
        System.out.println("(1) criar uma loja");
        System.out.println("(2) criar um produto");
        System.out.println("(3) sair");
  
        System.out.println("Digite número, de acordo com o menu acima:");
        int numero = Teclado.leInt();
        System.out.println("A opção selecionada foi "+ numero);

        while (numero != 1 && numero != 2 && numero != 3){
            if (numero == 1){
                //solicitando informações da loja para, posteriormente, criar o objeto loja1
                String nomeDaLoja1 = Teclado.leString("Digite o nome da loja: ");
                int quantidadeFuncionariosLoja1 = Teclado.leInt("Quantidade de funcionários: ");
                double salarioFuncionariosLoja1 = Teclado.leDouble("Valor do salário base dos funcionários: ");
                Endereco enderecoLoja1 = Teclado.leString("Endereço da loja: ");
                Data dataFundacaoLoja1 = Teclado.leInt("Data de fundação da loja: ");
                
                //criação do objeto loja1
                Loja loja1 = new Loja (String nomeDaLoja1, int quantidadeFuncionariosLoja1, double salarioFuncionariosLoja1, Endereco enderecoLoja1, Data dataFundacaoLoja1);
                System.out.println("Loja " + loja1.getNome() + " criada");
           
            } else if (numero == 2){
                
                //Solicitando as informações do novo produto
                String nomeProduto1 = Teclado.leString("Digite o nome do produto: ");
                double precoProduto1 = Teclado.leDouble("Digite o preço do produto: ");
                Data dataValidadeProduto1 = Teclado.leInt("Digite a data de validade do novo produto: ");
                
                //criação do objeto produto1
                Produto produto1 = new Produto (String nomeProduto1, double precoProduto1, Data dataValidadeProduto1);
                System.out.println("Produto " + produto1.getNome() + " criado");

                //verificando se o produto estará vencido em 20/10/2023
                Data dataOutubro = new Data (20, 3, 2023);
                boolean vencido = produto1.estaVencido(dataOutubro);

                if (vencido){
                    System.out.println("PRODUTO VENCIDO");
                } else{
                    System.out.println("PRODUTO NÃO VENCIDO");
                }


            } else if (numero == 3) {
                System.out.println("Você optou por sair");
            } else {
                System.out.println("Opção inválida, digite um número válido entre as opções abaixo: ");
                System.out.println("(1) criar uma loja");
                System.out.println("(2) criar um produto");
                System.out.println("(3) sair");
            }
        }   
}
    
