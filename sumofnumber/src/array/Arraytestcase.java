package array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Arraytestcase {


	@Test
	public void test() {
		Arraysum temp = new Arraysum();
		assertEquals(31, temp.sumofnumbers(new int[] {12,36,22,19,63}, 5, 31));
	
	
	}
	@Test
	public void testcase1() {
		Arraysum temp = new Arraysum();
		assertEquals(-2, temp.sumofnumbers(new int[] {0,-1,2,-3,1}, 5, -2));
	
	
	}
	@Test
	public void testcase2() {
		Arraysum temp = new Arraysum();
		assertEquals(900, temp.sumofnumbers(new int[] {300,500,100,800,600}, 5, 900));
	
	
	}

}
