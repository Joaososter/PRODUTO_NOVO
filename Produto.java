import java.time.LocalDate; //localDate para manipulacao de dados 

public class Produto {
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private LocalDate dataFabricacao;
    private LocalDate dataValidade;


    // construtor 1: Recebe todos os atributos por parametro
    public Produto(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao, LocalDate dataValidade) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
    }

     // Construtor 2: Recebe nome, preço de custo, preço de venda e data de fabricação
    // A data de validade será 1 mês após a data de fabricação
    public Produto(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao) {

        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;


        // Data de validade sera 1 mes apos a data de fabricacao
        this.dataValidade = dataFabricacao.plusMonths(1);
    }


    public Produto(String nome, double precoCusto,LocalDate dataFabricacao) {
        this.nome = nome;
        this.precoCusto = precoCusto;

         // o preco de venda e 10% maior que o preco de custo
        this.precoVenda = precoCusto * 1.10;
        
        this.dataFabricacao = dataFabricacao;

         //a data de validade sera 1 mes apos a data de fabricacao
        this.dataValidade = dataValidade.plusMonths(1);
    }


    // metodos getters para acessar os atributos (encapsulaento)

    public String getNome() {
        return nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public LocalDate getDateFabricacao() {
        return dataFabricacao;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }


    // Métodos setters para modificar os atributos, caso necessário
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public void setDataValidade(LocalDate dataValidade ) {
        this.dataValidade = dataValidade;
    }


    // Método para imprimir os detalhes do produto
    public void imprimirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço de Custo: " + precoCusto);
        System.out.println("Preço de Venda: " + precoVenda);
        System.out.println("Data de Fabricação: " + dataFabricacao);
        System.out.println("Data de Validade: " + dataValidade);
    }


     // Método main para testar a classe Produto
     public static void main(String[] args) {
        // Criação de um produto usando o primeiro construtor (com todos os atributos)
        Produto produto1 = new Produto("Celular", 2.000, 3.500, LocalDate.of(2024, 11, 05), LocalDate.of(2025, 9, 1));
        produto1.imprimirDetalhes(); // Exibe os detalhes do produto1

        System.out.println("--------------------");

        // Criação de um produto usando o segundo construtor (data de validade calculada)
        Produto produto2 = new Produto("Notebook", 1.000, 2.500, LocalDate.of(2024, 9, 1));
        produto2.imprimirDetalhes(); // Exibe os detalhes do produto2

        System.out.println("--------------------");

        // Criação de um produto usando o terceiro construtor (preço de venda calculado e validade calculada)
        Produto produto3 = new Produto("tenis", 300.0, LocalDate.of(2024, 9, 1));
        produto3.imprimirDetalhes(); // Exibe os detalhes do produto3
    }
}


