public class Main {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Joao", 30, "Jacunda");
        System.out.println("Pessoa: " + pessoa.nome + ", " + pessoa.idade + " anos, " + pessoa + " cidade: " + pessoa.cidade);

        Retangulo retangulo = new Retangulo(5.0, 4.0);
        System.out.println("Área do retangulo: " + retangulo.calcularArea());

        ContaBancaria conta = new ContaBancaria("Maria", 1000.0);
        conta.depositar(500.0);
        conta.sacar(200.0);
        conta.exibirSaldo();

        Produto produto = new Produto();
        produto.setNome("megahair");
        produto.setPreco(200);
        System.out.println("Produto: " + produto.getNome() + ", Preço: R$" + produto.getPreco());

        Funcionario funcionario = new Funcionario("Carlos" , 3000.0);
        Gerente gerente = new Gerente("Ana", 5000.0);
        System.out.println("Bônus Funcionário: R$" + funcionario.calcularBonus());
        System.out.println("Bônus Gerente: R$" + gerente.calcularBonus());

        Veiculo carro = new Carro();
        Veiculo bicicleta = new Bicicleta();
        carro.mover();
        bicicleta.mover();
    }
}