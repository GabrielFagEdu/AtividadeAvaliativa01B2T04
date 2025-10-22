package atividade01T02;

public class ContaLuz {
private double valorKwh;
private double consumoKwh;
public ContaLuz(double valorKwh, double consumoKwh) {
	if(valorKwh <= 0) {
		throw new IllegalArgumentException("Valor KWH não pode ser 0 nem abaixo!");
	}
	if(consumoKwh <= 0) {
		throw new IllegalArgumentException("Consumo não pode ser 0 nem abaixo!");
	}
	this.valorKwh = valorKwh;
	this.consumoKwh = consumoKwh;
}
public void calcularValorTotal(){
	double resposta = (valorKwh * consumoKwh);
	System.out.println("O  valor correto da sua conta para esses dados é: " + resposta);
}
}
