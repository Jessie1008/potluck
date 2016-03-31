package potluck.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import potluck.domain.Ingredient;

/**
 * Test methods in class Ingredient. Date March 26, 2016
 * 
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @see org.junit.Assert
 * @see org.junit.After
 * @see org.junit.Before
 * @see org.junit.Test
 * @see potluck.domain.Ingredient
 * @version 1.0.0
 * @since 1.8.0_73
 */
public class IngredientTest {

	/**
	 * Reference to Ingredient
	 */
	private Ingredient problem;

	/**
	 * Initialize field before each test
	 * 
	 * @throws java.lang.Exception
	 *             Give messages if errors occur
	 */
	@Before
	public void setUp() throws Exception {
		problem = new Ingredient();
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
	 * Test default constructor
	 */
	@Test
	public void testDefaultConstructor() {
		assertNotNull("Constructor has not been tested.", problem);
	}

	/**
	 * Test constructor with parameters
	 */
	@Test
	public void testParametersConstructor() {
		String expected = "fish";
		problem = new Ingredient("fish", "Prepare buttor");
		String actual = problem.getName();
		assertEquals("Parameters constructor has not been created", expected,
				actual);

	}

	/**
	 * Test method getIngredient_id
	 */
	@Test
	public void testGetIngredientID() {
		double delta = 0.001;
		int expected = 1;
		problem.setIngredient_id(expected);
		int actual = problem.getIngredient_id();
		assertEquals("Errors occur in method getIngredient_id", expected,
				actual, delta);
	}

	/**
	 * Test method setIngredient_id
	 */
	@Test
	public void testSetIngredientID() {
		double delta = 0.001;
		int expected = 1;
		problem.setIngredient_id(expected);
		int actual = problem.getIngredient_id();
		assertEquals("Errors occur in method setIngredient_id", expected,
				actual, delta);
	}

	/**
	 * Test method getName
	 */
	@Test
	public void testGetName() {
		String expected = "fish";
		problem.setName(expected);
		String actual = problem.getName();
		assertEquals("Errors occur in method getName", expected, actual);
	}

	/**
	 * Test method setName
	 */
	@Test
	public void testSetName() {
		String expected = "fish";
		problem.setName(expected);
		String actual = problem.getName();
		assertEquals("Errors occur in method setName", expected, actual);
	}

	/**
	 * Test method getMeasurement
	 */
	@Test
	public void testGetMeasurement() {
		String expected = "Prepare butter";
		problem.setMeasurement(expected);
		String actual = problem.getMeasurement();
		assertEquals("Errors occur in method setMeasurement", expected, actual);
	}

	/**
	 * Test method setMeasurement
	 */
	@Test
	public void testSetMeasurement() {
		String expected = "Prepare butter";
		problem.setMeasurement(expected);
		String actual = problem.getMeasurement();
		assertEquals("Errors occur in method setMeasurement", expected, actual);
	}

	/**
	 * Test method toString
	 */
	@Test
	public void testToString() {
		problem.setName("fish");
		problem.setMeasurement("Prepare butter");
		String expected = "fish: Prepare butter";
		String actual = problem.toString();
		assertEquals("Errors occur in method toString", expected, actual);
	}
}
