package entities;

import java.util.Date;

public class createAcc {

	private String name;
	private Double cpf;
	private Date nasc;
	private Double[] account_num;
	
	public createAcc(String name, Double cpf, Date nasc, Double[] num_conta) {
		this.name = name;
		this.cpf = cpf;
		this.nasc = nasc;
		this.account_num = num_conta;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getCpf() {
		return cpf;
	}

	public Date getNasc() {
		return nasc;
	}
	
	public Double[] getAccountNum() {
		return account_num;
	}
	
	public String toString() {
		return "nome do usuario: " + name + " CPF: " + String.format("%.0f", cpf) + " Date de nascimento: " + nasc;
	}
}
