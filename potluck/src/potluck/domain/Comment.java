package potluck.domain;

import java.util.Date;

/**
 * Implement adding comments of a recipe.
 * 
 * @author XXXXXX Zhe Huang
 * @version 1.0.0 Date March 12, 2016
 * @since 1.8.0_73
 */
public class Comment {

	/**
	 * Field of comment id
	 */
	private int comment_id;

	/**
	 * Field of creating comments date
	 */
	private Date date_created;

	/**
	 * Field of recipe rank
	 */
	private int rank;

	/**
	 * Field of comment text
	 */
	private String comment_text;

	/**
	 * Default Constructor
	 */
	public Comment() {
		comment_id = 0;
		date_created = null;
		rank = 0;
		comment_text = null;
	}

	/**
	 * Constructor for all parameters
	 * 
	 * @param comment_id
	 * @param date_created
	 * @param rank
	 * @param comment_text
	 */
	public Comment(int comment_id, Date date_created, int rank,
			String comment_text) {
		this.comment_id = comment_id;
		this.date_created = date_created;
		this.rank = rank;
		this.comment_text = comment_text;
	}

	/**
	 * Getter for comment id
	 * 
	 * @return int
	 */
	public int getComment_id() {
		return comment_id;
	}

	/**
	 * Setter for comment id
	 * 
	 * @param comment_id
	 */
	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}

	/**
	 * Getter for creating comments date
	 * 
	 * @return String
	 */
	public Date getDate_created() {
		return date_created;
	}

	/**
	 * Setter for creating comments date
	 * 
	 * @param date_created
	 */
	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}

	/**
	 * Getter for rank
	 * 
	 * @return int
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * Setter for rank
	 * 
	 * @param rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * Getter for comment text
	 * 
	 * @return String
	 */
	public String getComment_text() {
		return comment_text;
	}

	/**
	 * Setter for comment text
	 * 
	 * @param comment_text
	 */
	public void setComment_text(String comment_text) {
		this.comment_text = comment_text;
	}

}
