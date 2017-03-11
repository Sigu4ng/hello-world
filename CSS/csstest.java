package CSS;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class csstest {

	private static css cal = new css();
	
	@Test
	public void testEq() {
		assertEquals(true, cal.isEquilateral(4, 4, 4));
		assertEquals(false, cal.isIsosceles(2, 3, 4));
	}

	@Test
	public void testIs() {
		assertEquals(false, cal.isIsosceles(2, 2, 4));
		assertEquals(true, cal.isIsosceles(2, 2, 3));
	}

	@Test
	public void testSc() {
		assertEquals(true, cal.isScalene(4, 2, 3));
		assertEquals(false, cal.isScalene(4, 4, 3));
	}

}
