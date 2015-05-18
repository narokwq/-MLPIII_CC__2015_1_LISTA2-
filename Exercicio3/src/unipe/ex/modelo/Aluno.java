package unipe.ex.modelo;

public class Aluno extends Pessoa implements Comparable<Aluno>{
	private float media;
	private int faltas;

	public Aluno(int matricula, String nome, float media, int faltas) {
		this.matricula = matricula;
		this.nome = nome;
		this.media = media;
		this.faltas = faltas;
	}
	
	public Aluno(){
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	@Override
	public int compareTo(Aluno o) {
		return this.nome.compareTo(o.nome);
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", media=" + media + ", faltas=" + faltas + "]";
	}
	
	
}
