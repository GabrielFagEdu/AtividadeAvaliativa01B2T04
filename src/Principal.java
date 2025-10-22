package atividade01T02;

public class Principal {
public static void main(String[] arg) {
	ContaBancaria();
	Filme();
	Funcionario();
	Retangulo();
	Musica();
	Pessoa();
	ContaLuz();
	BicicletaAluguel();
	ProdutoEstoque();
	 Temperatura();
}

public static void ContaBancaria() {
 	ContaBancaria conta = new ContaBancaria("Gabriel", 1000000);
	conta.Depositar(20000);
	conta.Sacar(12000);
	System.out.println("Titular: " + conta.getTitular());
	System.out.println("Saldo: " + conta.getSaldo());
}

public static void Filme() {
	Filme filme1 = new Filme("Matrix", 4);
	Filme filme2 = new Filme("Interestelar", 5);
	filme1.Exibir();
	filme2.Exibir();
}

public static void Funcionario() {
	Funcionario fnc = new Funcionario("Gabriel", 15000);
	fnc.Exibir();
	fnc.AumentarSalario(15);
	fnc.Exibir();
}
public static void Retangulo() {
	Retangulo rtg = new Retangulo(20, 5);
	rtg.Area();
	rtg.Perimetro();
}
public static void Musica() {
	Musica msc0 = new Musica("King for a Day", 236);
	Musica msc1 = new Musica("Death of an Executioner", 267);
	msc0.AjustaMusica();
	msc1.AjustaMusica();
}
public static void Pessoa() {
	Pessoa imc = new Pessoa(91.0, 1.83, "Marmelo");
	imc.CalculaIMC();
	imc.ClassificacaoIMC();
}
public static void ContaLuz() {
	ContaLuz cta = new ContaLuz(10.0, 2.20);
	cta.calcularValorTotal();
}
public static void BicicletaAluguel() {
	BicicletaAlugada bct = new BicicletaAlugada(10, 2.20);
	bct.calcularValor();
}
public static void ProdutoEstoque() {
	ProdutoEstoque pdt = new ProdutoEstoque(10, "Gabriel");
	pdt.adicionarEstoque(6);
	pdt.removerEstoque(3);
}

public static void Temperatura() {
	Temperatura tmp = new Temperatura(-104);
tmp.mostrarConversoes();
}

}
