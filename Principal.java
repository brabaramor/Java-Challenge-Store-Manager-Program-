public class Principal {
    public static void main (String[] args, int quantProdutosEstoqueLoja1){
        System.out.println("(1) criar uma loja");
        System.out.println("(2) criar um produto");
        System.out.println("(3) sair");
  
        System.out.println("Digite número, de acordo com o menu acima:");
        int numero = Teclado.leInt();
        System.out.println("A opção selecionada foi "+ numero);

        while (numero != 1 && numero != 2 && numero != 3){
            if (numero == 1){
                //solicitando informações da loja e armazenando em variáveis para, posteriormente, criar o objeto loja1
                String nomeDaLoja1 = Teclado.leString("Digite o nome da loja: ");
                int quantidadeFuncionariosLoja1 = Teclado.leInt("Quantidade de funcionários: ");
                double salarioFuncionariosLoja1 = Teclado.leDouble("Valor do salário base dos funcionários: ");
                //essas duas variáveis vão ter que ser atribuidas a um novo objeto para poderem ser lidas, porque a classe de entrada de dados não lê "Data" e "Endereco"
                //endereço (todas essas informações precisarão ser preenchidas uma a uma porque o objeto "enderecoLoja1" precisa ter todos esses parametros para ser da classe Endereco*)
                String ruaLoja1 = Teclado.leString("Digite o nome da rua do endereço da loja: ");
                String numeroEnderecoLoja1 = Teclado.leString("Digite o número do endereço loja: ");
                String complementoEnderecoLoja1 = Teclado.leString("Digite o complemento do endereço loja: ");
                String cidadeLoja1 = Teclado.leString("Digite a cidade da loja: ");
                String estadoLoja1 = Teclado.leString("Digite a cidade de localização da loja: ");
                String paisLoja1 = Teclado.leString("Digite o país de localização da loja: ");
                String cepLoja1 = Teclado.leString("Digite o CEP da loja: ");
                //data (*mesma questão anterior)
                int diaFundacaoLoja1 = Teclado.leInt("Dia de fundação da loja: ");
                int mesFundacaoLoja1 = Teclado.leInt("Mês de fundação da loja: ");
                int anoFundacaoLoja1 = Teclado.leInt("Ano de fundação da loja: ");

                //objetos que terão as entradas do usuario como parametro
                Endereco enderecoLoja1 = new Endereco(ruaLoja1, numeroEnderecoLoja1, complementoEnderecoLoja1, cidadeLoja1, estadoLoja1, paisLoja1, cepLoja1);
                Data dataFundacaoLoja1 = new Data(diaFundacaoLoja1, mesFundacaoLoja1, anoFundacaoLoja1);
                
                //criação do objeto loja1
                Loja loja1 = new Loja (nomeDaLoja1, quantidadeFuncionariosLoja1, salarioFuncionariosLoja1, enderecoLoja1, dataFundacaoLoja1, quantProdutosEstoqueLoja1);
                System.out.println("Loja " + loja1.getNome() + " criada");
           
            } else if (numero == 2){
                
                //Solicitando as informações do novo produto
                String nomeProduto1 = Teclado.leString("Digite o nome do produto: ");
                double precoProduto1 = Teclado.leDouble("Digite o preço do produto: ");
                //data
                int diaFundacaoProduto1 = Teclado.leInt("Dia de fundação da loja: ");
                int mesFundacaoProduto1 = Teclado.leInt("Mês de fundação da loja: ");
                int anoFundacaoProduto1 = Teclado.leInt("Ano de fundação da loja: ");
                
             //objeto que terá as entradas do usuario como parametro
                Data dataValidadeProduto1 = new Data(diaFundacaoProduto1, mesFundacaoProduto1, anoFundacaoProduto1);
                
                //criação do objeto produto1
                Produto produto1 = new Produto (nomeProduto1, precoProduto1, dataValidadeProduto1);
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
}
    
