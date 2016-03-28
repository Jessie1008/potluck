package potluck.domain;

public class MemberBuilder {
	private String password;
	private String userName;
	private int memberID;
	private boolean isAdmin;
	private String alias;
	private String firstName;
	private String lastName;
	private String email;

	private MemberBuilder() {
	}

	public static MemberBuilder create() {
		MemberBuilder mb = new MemberBuilder();
		return mb;
	}
	public Member build() {
		return new Member(this);
	}
	public Administrator buildAdministrator(){
		return new Administrator(this);
	}
	public MemberBuilder password(String password) {
		this.password = password;
		return this;
	}

	public MemberBuilder username(String username) {
		this.userName = username;
		return this;
	}

	public MemberBuilder alias(String alias) {
		this.alias = alias;
		return this;
	}

	public MemberBuilder memberID(int memberID) {
		this.memberID = memberID;
		return this;
	}

	public MemberBuilder firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public MemberBuilder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public MemberBuilder email(String email) {
		this.email = email;
		return this;
	}
	public MemberBuilder admin(boolean admin){
		this.isAdmin=admin;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public String getUserName() {
		return userName;
	}

	public int getMemberID() {
		return memberID;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public String getAlias() {
		return alias;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	
	
}
