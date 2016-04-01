package potluck.domain;

/**
 * Implement the member builder to build member
 * 
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @version 1.0.0 
 * Date March 26, 2016
 * @since 1.8.0_73
 */
public class MemberBuilder {

	/**
	 * private attributes
	 */
	private String password;
	private String userName;
	private int memberID;
	private boolean isAdmin;
	private String alias;
	private String firstName;
	private String lastName;
	private String email;

	/**
	 * default constructor
	 */

	private MemberBuilder() {
	}

	/**
	 * the create method to create the MemberBuilder
	 * 
	 * @return the instance of MemberBuilder
	 */

	public static MemberBuilder create() {
		MemberBuilder mb = new MemberBuilder();
		return mb;
	}
/**
 * build normal user 
 * @return
 *        an reference of the new object
 */
	public Member buildNormalUser() {
		return new NormalUser(this);
	}
/**
 * build administrator
 * @return
 * an reference of the new object of Administrator
 */
	public Administrator buildAdministrator() {
		return new Administrator(this);
	}

	/**
	 * getPassword
	 * 
	 * @return current password
	 */

	public String getPassword() {
		return password;
	}

	/**
	 * getUserName
	 * 
	 * @return current userName
	 */

	public String getUserName() {
		return userName;
	}

	/**
	 * getMemberID
	 * 
	 * @return current MemberID
	 */

	public int getMemberID() {
		return memberID;
	}

	/**
	 * checking whether isAdmin
	 * 
	 * @return isAdmin false
	 */

	public boolean isAdmin() {
		return isAdmin;
	}

	/**
	 * getAlias
	 * 
	 * @return current Alias
	 */

	public String getAlias() {
		return alias;
	}

	/**
	 * getFirstName
	 * 
	 * @return current FirstName
	 */

	public String getFirstName() {
		return firstName;
	}

	/**
	 * getLastName
	 * 
	 * @return current LastName
	 */

	public String getLastName() {
		return lastName;
	}

	/**
	 * getEmail
	 * 
	 * @return current Email
	 */

	public String getEmail() {
		return email;
	}

	/**
	 * set password to password
	 * 
	 * @param password
	 *    the value of password
	 * @return the memberBuilder instance
	 */

	public MemberBuilder password(String password) {
		this.password = password;
		return this;
	}

	/**
	 * set userName to userName
	 * 
	 * @param username
	 * the value of user name
	 * @return the memberBuilder instance
	 */

	public MemberBuilder username(String username) {
		this.userName = username;
		return this;
	}

	/**
	 * set alias to alias
	 * 
	 * @param alias
	 * the value of alias
	 * @return the memberBuilder instance
	 */

	public MemberBuilder alias(String alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * set memberID to memberID
	 * 
	 * @param memberID the value of member id
	 * @return the memberBuilder instance
	 */

	public MemberBuilder memberID(int memberID) {
		this.memberID = memberID;
		return this;
	}

	/**
	 * set firstName to firstName
	 * 
	 * @param firstName the value of first name
	 * @return the memberBuilder instance
	 */

	public MemberBuilder firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * set lastName to lastName
	 * 
	 * @param lastName the value of last name
	 * @return the memberBuilder instance
	 */

	public MemberBuilder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	/**
	 * set email to email
	 * 
	 * @param email the String of email
	 * @return the memberBuilder instance
	 */

	public MemberBuilder email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * set admin to admin
	 * 
	 * @param admin the tyoe of member
	 * @return the memberBuilder instance
	 */
	public MemberBuilder admin(boolean admin) {
		this.isAdmin = admin;
		return this;
	}
	

}
