package ProgramaMonitoria;

import java.util.Scanner;

import CentralDeInformacoes.CentralDeInformacoes;
import Classes.Aluno;
import Persistencia.Persistencia;

public class Programa {
	public static void main(String[] args)  {
		Scanner Entrada = new Scanner(System.in);
		
		Persistencia persistencia = new Persistencia();
		CentralDeInformacoes central = persistencia.recuperarCentral("Central.xml");
		
		boolean continuar = true;
		
		while(continuar) {
			System.out.println("Digite o numero conforme a opção desejada: ");
			System.out.println("1- Novo Aluno\n2- Listar Todos\n3- Exibir Aluno Específico\nS- sair");
			switch(Entrada.nextLine().toUpperCase()) {
			case"1":
				System.out.println("Nome do Aluno: ");
				String nome = Entrada.nextLine();
				System.out.println("Maricula: ");
				String matricula = Entrada.nextLine();
				System.out.println("Email: ");
				String email = Entrada.nextLine();
				System.out.println("Senha: ");
				String senha = Entrada.nextLine();
				Aluno aluno= new Aluno(nome,matricula,email,senha);
				central.adicionarAluno(aluno);
				try {
					persistencia.salvarCentral(central,"Central.xml");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
				
			case"2":
				System.out.println("Alunos:");
				central.listarAlunos();
				System.out.println();break;
			case"3":
				System.out.println("Matricula do Aluno:");
				central.exibirDados(Entrada.nextLine());
				System.out.println();break;
			case"S":
				continuar=false;
				System.out.println("Até a próxima :)");break;
					
			}
		}
		Entrada.close();
	}
}
