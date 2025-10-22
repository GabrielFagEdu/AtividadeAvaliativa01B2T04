package atividade01T02;

public class Retangulo {
private int altura;
private int base;

public Retangulo(int altura, int base) {
	if(altura <=0) {
throw new IllegalArgumentException("Erro o valor da altura não pode ser zero nem negativa");
	}
	if(base <=0) {
throw new IllegalArgumentException("Erro o valor da base não pode ser zero nem negativa");
	}
	this.altura = altura;
	this.base = base;
}

public void Area() {
int area = 0;
area = (base * altura);
System.out.println(area);
}

public void Perimetro() {
int perimetro = 0;
perimetro = ((base + altura)*2);
System.out.println(perimetro);
}
public int getAltura() {
	return altura;
}
public int getbase() {
	return base;
}
}
