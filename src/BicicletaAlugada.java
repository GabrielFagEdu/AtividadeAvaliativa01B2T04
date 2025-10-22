package atividade01T02;

public class BicicletaAlugada {
private int horas;
private double valorHora;
public BicicletaAlugada(int horas, double valorHora) {
	if(horas <=1) {
		throw new IllegalArgumentException("Valor da hora não pode ser 0 nem abaixo!");
	}
	if(valorHora < 0) {
		throw new IllegalArgumentException("Valor da custo da hora não pode ser 0 nem abaixo!");
	}
	
	this.horas= horas;
	this.valorHora = valorHora;

}
public void calcularValor(){
	double resposta = (horas * valorHora);
	System.out.println("O  valor correto da sua conta para esses dados é: " + resposta);
}
public int getHoras() {
	return horas;
}
public double getvalorHora() {
	return valorHora;
}
}
