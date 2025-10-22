package atividade01T02;

public class Filme {
private String nome;
private int nota;

public Filme(String nome, int nota){
	if(nome == null || nome.isEmpty()) {
		throw new IllegalArgumentException("O nome não pode ser nulo nem em branco");
	}
	if(nota < 0 || nota>5) {
		throw new IllegalArgumentException("A nota tende atender os paramnentros de 1 a 5");
	}
	this.nome = nome;
	this.nota = nota;
}
public Filme() {}

public void DigitarNome(String nomeAtribuido) {
	if(nomeAtribuido != null && !nomeAtribuido.isEmpty()) {
		nome = nomeAtribuido;
	}else {
		System.out.println("Nome não atende os requisitos para categorização");
	}
}

public void DigitarNota(int notaAtribuida) {
	if(notaAtribuida >= 0 && notaAtribuida <= 5) {
		nota = notaAtribuida;
	}
	else {
		System.out.println("Nota não atende os requisitos para categorização");
	}
}

public void Exibir() {
 System.out.println("O Flme é: " + nome + " e sua nota é: "+ nota + " ⭐");
}

public String getNome() {
	return nome;
}
public int getNota() {
	return nota;
}
}
