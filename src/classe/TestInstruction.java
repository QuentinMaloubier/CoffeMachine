package classe;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestInstruction {
	@Test
	public void TestRapport() {
		instruction i = new instruction();
		fabricant f = new fabricant();
		f.SetCommande("C: : ");
		f.SetSomme(0.3);
		i.SetInstruction(f);
		double result=i.Rapport();
		assertEquals("0.6",String.valueOf(result));
	}
}
