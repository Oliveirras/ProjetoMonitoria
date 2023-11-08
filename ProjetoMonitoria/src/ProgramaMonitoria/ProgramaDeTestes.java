package ProgramaMonitoria;


import java.time.LocalDate;
import java.util.ArrayList;

import CentralDeInformacoes.CentralDeInformacoes;
import Classes.Aluno;
import Classes.Disciplina;
import EditalDeMonitoria.EditalDeMonitoria;
import Persistencia.Persistencia;

public class ProgramaDeTestes {

	public static void main(String[] args) {
		Persistencia p = new Persistencia();
		CentralDeInformacoes central = p.recuperarCentral("Central.xml");
		Disciplina disciplina = new Disciplina();
		disciplina.setNome("poo");
		disciplina.setNumeroDeVagas(2);
		Aluno aluno = new Aluno("fulano","345","@ful","000");
		central.adicionarAluno(aluno);
		try {
			p.salvarCentral(central,"Central.xml");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<Disciplina> lista = new ArrayList<>();
		lista.add(disciplina);
		EditalDeMonitoria edital = new EditalDeMonitoria("2023", LocalDate.of(2023, 9, 30), LocalDate.of(2023, 10, 2), lista);
		System.out.println("Inscrito com sucesso? " + edital.inscrever(aluno, "poo"));
		System.out.println("ADICIONEI O EDITAL? "+central.adicionarEdital(edital));
		System.out.println("\nEdital Recuperado\n"+central.recuperarEditalPeloId(edital.getId()));
		System.out.println();
		central.exibirDados("345");
		
		
		
	}

}
