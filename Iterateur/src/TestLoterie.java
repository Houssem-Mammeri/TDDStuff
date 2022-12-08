import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestLoterie {
	
	Loterie loterie;

	@Before
	public void setUp() throws Exception {
		this.loterie = new Loterie();
	}

	@After
	public void tearDown() throws Exception {
		this.loterie = null;
	}

	@Test
	public void testAucuneBouleTirée() {
		assertEquals("",loterie.boulesSorties());
	}

	@Test
	public void testUneBouleTirée() {
		loterie.addBoule(10);
		assertEquals("10",loterie.boulesSorties());
	}
	
	@Test
	public void testDeuxBoulesTirées() {
		loterie.addBoule(10);
		loterie.addBoule(20);
		assertEquals("10 20",loterie.boulesSorties());
	}
	
	@Test
	public void testToisBoulesTirées() {
		loterie.addBoule(10);
		loterie.addBoule(20);
		loterie.addBoule(30);
		assertEquals("10 20 30",loterie.boulesSorties());
	}
	
	@Test
	public void testAceptationLoterie() {
		loterie.addBoule(0);
		loterie.addBoule(30);
		loterie.addBoule(20);
		loterie.addBoule(40);
		loterie.addBoule(5);
		loterie.addBoule(3);
		assertEquals("0 3 5 20 30 40",loterie.boulesSorties());
	}
}
