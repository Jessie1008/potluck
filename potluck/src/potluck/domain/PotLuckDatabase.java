package potluck.domain;

import java.util.ArrayList;

/**
 * Database to save information of recipes
 * 
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @version 1.0.0 Date March 26, 2016
 * @since 1.8.0_73
 */
public class PotLuckDatabase {

	/**
	 * {@value} Initialize the database of project
	 */
	private static final PotLuckDatabase potLuckDatabase = new PotLuckDatabase();

	/**
	 * Reference to access list of member
	 */
	private ArrayList<Member> memberList;

	/**
	 * Reference to access list of tag
	 */
	private ArrayList<Tag> tagList;

	/**
	 * Reference to access list of category
	 */
	private ArrayList<Category> categoryList;

	/**
	 * Reference to access Member
	 */
	private Member currentMember;

	/**
	 * Default constructor
	 */
	private PotLuckDatabase() {
		tagList = new ArrayList<>();
		addTagList();
		categoryList = new ArrayList<>();
		addCategoryList();
		memberList = new ArrayList<>();
		addMemberList();
	}

	/**
	 * Getter for the single instance
	 * 
	 * @return potLuckDatabase
	 */
	public static PotLuckDatabase getInstance() {
		return potLuckDatabase;
	}

	/**
	 * Add new members to list of member
	 */
	private void addMemberList() {
		Member member = MemberBuilder.create().password("1234").username("potluck").buildNormalUser();
		Member administrator = MemberBuilder.create().password("789").username("admin").buildNormalUser();
		memberList.add(member);
		memberList.add(administrator);
	}

	/**
	 * Add new categories to list of category
	 */
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

	/**
	 * Add new tags to list of tag
	 */
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

	/**
	 * Getter for list of member
	 * 
	 * @return ArrayList<Member>
	 */
	public ArrayList<Member> getMemberList() {
		return memberList;
	}

	/**
	 * Getter for list of tag
	 * 
	 * @return ArrayList<Tag>
	 */
	public ArrayList<Tag> getTagList() {
		return tagList;
	}

	/**
	 * Getter for list of category
	 * 
	 * @return ArrayList<Category>
	 */
	public ArrayList<Category> getCategoryList() {
		return categoryList;
	}

	/**
	 * Setter for current member
	 * 
	 * @param member
	 *            The current member who logins in
	 */
	public void setCurrentMember(Member member) {
		currentMember = member;
	}

	/**
	 * Getter for current member
	 * 
	 * @return Member
	 */
	public Member getCurrentMember() {
		return currentMember;
	}

}
