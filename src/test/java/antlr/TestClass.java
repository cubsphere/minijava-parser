package minijava;

import org.junit.Test;
import minijava.ASTGenerator;

public class TestClass {
	@Test
	public void test() throws Exception {
		assert(1==1);
		ASTGenerator astg = new ASTGenerator();
		astg.hello();
		assert(1==1);
	}
}