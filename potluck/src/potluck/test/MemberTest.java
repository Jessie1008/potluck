package potluck.test;

/**
 * Test methods in class Member.
 * 
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @see org.junit.Assert
 * @see org.junit.After
 * @see org.junit.Before
 * @see org.junit.Test
 * @see potluck.domain.Member
 * @see potluck.domain.MemberBuilder
 * @version 1.0.0
 * Date March 26, 2016
 * @since 1.8.0_73
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import potluck.domain.Member;
import potluck.domain.MemberBuilder;

public class MemberTest {
	private Member member;

	/**
	 * set up before each test
	 * 
	 * @throws Exception
	 *             Exception
	 */
	@Before
	public void setUp() throws Exception {
		member = MemberBuilder.create().buildNormalUser();
	}

	/**
	 * reset after each test
	 * 
	 * @throws Exception
	 *             Exception
	 */
	@After
	public void tearDown() throws Exception {
		member = null;
	}

	/**
	 * test Member constructor
	 */
	@Test
	public void testMember() {
		assertNotNull("Testing that constructor created object", member);
	}

	/**
	 * test get and set memberId
	 */

	@Test
	public void testGetAndSetMemberID() {
		member.setMemberID(1);
		final int EXPECTED = 1;
		int actual = member.getMemberID();
		assertEquals(EXPECTED, actual);

	}

	/**
	 * test get and set isAdmin
	 */

	@Test
	public void testGetAndSetIsAdmin() {
		member.setAdmin(true);
		boolean actual = member.getAdmin();
		assertTrue(actual);

	}

	/**
	 * test get and set alias
	 */

	@Test
	public void testGetAndSetAlias() {
		member.setAlias("ABC");
		final String EXPECTED = "ABC";
		String actual = member.getAlias();
		assertEquals(EXPECTED, actual);

	}

	/**
	 * test get and set first name
	 */
	@Test
	public void testGetAndSetFirstName() {
		member.setFirstName("W");
		final String EXPECTED = "W";
		String actual = member.getFirstName();
		assertEquals(EXPECTED, actual);

	}

	/**
	 * test get and set last name
	 */
	@Test
	public void testGetandSetLastName() {
		member.setLastName("A");
		final String EXPECTED = "A";
		String actual = member.getLastName();
		assertEquals(EXPECTED, actual);

	}

	/**
	 * test get and set email
	 */

	@Test
	public void testGetAndSetEmail() {
		member.setEmail("abc@gamil.com");
		final String EXPECTED = "abc@gamil.com";
		String actual = member.getEmail();
		assertEquals(EXPECTED, actual);

	}

	/**
	 * test get and set password
	 */

	@Test
	public void testGetAndSetPassword() {
		member.setPassword("1234");
		final String EXPECTED = "1234";
		String actual = member.getPassword();
		assertEquals(EXPECTED, actual);
	}

	/**
	 * test get adn set user name
	 */

	@Test
	public void testGetAndSetUserName() {
		member.setUserName("Scott Tiger");
		final String EXPECTED = "Scott Tiger";
		String actual = member.getUserName();
		assertEquals(EXPECTED, actual);
	}

}
