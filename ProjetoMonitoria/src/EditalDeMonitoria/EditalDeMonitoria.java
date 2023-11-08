package EditalDeMonitoria;

import java.time.LocalDate;
import java.util.ArrayList;

import Classes.Aluno;
import Classes.Disciplina;

public class EditalDeMonitoria {
	private long id ;
	private String numeroDoEdital;
	private LocalDate inicio,limite;
	private ArrayList<Disciplina> disciplinas = new ArrayList<>();
	
	public EditalDeMonitoria(String numeroDoEdital, LocalDate inicio, LocalDate limite,ArrayList<Disciplina> disciplinas) {
		this.numeroDoEdital = numeroDoEdital;
		this.inicio = inicio;
		this.limite = limite;
		this.disciplinas = disciplinas;
	}
	public EditalDeMonitoria(){
		setId(System.currentTimeMillis());
	}
	public String getNumeroDoEdital() {
		return numeroDoEdital;
	}
	public void setNumeroDoEdital(String numeroDoEdital) {
		this.numeroDoEdital = numeroDoEdital;
	}
	public LocalDate getInicio() {
		return inicio;
	}
	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}
	public LocalDate getLimite() {
		return limite;
	}
	public void setLimite(LocalDate limite) {
		this.limite = limite;
	}
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = System.currentTimeMillis();
	}
	public boolean inscrever(Aluno a,String disciplina) {
		LocalDate data=LocalDate.now();
		if(data.isAfter(inicio) ||data.isBefore(limite)) {
			for(Disciplina d:disciplinas) {
				if(d.getNome().equalsIgnoreCase(disciplina)) {
					d.getAlunosInscritos().add(a);
					return true;
				}
			}
		}return false;   			
	}
	public boolean jaAcabou() {
		LocalDate data=LocalDate.now();
		if(data.isAfter(limite))return true;
		return false;		
	}
	public String toString() {
		String status=(jaAcabou())?"encerradas":"abertas";
		return"Edital de Monitoria-"+numeroDoEdital+"\nDisciplinas\n"+getDisciplinas()+"\nInscrições - "+status;
	}

}
