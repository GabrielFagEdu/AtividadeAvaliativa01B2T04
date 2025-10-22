package atividade01T02;

public class Funcionario {
private double salario;
private String nome;
	public Funcionario(String nome, double salario){
	if(nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("Nome precisa existir para funcionário");
		}
	if(salario <= 0) {
			throw new IllegalArgumentException("Salário não pode ser 0 nem abaixo patrão cuzao!");
		}
	this.nome= nome;
	this.salario = salario;
	}
	
public void AumentarSalario(double porcentagem) {
	if(porcentagem >= 0 && porcentagem != 0) {
		salario = (salario + (salario * (porcentagem/100)));
	}
	else {
		System.out.println("O aumento não pode ser negativo nem zero!");
	}
}

public void Exibir() {
	 System.out.println("O Nome é: " + nome + " e seu salário é: "+ salario);
	}

public String getNome() {
	return nome;
}
public double getSalario() {
	return salario;
}
}
