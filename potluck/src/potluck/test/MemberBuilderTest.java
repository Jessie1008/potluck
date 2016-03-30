package potluck.test;
/**
 * Test methods in class MemberBuilder.
 * 
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @see org.junit.Assert
 * @see org.junit.After
 * @see org.junit.Before
 * @see org.junit.Test
 * @see potluck.domain.MemberBuilder
 * @version 1.0.0 Date March 26, 2016
 * @since 1.8.0_73
 */
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import potluck.domain.MemberBuilder;

public class MemberBuilderTest {
	/**
	 * reference of the MemberBuilder object
	 */

	private MemberBuilder builder;

	/**
	 * set up the every test
	 * 
	 * @throws Exception
	 *             exception
	 */
	@Before
	public void setUp() throws Exception {
		builder = MemberBuilder.create();
	}

	/**
	 * set the builder to null after each test
	 * 
	 * @throws Exception
	 * Exception
	 */
	@After
	public void tearDown() throws Exception {
		builder = null;
	}
/**
 * test create() method
 */
	@Test
	public void testCreate() {

		assertNotNull("Testing that constructor created object", builder);

	}
/**
 * test get and set password
 */
	@Test
	public void testGetPassword() {

		String test = "abc";
		builder.password(test);
		assertEquals(builder.getPassword(), test);
	}
/**
 * test set and get user name methods
 */
	@Test
	public void testGetUserName() {
		String test = "abc";
		builder.username(test);
		assertEquals(builder.getUserName(), test);
	}
	/**
	 * test set and get member id methods
	 */

	@Test
	public void testGetMemberID() {
		int test = 123;
		builder.memberID(test);
		assertEquals(builder.getMemberID(), test);
	}
/**
 * test get and set isadmin methods
 */
	@Test
	public void testIsAdmin() {
		boolean test = true;
		builder.admin(test);
		assertTrue(builder.isAdmin());
	}
/**
 * test get and set alias 
 */
	@Test
	public void testGetAlias() {
		String test = "abc";
		builder.alias(test);
		assertEquals(builder.getAlias(), test);
	}
/**
 * test set and get first name
 */
	@Test
	public void testGetFirstName() {
		String test = "abc";
		builder.firstName(test);
		assertEquals(builder.getFirstName(), test);
	}
	/**
	 * test get and set last name
	 */

	@Test
	public void testGetLastName() {
		String test = "abc";
		builder.lastName(test);
		assertEquals(builder.getLastName(), test);
	}
	/**
	 * test get and set email
	 */

	@Test
	public void testGetEmail() {
		String test = "abc@abc.com";
		builder.email(test);
		assertEquals(builder.getEmail(), test);
	}

/**
 * test Build method
 */
	@Test
	public void testBuild() {
		assertNotNull("Testing that constructor created object", builder.buildNormalUser());
	}

}
