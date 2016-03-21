package potluck.domain;

import java.util.ArrayList;

public class potLuckDatabase {
	private static final potLuckDatabase potLuckDatabase=new potLuckDatabase();
	private ArrayList<Member> memberList;
	private ArrayList<Tag> tagList;
	private ArrayList<Category> categoryList;

	private potLuckDatabase(){
		tagList=new ArrayList<>();
		tagList=addTagList();
		categoryList=new ArrayList<>();
		categoryList=addCategoryList();
		memberList=new ArrayList<>();
		memberList=addMemberList();	
		
	}
	public static potLuckDatabase getInstance(){
		return potLuckDatabase;
	}
	
	private ArrayList<Member> addMemberList(){
		Member member= MemberBuilder.create().password("1234").username("potluck").build();
		memberList.add(member);
		return memberList;
	}
	
	
	private ArrayList<Category> addCategoryList() {
		Category category1= new Category(1,"breakfast");
		Category category2= new Category(2,"lunch");
		Category category3= new Category(3,"dinner");
		Category category4= new Category(4,"snack");
		categoryList.add(category1);
		categoryList.add(category2);
		categoryList.add(category3);
		categoryList.add(category4);
		return categoryList;
		 
	}

	private ArrayList<Tag> addTagList() {
		Tag tag1=new Tag(1,"Tuna fish");
		Tag tag2=new Tag(2,"Chocolate");
		Tag tag3=new Tag(3,"Fruit");
		Tag tag4=new Tag(4,"Chicken wing");
		tagList.add(tag1);
		tagList.add(tag2);
		tagList.add(tag3);
		tagList.add(tag4);
		return tagList;
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
