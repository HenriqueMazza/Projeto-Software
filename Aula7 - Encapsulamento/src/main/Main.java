package main;

import entidades.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		
		ContaBancaria henrique = new ContaBancaria("henrique", 1518);
		ContaBancaria alice = new ContaBancaria("alice", 250);
 		
		henrique.setTitular("Henrique Rodrigues");
		henrique.setSaldo(500);
		
		henrique.depositar(250);
		henrique.saque(1000);
		
		System.out.println("Nome do titular: "+ henrique.getTitular());
		System.out.println("Saldo: " +henrique.getSaldo());
		
		
	}

}
