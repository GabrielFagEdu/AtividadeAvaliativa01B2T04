package atividade01T02;

public class ProdutoEstoque {
private int quantidade = 0;
private String nome;
public ProdutoEstoque(int quantidade, String nome) {
if(quantidade <= 0) {
	throw new IllegalArgumentException("Valor da quantidade não pode ser 0 nem abaixo!");
}
if(nome == null || nome.isEmpty()) {
	throw new IllegalArgumentException("Nome não pode ser vazio!");
}
	this.quantidade= quantidade;
	this.nome = nome;
}
public void adicionarEstoque(int qtd) {
	if(qtd > 0) {
		quantidade += qtd;
		System.out.println("A nova quantidade é: "+ quantidade + "e o nome é: " + nome);
	}
	else {
        System.out.println("Valor de depósito inválido!");
    }
}

public void removerEstoque(int qtd) {
	if(!(qtd > quantidade) && !(qtd < 0)) {
		quantidade -= qtd;
	System.out.println("A nova quantidade é: "+ quantidade + "e o nome é: " + nome);
	}
	else {
        System.out.println("Valor de Saque inválido!");
    }
}
}
