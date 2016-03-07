package potluck.domain;

import java.util.ArrayList;

public class potLuckDatabase {
	private static final potLuckDatabase potLuckDatabase=new potLuckDatabase();
	private ArrayList<Member> memberList;
	private ArrayList<Tag> tagList;
	private ArrayList<Category> categoryList;

	private potLuckDatabase(){
		memberList=new ArrayList<>();
	}
	public static potLuckDatabase getInstance(){
		return potLuckDatabase;
	}
	
	public ArrayList<Member> getMemberList() {
		return memberList;
	}
	
	
	
	public ArrayList<Tag> getTagList() {
		return tagList;
	}

	

	public ArrayList<Category> getCategoryList() {
		return categoryList;
	}

}
