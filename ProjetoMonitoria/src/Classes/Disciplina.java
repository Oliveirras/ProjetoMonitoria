package Classes;

import java.util.ArrayList;

public class Disciplina {
	private String nome;
	private int numeroDeVagas;
	private ArrayList<Aluno> alunosInscritos=new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroDeVagas() {
		return numeroDeVagas;
	}
	public void setNumeroDeVagas(int numeroDeVagas) {
		this.numeroDeVagas = numeroDeVagas;
	}
	public ArrayList<Aluno> getAlunosInscritos() {
		return alunosInscritos;
	}
	public void setAlunosInscritos(ArrayList<Aluno> alunosInscritos) {
		this.alunosInscritos = alunosInscritos;
	}
	public String toString() {
		return "<"+nome+">"+"-"+numeroDeVagas+" vagas";
	}
}
