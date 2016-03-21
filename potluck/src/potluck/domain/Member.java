package potluck.domain;

import java.util.ArrayList;

import javax.management.MBeanAttributeInfo;

public class Member {
	private String password;
	private String userName;
	private int memberID;
	private boolean isAdmin;
	private String alias;
	private String firstName;
	private String lastName;
	private String email;
	private ArrayList<Recipe> recipeList;

	public Member() {
		recipeList = new ArrayList<>();
	}

	// create member using MemberBuilder
	public Member(MemberBuilder memberBuilder) {
		recipeList = new ArrayList<>();
		this.password = memberBuilder.getPassword();
		this.userName = memberBuilder.getUserName();
		this.alias = memberBuilder.getAlias();
		this.memberID = memberBuilder.getMemberID();
		this.isAdmin = memberBuilder.isAdmin();
		this.firstName = memberBuilder.getFirstName();
		this.lastName = memberBuilder.getLastName();
		this.email = memberBuilder.getEmail();
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Recipe> getRecipeList() {
		return recipeList;
	}

	public void setRecipeList(ArrayList<Recipe> recipeList) {
		this.recipeList = recipeList;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean equals(Member member) {
		if (this.userName.equals(member.getUserName()) && this.password.equals(member.getPassword()))
			return true;
		return false;

	}

	public boolean confirmMember() {

		ArrayList<Member> arrayList = potLuckDatabase.getInstance().getMemberList();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).equals(this)) {
				return true;
			}
		}
		return false;
	}

}
