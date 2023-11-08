package CentralDeInformacoes;

import java.util.ArrayList;

import Classes.Aluno;
import EditalDeMonitoria.EditalDeMonitoria;

public class CentralDeInformacoes {
	private ArrayList<EditalDeMonitoria> todosOsEditais=new ArrayList<>();
	private ArrayList<Aluno> todosOsAlunos= new ArrayList<>();

	public ArrayList<EditalDeMonitoria> getTodosOsEditais() {
		return todosOsEditais;
	}
	public void setTodosOsEditais(ArrayList<EditalDeMonitoria> todosOsEditais) {
		this.todosOsEditais = todosOsEditais;
	}
	public ArrayList<Aluno> getTodosOsAlunos() {
		return todosOsAlunos;
	}
	public void setTodosOsAlunos(ArrayList<Aluno> todosOsAlunos) {
		this.todosOsAlunos = todosOsAlunos;
	}
	public boolean adicionarAluno(Aluno a) {
		if(recuperarAlunoPorMatricula(a.getMatricula())!=null)return false;
		else {
			todosOsAlunos.add(a);
			return true;
		}		
	}
	public Aluno recuperarAlunoPorMatricula(String m) {
		for(Aluno aluno:todosOsAlunos) {
			if(aluno.getMatricula().equals(m)) return aluno;
		}
		return null;
	}
	public void exibirDados(String m){
		Aluno a1;
		a1=(recuperarAlunoPorMatricula(m));
		if(a1!=null)
		System.out.printf("Nome:%s\nMatricula:%s\nEmail:%s\nSenha:%s",a1.getNome(),a1.getMatricula(),
		a1.getEmail(),a1.getSenha());							
	}
	public void listarAlunos() {
		for(Aluno a:todosOsAlunos)
			System.out.print(a);
	}
	public EditalDeMonitoria recuperarEditalPeloId(long id) {
		for(EditalDeMonitoria edital:todosOsEditais) {
			if(edital.getId()==id) 
				return edital;	
		}return null;
	}
	public boolean adicionarEdital(EditalDeMonitoria edital) {
			if(recuperarEditalPeloId(edital.getId())!=null)return false;
			else {
				todosOsEditais.add(edital);
				return true;
			}
	}
}
