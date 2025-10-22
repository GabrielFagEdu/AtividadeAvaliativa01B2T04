package atividade01T02;

public class Pessoa {
private double peso;
private double altura;
String nome;
public Pessoa(double peso, double altura,String nome) {
	if(nome == null || nome.isEmpty()) {
		throw new IllegalArgumentException("O Nome não pode ser Nulo nem Vazio");
	}
	if(altura<=0) {
		throw new IllegalArgumentException("A Altura não pode ser zero nem nula");
	}
	if(peso<=0) {
		throw new IllegalArgumentException("O Peso não pode ser zero nem nulo");
	}
	this.nome = nome;
	this.altura = altura;
	this.peso = peso;
}
public double CalculaIMC() {
double imc = (peso/(altura*altura));
return imc;
}
public void ClassificacaoIMC() {
	if((peso/(altura*altura)) <= 18){
	System.out.println("Seu IMC indica Magreza");
}if((peso/(altura*altura))>18 && (peso/(altura*altura))<=24.9) {
	System.out.println("Seu IMC indica Normal");
}
if((peso/(altura*altura)) > 24.9 && (peso/(altura*altura)) < 29.9){
	System.out.println("Seu IMC indica Obesidade I");
}if((peso/(altura*altura))>29.9 && (peso/(altura*altura))<=39.9) {
	System.out.println("Seu IMC indica Obesidade II");
}
if((peso/(altura*altura)) > 39.9){
	System.out.println("Seu IMC indica Obesidade Grave");
}
}

public double getAltura() {
	return altura;
}
public double getPeso() {
	return peso;
}
public String getNome() {
	return nome;
}
}
