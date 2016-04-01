package potluck.domain;

import java.util.ArrayList;
/**
 * Implement the class member.
 * 
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @version 1.0.0 
 * @see java.util.ArrayList
 * Date March 26, 2016
 * @since 1.8.0_73
 */
public abstract class Member {
	
	/**
	 * 
	 * private variable used to store Member Password
	 */
	private String password;
	/**
	 * private variable used to store Member Name
	 */
	private String userName;
	/**
	 * private variable used to store Member ID
	 */
	private int memberID;
	/**
	 * private variable used to check is Admin
	 */
	private boolean isAdmin;
	/**
	 * private variable used to store Member alias
	 */
	private String alias;
	/**
	 * private variable used to store Member first Name
	 */
	private String firstName;
	/**
	 * private variable used to store Member last Name
	 */
	private String lastName;
	/**
	 * private variable used to store Member email
	 */
	private String email;
	
	
	private ArrayList<Recipe> recipeList;
	/**
	 * Default constructor.
	 */
	public Member(){
		recipeList=new ArrayList<>();
		
		
	}
	/**
	 * getter and setter
	 */
	/**
	 * getMemberID 
	 * @return current MemberID
	 */
	public int getMemberID() {
		return memberID;
	}
	/**
	 * setMemberID TO ID
	 * @param memberID set id to int
	 */
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	/**
	 * boolean isAdmin
	 * @return isAdmin
	 */
	public boolean getAdmin() {
		return isAdmin;
	}
	/**
	 * setAdmin to false
	 * @param isAdmin set to false
	 */
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	/**
	 * getAlias
	 * @return current getAlias
	 */
	public String getAlias() {
		return alias;
	}
	/**
	 * setAlias to alias
	 * @param alias set to String
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}
	/**
	 * getFirstName
	 * @return current FirstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * setFirstName to FirstName
	 * @param firstName set name to String
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * getLastName
	 * @return current lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * setLastName to name
	 * @param lastName set name to String
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * getEmail
	 * @return current Email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * setEmail to email
	 * @param email set to String
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * getRecipeList
	 * @return current RecipeList
	 */
	public ArrayList<Recipe> getRecipeList() {
		return recipeList;
	}
	/**
	 * setRecipeList to RecipeList
	 * @param  recipeList  
	 * set RecipeList to ArrayList
	 */
	public void setRecipeList(ArrayList<Recipe> recipeList) {
		this.recipeList = recipeList;
	}
	/**
	 * constructor with parameters
	 * @param memberBuilder
	 *  set recipeList to Member
	 */
	public Member(MemberBuilder memberBuilder) {
		recipeList=new ArrayList<>();
		// TODO Auto-generated constructor stub
		this.password=memberBuilder.getPassword();
		this.userName=memberBuilder.getUserName();
		this.alias=memberBuilder.getAlias();
		this.memberID=memberBuilder.getMemberID();
		this.isAdmin=memberBuilder.isAdmin();
		this.firstName=memberBuilder.getFirstName();
		this.lastName=memberBuilder.getLastName();
		this.email=memberBuilder.getEmail();
	}
	/**
	 * getPassword
	 * @return current Password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * setPassword to password
	 * @param password set password to String
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 *getUserName
	 * @return current userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * setUserName
	 * @param userName set userName to String
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public boolean  equals(Member member)
	{
		if(member.getUserName().equals(this.userName)&&member.password.equals(this.password)){
			return true;
		}
		return false;
	}
	/**
	 * confirmMember
	 * @return true or false
	 */
	public boolean confirmMember(){
		//check the member is registered or not
		ArrayList<Member> arrayList=PotLuckDatabase.getInstance().getMemberList();
		for(int i=0;i<arrayList.size();i++){
			if(arrayList.get(i).equals(this)){
				return true;
			}
		}
		return false;
	}
	/**
	 * abstract method to add recipe
	 * @param recipe
	 *    to hold the reference of Recipe object
	 */
	public abstract void addRecipe(Recipe recipe);
	/**
	 * abstract method to edit recipe
	 * @param recipe
	 *      to hold the reference of Recipe object
	 */
	public abstract void editRecipe(Recipe recipe);
	/**
	 * abstract method to display recipe
	 */

	public abstract void displayRecipes() ;
	

}
