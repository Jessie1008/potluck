package potluck.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import potluck.domain.Comment;

/**
 * Test methods in class Comment.
 * 
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @see org.junit.Assert
 * @see java.util.Date
 * @see org.junit.After
 * @see org.junit.Before
 * @see org.junit.Test
 * @see potluck.domain.Comment
 * @version 1.0.0 Date March 26, 2016
 * @since 1.8.0_73
 */
public class CommentTest {

	/**
	 * Reference to the Comment
	 */
	private Comment problem;

	/**
	 * Initialize field before each test
	 * 
	 * @throws java.lang.Exception
	 *             Give messages if errors occur
	 */
	@Before
	public void setUp() throws Exception {
		problem = new Comment();
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
		assertNotNull("Default constructor has not been tested.", problem);
	}

	/**
	 * Test constructor with parameters
	 */
	@Test
	public void testParametersConstructor() {
		Date expected = new Date(2016, 3, 27, 20, 30);
		problem = new Comment(1, expected, 1, "excellent");
		Date actual = problem.getDate_created();
		assertTrue("Parameters constructor has not been tested.",
				actual.equals(expected));
	}

	/**
	 * Test method getComment_id
	 */
	@Test
	public void testGetCommentID() {
		double delta = 0.001;
		int expected = 1;
		problem.setComment_id(expected);
		int actual = problem.getComment_id();
		assertEquals("Errors occur in method getComment_id", expected, actual,
				delta);
	}

	/**
	 * Test method setComment_id
	 */
	@Test
	public void testSetCommentID() {
		double delta = 0.001;
		int expected = 1;
		problem.setComment_id(expected);
		int actual = problem.getComment_id();
		assertEquals("Errors occur in method setComment_id", expected, actual,
				delta);
	}

	/**
	 * Test method getDate_created
	 */
	@Test
	public void testGetDateCreated() {
		Date expected = new Date(2016, 3, 27, 20, 30);
		problem.setDate_created(expected);
		Date actual = problem.getDate_created();
		assertTrue("Parameters constructor has not been tested.",
				actual.equals(expected));
	}

	/**
	 * Test method setDate_created
	 */
	@Test
	public void testSetDateCreated() {
		Date expected = new Date(2016, 3, 27, 20, 30);
		problem.setDate_created(expected);
		Date actual = problem.getDate_created();
		assertTrue("Parameters constructor has not been tested.",
				actual.equals(expected));
	}

	/**
	 * Test method getRank
	 */
	@Test
	public void testGetRank() {
		double delta = 0.001;
		int expected = 1;
		problem.setRank(expected);
		int actual = problem.getRank();
		assertEquals("Errors occur in method getRank", expected, actual, delta);
	}

	/**
	 * Test method setRank
	 */
	@Test
	public void testSetRank() {
		double delta = 0.001;
		int expected = 1;
		problem.setRank(expected);
		int actual = problem.getRank();
		assertEquals("Errors occur in method setRank", expected, actual, delta);
	}

	/**
	 * Test method getComment_text
	 */
	@Test
	public void testGetCommentText() {
		String expected = "excellent";
		problem.setComment_text(expected);
		String actual = problem.getComment_text();
		assertEquals("Errors occur in method getComment_text", expected,
				actual);
	}

	/**
	 * Test method setComment_text
	 */
	@Test
	public void testSetCommentText() {
		String expected = "excellent";
		problem.setComment_text(expected);
		String actual = problem.getComment_text();
		assertEquals("Errors occur in method setComment_text", expected,
				actual);
	}

}
