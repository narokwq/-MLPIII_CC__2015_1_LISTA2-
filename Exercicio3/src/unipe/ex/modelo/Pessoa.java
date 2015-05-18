package unipe.ex.modelo;

public abstract class  Pessoa{
	protected int matricula;
	protected String nome;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		Pessoa other = (Pessoa) obj;
		if (matricula != other.matricula){
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Pessoa [matricula=" + matricula + ", nome=" + nome + "]";
	}
	
}
