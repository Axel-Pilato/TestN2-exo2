package code;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NumeralToRomanTest {

	NumeralToRoman calc;
	
	@Before
	public void setUp() throws Exception {
		calc = new NumeralToRoman();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(new String("CV"), calc.getRoman(105));
	}

}
