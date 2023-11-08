package Classes;

public class Aluno {
	private String nome,matricula,email,senha;
	
	public Aluno(String n,String m,String e,String s) {
		nome=n;
		matricula=m;
		email=e;
		senha=s;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getMatricula() {
		return matricula;
	}
	public String toString() {
		return nome + ",";
	}
}
