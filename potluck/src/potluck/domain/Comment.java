package potluck.domain;

import java.util.Date;

/**
 * Implement adding comments of a recipe. Date March 26, 2016
 * 
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @see java.util.Date
 * @version 1.0.0
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
	 *            comment id
	 * @param date_created
	 *            the date that create comments
	 * @param rank
	 *            rank of recipe
	 * @param comment_text
	 *            content of comments
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
	 * @return int return comment id
	 */
	public int getComment_id() {
		return comment_id;
	}

	/**
	 * Setter for comment id
	 * 
	 * @param comment_id
	 *            comment id
	 */
	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}

	/**
	 * Getter for creating comments date
	 * 
	 * @return Date create date
	 */
	public Date getDate_created() {
		return date_created;
	}

	/**
	 * Setter for creating comments date
	 * 
	 * @param date_created
	 *            the value of date created
	 */
	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}

	/**
	 * Getter for rank
	 * 
	 * @return int value of the rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * Setter for rank
	 * 
	 * @param rank
	 *            value of rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * Getter for comment text
	 * 
	 * @return String comment text
	 */
	public String getComment_text() {
		return comment_text;
	}

	/**
	 * Setter for comment text
	 * 
	 * @param comment_text
	 *            comment text
	 */
	public void setComment_text(String comment_text) {
		this.comment_text = comment_text;
	}

}
