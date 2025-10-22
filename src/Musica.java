package atividade01T02;

public class Musica {
String titulo;
int duracao;
public Musica(String titulo, int duracao) {
	if(titulo == null || titulo.isEmpty()) {
		throw new IllegalArgumentException("O título não pode ser Nulo nem Vazio");
	}
	if(duracao<=0) {
		throw new IllegalArgumentException("A duração não pode ser zero nem negativa");
	}
this.titulo = titulo;
this.duracao = duracao;
}

public void AjustaMusica() {
	System.out.println("O Título da música é: " + titulo + " a duração da música é:" + (duracao/60) + ":" + (duracao % 60));
}
public int getDuracao() {
	return duracao;
}
public String getTitulo() {
	return titulo;
}
}
