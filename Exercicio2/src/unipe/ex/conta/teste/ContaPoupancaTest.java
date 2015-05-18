package unipe.ex.conta.teste;

import junit.framework.TestCase;
import unipe.ex.conta.ContaPoupanca;

public class ContaPoupancaTest extends TestCase{
	ContaPoupanca conta;
	protected void setUp(){
		conta = new ContaPoupanca("0001");
	}
	
	protected void tearDown(){
		conta = null;
	}
	public void testDebitar(){
		conta.creditar(15);
		assertFalse(conta.debitar(20));
	}
	
	public void testConta(){
		assertSame(conta, conta);
	}
	
	public void testExite(){
		conta = null;
		assertNull(conta);
		fail();
	}
}
