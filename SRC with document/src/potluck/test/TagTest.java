package potluck.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import potluck.domain.Tag;

/**
 * Test methods in class Tag. Date March 26, 2016
 * 
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @see org.junit.Assert
 * @see org.junit.After
 * @see org.junit.Before
 * @see org.junit.Test
 * @see potluck.domain.Tag
 * @version 1.0.0
 * @since 1.8.0_73
 */
public class TagTest {

	/**
	 * Reference to the Tag
	 */
	private Tag problem;

	/**
	 * Initialize field before each test
	 * 
	 * @throws java.lang.Exception
	 *             Give messages if errors occur
	 */
	@Before
	public void setUp() throws Exception {
		problem = new Tag();
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
		double delta = 0.001;
		int expected = 1;
		problem = new Tag(1, "Tuna fish");
		int actual = problem.getTagID();
		assertEquals("Parameters constructor has not been created", expected,
				actual, delta);

	}

	/**
	 * Test method getTagID
	 */
	@Test
	public void testGetTagID() {
		double delta = 0.001;
		int expected = 1;
		problem.setTagID(expected);
		int actual = problem.getTagID();
		assertEquals("Errors occur in method setTagID", expected, actual,
				delta);
	}

	/**
	 * Test method setTagID
	 */
	@Test
	public void testSetTagID() {
		double delta = 0.001;
		int expected = 1;
		problem.setTagID(expected);
		int actual = problem.getTagID();
		assertEquals("Errors occur in method setTagID", expected, actual,
				delta);
	}

	/**
	 * Test method getTagText
	 */
	@Test
	public void testGetTagText() {
		String expected = "Chocolate";
		problem.setTagText(expected);
		String actual = problem.getTagText();
		assertEquals("Errors occur in method getTagText", expected, actual);
	}

	/**
	 * Test method setTagText
	 */
	@Test
	public void testSetTagText() {
		String expected = "Chocolate";
		problem.setTagText(expected);
		String actual = problem.getTagText();
		assertEquals("Errors occur in method setTagText", expected, actual);
	}

	/**
	 * Test method toString
	 */
	@Test
	public void testToString() {
		problem.setTagID(3);
		problem.setTagText("Fruit");
		String expected = "3. Fruit; ";
		String actual = problem.toString();
		assertEquals("Errors occur in method toString", expected, actual);
	}

}
