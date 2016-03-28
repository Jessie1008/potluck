package potluck.domain;

public class Category {

	private int categoryID;
	private String categoryName;

	public Category(int id, String name) {
		// TODO Auto-generated constructor stub
		this.categoryID = id;
		this.categoryName = name;

	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(categoryID);
		sb.append(". " + categoryName+"; ");
		return sb.toString();
	}

}
