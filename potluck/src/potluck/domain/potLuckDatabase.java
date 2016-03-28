package potluck.domain;

import java.util.ArrayList;

public class PotLuckDatabase {
	private static final PotLuckDatabase potLuckDatabase = new PotLuckDatabase();
	private ArrayList<Member> memberList;
	private ArrayList<Tag> tagList;
	private ArrayList<Category> categoryList;
	private Member currentMember;

	private PotLuckDatabase() {
		tagList = new ArrayList<>();
		 addTagList();
		categoryList = new ArrayList<>();
		addCategoryList();
		memberList = new ArrayList<>();
		addMemberList();

	}

	public static PotLuckDatabase getInstance() {
		return potLuckDatabase;
	}

	private void addMemberList() {
		Member member = MemberBuilder.create().password("1234").username("potluck").build();
		memberList.add(member);
		
	}

	private void addCategoryList() {
		Category category1 = new Category(1, "breakfast");
		Category category2 = new Category(2, "lunch");
		Category category3 = new Category(3, "dinner");
		Category category4 = new Category(4, "snack");
		categoryList.add(category1);
		categoryList.add(category2);
		categoryList.add(category3);
		categoryList.add(category4);

	}

	private void addTagList() {
		Tag tag1 = new Tag(1, "Tuna fish");
		Tag tag2 = new Tag(2, "Chocolate");
		Tag tag3 = new Tag(3, "Fruit");
		Tag tag4 = new Tag(4, "Chicken wing");
		tagList.add(tag1);
		tagList.add(tag2);
		tagList.add(tag3);
		tagList.add(tag4);
		
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

	public void setCurrentMember(Member member) {
		currentMember = member;
	}

	public Member getCurrentMember() {
		return currentMember;
	}
}
