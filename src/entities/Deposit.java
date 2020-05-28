package entities;

import java.util.Date;

public class Deposit extends createAcc{
	
	private Double ammout;
	
	public Deposit(String name, Double cpf, Date nasc, Double[] num_conta) {
		super(name, cpf, nasc, num_conta);
		this.ammout = ammout;
	}

	public Double getAmmout() {
		return ammout;
	}

	public void setAmmout(Double ammout) {
		this.ammout = ammout;
	}
	
	public Double depo(double money) {
		return ammout += money;
	}
	
}
