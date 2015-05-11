package unipe.ex.principal;

import unipe.ex.conta.ContaCorrente;
import unipe.ex.conta.ContaPoupanca;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ContaCorrente contaCorrente1 = new ContaCorrente("001", 500, 0.5f);		
		ContaPoupanca contaPoupanca1 = new ContaPoupanca("002", 500, 0.5f);
		
		System.out.println(contaCorrente1);
		System.out.println(contaPoupanca1);
		
		contaCorrente1.atualizar();
		contaPoupanca1.atualizar();
		
		System.out.println(contaCorrente1);
		System.out.println(contaPoupanca1);
		contaCorrente1.creditar(10);
	}

}
