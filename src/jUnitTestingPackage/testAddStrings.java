package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction junitS = new jUnitFunction();
		String result = junitS.addStrings("chandu", "Appasani");
		assertEquals("chanduAppasani", result);
	}

}
