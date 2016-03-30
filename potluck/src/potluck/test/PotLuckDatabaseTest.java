package potluck.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import potluck.domain.Member;
import potluck.domain.MemberBuilder;
import potluck.domain.PotLuckDatabase;

/**
 * Test methods in class potLuckDatabase. Date March 26, 2016
 * 
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @see org.junit.Assert
 * @see org.junit.After
 * @see org.junit.Before
 * @see org.junit.Test
 * @see potluck.domain.Member
 * @see potluck.domain.MemberBuilder
 * @see potluck.domain.PotLuckDatabase
 * @version 1.0.0
 * @since 1.8.0_73
 */
public class PotLuckDatabaseTest {

	/**
	 * Reference to access to potLuckDatabase
	 */
	private PotLuckDatabase problem;

	/**
	 * Initialize field before each test
	 * 
	 * @throws java.lang.Exception
	 *             Give messages if errors occur
	 */
	@Before
	public void setUp() throws Exception {
		problem = problem.getInstance();
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
	 * Test method getMemberList
	 */
	@Test
	public void testGetMemberList() {
		assertEquals("Errors occur in method getMemberList", 2,
				problem.getMemberList().size());
	}

	/**
	 * Test method getTagList
	 */
	@Test
	public void testGetTagList() {
		assertEquals("Errors occur in method getTagList", 4,
				problem.getTagList().size());
	}

	/**
	 * Test method getCategoryList
	 */
	@Test
	public void testGetCategoryList() {
		assertEquals("Errors occur in method getCategoryList", 4,
				problem.getCategoryList().size());
	}

	/**
	 * Test method setCurrentMember
	 */
	@Test
	public void testSetCurrentMember() {
		Member expected = MemberBuilder.create().buildNormalUser();
		problem.setCurrentMember(expected);
		Member actual = problem.getCurrentMember();
		assertEquals("Errors occur in method setCurrentMember", expected,
				actual);
	}

	/**
	 * Test method getCurrentMember
	 */
	@Test
	public void testGetCurrentMember() {
		Member expected = MemberBuilder.create().buildAdministrator();
		problem.setCurrentMember(expected);
		Member actual = problem.getCurrentMember();
		assertEquals("Errors occur in method setCurrentMember", expected,
				actual);
	}

}
