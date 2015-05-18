package unipe.ex.curso;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import unipe.ex.modelo.Aluno;
import unipe.ex.modelo.Professor;

public class Curso {
	private int idCurso;
	private String nome;
	
	private Set<Aluno> alunos;
	private Professor professor;
	
	public Curso(){
		alunos = new TreeSet<Aluno>();
	}
	
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Aluno> getAlunos() {
		return alunos;
	}
	public void setAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}	
	public boolean estaContido(Aluno aluno){
		for(Aluno a: alunos){
			if(a.getMatricula() == aluno.getMatricula()){
				return true;
			}
		}
		return false;
	}
	
	public boolean removerAluno(Aluno aluno){
		for(Aluno a: alunos){
			if(a.getMatricula() == aluno.getMatricula() || a.getNome().equals(aluno.getNome())){
				return alunos.remove(a);
			}
		}
		return false;
	}

	
	public Set<Aluno> getAprovados(){
		Set<Aluno> result = new LinkedHashSet<>();
		for(Aluno a: alunos){
			if(a.getMedia() > 7){
				result.add(a);
			}
		}
		return result;
	}
	
	public Set<Aluno> getReprovadosFaltas(){
		Set<Aluno> result = new LinkedHashSet<>();
		for(Aluno a: alunos){
			if(a.getFaltas() > 15){
				result.add(a);
			}
		}
		return result;
	}
}
