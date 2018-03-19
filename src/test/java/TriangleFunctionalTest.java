
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tradeshift.main.TriangleApplication;

public class TriangleFunctionalTest {

	@Test
	public void testForSideLengthValidity() {
		try {
			TriangleApplication.getTypeOfTriangle(1, 2, 3);
		} catch (IllegalArgumentException e) {
			assertEquals("Sum of any two sides of triangle should be more than the third one", e.getMessage());
		}
	}

	@Test
	public void testForSidePositivityValidity() {
		try {
			TriangleApplication.getTypeOfTriangle(1, -2, 3);
		} catch (IllegalArgumentException e) {
			assertEquals("Length of all sides of triangle should more than 0", e.getMessage());
		}
	}

	@Test
	public void testForEquilateral() {
		String s = TriangleApplication.getTypeOfTriangle(4, 4, 4);
		assertEquals("Equilateral", s);
	}

	@Test
	public void testForIsosceles() {
		String s = TriangleApplication.getTypeOfTriangle(4, 3, 4);
		assertEquals("Isosceles", s);
	}

	@Test
	public void testForScalene() {
		String s = TriangleApplication.getTypeOfTriangle(4, 5, 6);
		assertEquals("Scalene", s);
	}

}
