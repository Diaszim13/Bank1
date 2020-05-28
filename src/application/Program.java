package application;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
import entities.createAcc;
import entities.Deposit;
public class Program {

	public static void main(String[] args) throws IOException, ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("------------BEM VINDO AO BANCO ------------");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Digite seus dados: ");
		System.out.print("Seu nome completo:");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("diga seu cpf: ");
		Double cpf = sc.nextDouble();
		System.out.print("Diga sua data de nascimento: ");
		String date = sc.next();
		Date nasc = sdf.parse(date);
		Double num_conta[] = new Double[10];
		Random ger = new Random();
		for (int i = 1; i < 7; i++) {
			num_conta[i] = (ger.nextDouble());
		}
		createAcc acc1 = new createAcc(name,cpf,nasc,num_conta);
		System.out.println(acc1.toString());

			System.out.println(" 2-PARA DEPOSITAR");
			System.out.print("Diga uma op��o: ");
			String op = sc.next();
		switch(op) {
		case "1":
			System.out.println("qual o numero da conta?: ");
			System.out.println("quanto?: ");
			double money = sc.nextDouble();
			Deposit depos = new Deposit.depo(money);
		}
		
		
		
		
		
		sc.close();
	}

}
