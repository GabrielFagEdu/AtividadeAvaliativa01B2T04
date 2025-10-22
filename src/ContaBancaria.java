package atividade01T02;

public class ContaBancaria {
private String titular;
private double saldo;

//CONTRUTOR DA CLASSE SERVE PARA INICIALIZAR ELA
public ContaBancaria(String titular, double saldoInicial) {
	if(titular == null || titular.isEmpty()) {
		throw new IllegalArgumentException("Titular não pode ser vazio!");
	}
	if(saldoInicial < 0) {
		throw new IllegalArgumentException("Saldo inicial não pode ser menor do que zero");
	}
	this.titular = titular;
	this.saldo = saldoInicial;
}

public void Depositar(double valor) {
	if(valor > 0) {
		  saldo += valor;
	}
	else {
        System.out.println("Valor de depósito inválido!");
    }
}

public void Sacar(double valor) {
	if(valor>0 && valor < saldo) {
		saldo -=valor;
	}else {
		System.out.println("Valor do saque Inválido, ou acima da quantia possuída");
	}
}
public String getTitular() {
	return titular;
}
public double getSaldo() {
	return saldo;
}
}
