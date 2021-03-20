package entidades;

import java.util.Date;

public class Clientes {
	private String nome;
	private String email;
	private Date dtNascimento;
	
	
	public Clientes(String nome, String email, Date dtNascimento) {
		this.nome = nome;
		this.email = email;
		this.dtNascimento = dtNascimento;
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


	public Date getDtNascimento() {
		return dtNascimento;
	}


	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	
	
	
	
	

}
