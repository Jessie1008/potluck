package potluck.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import potluck.domain.Category;

/**
 * Test methods in class Category. sDate March 26, 2016
 * 
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @see org.junit.Assert
 * @see org.junit.After
 * @see org.junit.Before
 * @see org.junit.Test
 * @see potluck.domain.Category
 * @version 1.0.0
 * @since 1.8.0_73
 */
public class CategoryTest {

	/**
	 * Reference to Category
	 */
	private Category problem;

	/**
	 * Initialize field before each test
	 * 
	 * @throws java.lang.Exception
	 *             Give messages if errors occur
	 */
	@Before
	public void setUp() throws Exception {
		problem = new Category(1, "breakfast");
	}

	/**
	 * Clear the value of field after each test
	 * 
	 * @throws java.lang.Exception
	 *             Give messages if errors occur
	 */
	@After
	public void tearDown() throws Exception {
		problem = null;
	}

	/**
	 * Test constructor with parameters
	 */
	@Test
	public void testParametersConstructor() {
		int expected = 1;
		int actual = problem.getCategoryID();
		assertEquals("Parameters constructor has not been created", expected,
				actual);

	}

	/**
	 * Test method getCategoryID
	 */
	@Test
	public void testGetCategoryID() {
		double delta = 0.001;
		int expected = 1;
		int actual = problem.getCategoryID();
		assertEquals("Errors occurs in method getCategoryID", expected, actual,
				delta);
	}

	/**
	 * Test method setCategoryID
	 */
	@Test
	public void testSetCategoryID() {
		double delta = 0.001;
		int expected = 2;
		problem.setCategoryID(expected);
		int actual = problem.getCategoryID();
		assertEquals("Errors occurs in method setCategoryID", expected, actual,
				delta);
	}

	/**
	 * Test method getCategoryName
	 */
	@Test
	public void testGetCategoryName() {
		String expected = "breakfast";
		String actual = problem.getCategoryName();
		assertEquals("Errors occurs in method getCategoryName", expected,
				actual);
	}

	/**
	 * Test method setCategoryName
	 */
	@Test
	public void testSetCategoryName() {
		String expected = "breakfast";
		problem.setCategoryName(expected);
		String actual = problem.getCategoryName();
		assertEquals("Errors occurs in method getCategoryName", expected,
				actual);
	}

	/**
	 * Test method toString
	 */
	@Test
	public void testToString() {
		String expected = "1. breakfast; ";
		String actual = problem.toString();
		assertEquals("Errors occur in method toString", expected, actual);
	}

}
