package potluck.domain;

/**
 * Implement adding tags of a recipe. Date March 26, 2016
 * 
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @version 1.0.0
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
	 *            value of tag id
	 * @param tagText
	 *            String of tag text
	 */
	public Tag(int id, String tagText) {
		this.tagID = id;
		this.tagText = tagText;
	}

	/**
	 * Getter for tag id
	 * 
	 * @return int return tag id
	 */
	public int getTagID() {
		return tagID;
	}

	/**
	 * Setter for tag id
	 * 
	 * @param tagID
	 *            the tag id
	 */
	public void setTagID(int tagID) {
		this.tagID = tagID;
	}

	/**
	 * Getter for tag text
	 * 
	 * @return String return the text of tag
	 */
	public String getTagText() {
		return tagText;
	}

	/**
	 * Setter for tag text
	 * 
	 * @param tagText
	 *            the tag text
	 */
	public void setTagText(String tagText) {
		this.tagText = tagText;
	}

	/**
	 * Reveal the message
	 * 
	 * @return String return the tag information
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(tagID);
		sb.append(". " + tagText + "; ");
		return sb.toString();
	}

}
