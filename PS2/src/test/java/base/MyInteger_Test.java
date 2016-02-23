package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	//create an instance
	private static MyInteger inst_mi = new MyInteger(47);
	private static MyInteger inst_mi_2 = new MyInteger(20);
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
	}
	
	@Test
	public void testSet_iValue() {
		inst_mi.set_iValue(47);
	}
	
	@Test
	public void testGet_iValue() {
		assertEquals(inst_mi.get_iValue(), 47);
	}

	@Test
	public void testIsEven() {
		assertFalse(inst_mi.isEven());
	}

	@Test
	public void testIsOdd() {
		assertTrue(inst_mi.isOdd());
	}

	@Test
	public void testIsPrime() {
		assertTrue(inst_mi.isPrime());
	}

	@Test
	public void testIsEvenInt() {
		assertTrue(MyInteger.isEven(4));
	}

	@Test
	public void testIsOddInt() {
		assertFalse(MyInteger.isOdd(14));
	}

	@Test
	public void testIsPrimeInt() {
		assertTrue(MyInteger.isPrime(51));
	}

	@Test
	public void testIsEvenMyInteger() {
		assertFalse(MyInteger.isEven(inst_mi));
	}

	@Test
	public void testIsOddMyInteger() {
		assertTrue(MyInteger.isOdd(inst_mi));
	}

	@Test
	public void testIsPrimeMyInteger() {
		assertTrue(MyInteger.isPrime(inst_mi));
	}

	@Test
	public void testEqualsInt() {
		assertTrue(inst_mi.equals(47));
	}

	@Test
	public void testEqualsMyInteger() {
		assertFalse(inst_mi.equals(inst_mi_2));
	}


}
