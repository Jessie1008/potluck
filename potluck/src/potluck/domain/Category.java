package potluck.domain;

/**
 * Implement adding a category of a recipe.
 * 
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @version 1.0.0 
 * Date March 26, 2016
 * @since 1.8.0_73
 */
public class Category {

	/**
	 * Field to access category id
	 */
	private int categoryID;

	/**
	 * Field to access category name
	 */
	private String categoryName;

	/**
	 * Constructor with two parameters
	 * 
	 * @param id
	 * @param name
	 */
	public Category(int id, String name) {
		// TODO Auto-generated constructor stub
		this.categoryID = id;
		this.categoryName = name;
	}

	/**
	 * Getter for category id
	 * 
	 * @return
	 */
	public int getCategoryID() {
		return categoryID;
	}

	/**
	 * Setter for category id
	 * 
	 * @param categoryID
	 */
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	/**
	 * Getter for category name
	 * 
	 * @return
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * Setter for category name
	 * 
	 * @param categoryName
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * Reveal the message
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(categoryID);
		sb.append(". " + categoryName + "; ");
		return sb.toString();
	}

}
