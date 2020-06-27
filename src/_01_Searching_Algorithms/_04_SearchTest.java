package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	int[] array = {0, 1, 2, 2, 3, 4};
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] array = {"Peter Parker", "Miles Morales", "Gwen Stacy", "Penni Parker", "Peter Porker"};
		
		assertEquals("Peter Parker", array[0]);
		assertEquals("Miles Morales", array[1]);
		assertEquals("Penni Parker", array[3]);
		
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		assertEquals(0, array[0]);
		assertEquals(2, array[2]);
		assertEquals(2, array[3]);
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		assertEquals(0, array[0]);
		assertEquals(2, array[2]);
		assertEquals(2, array[3]);
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		assertEquals(0, array[0]);
		assertEquals(2, array[2]);
		assertEquals(2, array[3]);
	}
}
