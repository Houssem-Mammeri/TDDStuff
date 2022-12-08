import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestTriCaracteres {
	
	private TriCaractères triCaracteres;

	@Before
	public void setUp() throws Exception {
		this.triCaracteres = new TriCaractères();
	}

	@After
	public void tearDown() throws Exception {
		this.triCaracteres = null;
	}

	@Test
	public void testPhraseVide() {
		assertEquals("",triCaracteres.lettresTrouvées(""));
	}

	@Test
	public void testPhraseAvecDesa() {
		assertEquals("aaa",triCaracteres.lettresTrouvées("aAA"));
	}
	
	@Test
	public void testPhraseAvecDesaEtAutreschosesQueDesCaracteres() {
		assertEquals("aaa",triCaracteres.lettresTrouvées("...aAA!!!!!?"));
	}
	
	@Test
	public void testAcceptation() {
		assertEquals("ddeeeeeiijlllmnrsstuu",triCaracteres.lettresTrouvées("Je suis le meilleur en TDD!!!"));
	}
}
