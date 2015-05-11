package unipe.ex.conta.teste;

import unipe.ex.conta.ContaCorrente;
import junit.framework.TestCase;

public class TestContaCorrente extends TestCase{
	ContaCorrente conta;
	protected void setUp(){
		conta = new ContaCorrente("0001");
	}
	
	protected void tearDown(){
		conta = null;
	}
	
	public void testCreditar(){
		conta.creditar(100.1f);
		assertEquals(conta.getSaldo(), 100.0f);
	}
	
	public void testDebitar(){
		conta.creditar(100.1f);
		assertTrue(conta.debitar(20));
	}
	
	public void testConta(){
		ContaCorrente conta = new ContaCorrente("0002");;
		assertNotSame(this.conta, conta);
	}
	
	public void testExite(){
		assertNotNull(conta);
	}
	
}
