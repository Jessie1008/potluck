package potluck.domain;

import java.util.ArrayList;

public class Member {
	private String password;
	private String userName;
	private ArrayList<Recipe> recipeList;
	public Member(String userName, String password){
		recipeList=new ArrayList<>();
		this.userName=userName;
		this.password=password;
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
	public boolean confirmMember(){
		
		ArrayList<Member> arrayList=potLuckDatabase.getInstance().getMemberList();
		for(int i=0;i<arrayList.size();i++){
			if(arrayList.get(i).equals(this)){
				return true;
			}
		}
		return false;
	}
	

}
