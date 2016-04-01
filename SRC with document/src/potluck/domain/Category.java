package potluck.domain;

/**
 * Implement adding a category of a recipe. Date March 26, 2016
 * 
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @version 1.0.0
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
	 *            category id
	 * @param name
	 *            category name
	 */
	public Category(int id, String name) {
		// TODO Auto-generated constructor stub
		this.categoryID = id;
		this.categoryName = name;
	}

	/**
	 * Getter for category id
	 * 
	 * @return the value of category ID
	 */
	public int getCategoryID() {
		return categoryID;
	}

	/**
	 * Setter for category id
	 * 
	 * @param categoryID
	 *            return the value of category id
	 */
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	/**
	 * Getter for category name
	 * 
	 * @return the category name
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * Setter for category name
	 * 
	 * @param categoryName
	 *            the value of category name
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * Reveal the message
	 * 
	 * @return String the information of category
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(categoryID);
		sb.append(". " + categoryName + "; ");
		return sb.toString();
	}

}
