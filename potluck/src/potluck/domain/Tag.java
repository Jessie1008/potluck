package potluck.domain;

/**
 * Implement adding tags of a recipe.
 * 
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @version 1.0.0 Date March 26, 2016
 * @since 1.8.0_73
 */
public class Tag {

	/**
	 * Field to access tag id
	 */
	private int tagID;

	/**
	 * Field to access tag text
	 */
	private String tagText;

	/**
	 * Default Constructor
	 */
	public Tag() {

	}

	/**
	 * Constructor with two parameters
	 * 
	 * @param id
	 * @param tagText
	 */
	public Tag(int id, String tagText) {
		this.tagID = id;
		this.tagText = tagText;
	}

	/**
	 * Getter for tag id
	 * 
	 * @return
	 */
	public int getTagID() {
		return tagID;
	}

	/**
	 * Setter for tag id
	 * 
	 * @param tagID
	 */
	public void setTagID(int tagID) {
		this.tagID = tagID;
	}

	/**
	 * Getter for tag text
	 * 
	 * @return
	 */
	public String getTagText() {
		return tagText;
	}

	/**
	 * Setter for tag text
	 * 
	 * @param tagText
	 */
	public void setTagText(String tagText) {
		this.tagText = tagText;
	}

	/**
	 * Reveal the message
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(tagID);
		sb.append(". " + tagText + "; ");
		return sb.toString();
	}

}
