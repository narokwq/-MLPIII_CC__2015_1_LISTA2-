package unipe.ex.principal;

import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

import unipe.ex.curso.Curso;
import unipe.ex.modelo.Aluno;

public class Principal {
	static Curso curso = new Curso();
	public static void main(String[] args) {
		
		while(true){
			System.out.println("1 - Incluir alunos");
			System.out.println("2 - Remover aluno");
			System.out.println("3 - Procurar aluno matriculado");
			System.out.println("4 - Listar todos os alunos aprovados");
			System.out.println("5 - Listar todos os alunos reprovados por falta");
			System.out.println("6 - Listar por ordem alfabética");
			System.out.println("7 - Sair");
			System.out.print(">> ");
			Scanner input = new Scanner(System.in);
			int op = input.nextInt();
			switch(op){
						case 1: addAluno(); break;
						case 2: remover();	break;
						case 3:	procurar(); break;
						case 4: listar(curso.getAprovados()); break;
						case 5:	listar(curso.getReprovadosFaltas()); break;
						case 6: listar(curso.getAlunos()); break;
						case 7: System.exit(0);
						default: System.out.println("Opção invalida!");
			}

		}
		
	}
	public static void addAluno(){
		Scanner input = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.println("Digite a matricula do aluno: ");
		aluno.setMatricula(input.nextInt());
		System.out.println("Digite o nome do aluno: ");
		aluno.setNome(input.next());
		System.out.println("Digite a media do aluno: ");
		aluno.setMedia(input.nextFloat());
		System.out.println("Digite as faltas do aluno: ");
		aluno.setFaltas(input.nextInt());
		
		curso.setAluno(aluno);
		
	}
	
	public static void listar(Set<Aluno> result){
		for(Aluno aluno: result){
			System.out.println(aluno);
		}
		
		espararTecla();
	}
	
	public static void remover(){
		System.out.println("1 - Remover por nome");
		System.out.println("2 - Remover por matricula");
		System.out.println("3 - Voltar");
		Scanner input = new Scanner(System.in);
		int op = input.nextInt();
		Aluno aluno = new Aluno();
		switch(op){
					case 1: aluno.setNome(input.next()); break;
					case 2: aluno.setMatricula(input.nextInt()); break;
					case 3:	return;
					default: System.out.println("Opção invalida!");
		}
		if(curso.removerAluno(aluno)){
			System.out.println("Aluno removido com sucesso");
		}else{
			System.out.println("Aluno não removido");
		}
		
		espararTecla();
	}
	
	public static void procurar(){
		Scanner input = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.println("Digite a matricula do aluno: ");
		aluno.setMatricula(input.nextInt());
		
		if(curso.estaContido(aluno) == true){
			System.out.println("O aluno esta matriculado");
		}else{
			System.out.println("O aluno não esta matriculado");
		}
		
		espararTecla();
	}
	
	public static void espararTecla(){
		System.out.println("\nAperte Enter para continuar");
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
