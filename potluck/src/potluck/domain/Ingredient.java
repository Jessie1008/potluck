package potluck.domain;

/**
 * Implement adding ingredients of a recipe. Date March 26, 2016
 * 
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @version 1.0.0
 * @since 1.8.0_73
 */
public class Ingredient {

	/**
	 * Fields to access ingredient id
	 */
	private int ingredient_id;

	/**
	 * Fields to access ingredient name
	 */
	private String name;

	/**
	 * Fields to access ingredient measurement
	 */
	private String measurement;

	/**
	 * Default Constructor
	 */
	public Ingredient() {
		name = null;
		measurement = null;
	}

	/**
	 * Constructor for id, name and measurement parameters
	 * 
	 * @param name
	 *            ingredient name
	 * @param measurement
	 *            ingredient measurements
	 */
	public Ingredient(String name, String measurement) {
		this.name = name;
		this.measurement = measurement;
	}

	/**
	 * Getter for ingredient id
	 * 
	 * @return int return ingredient id
	 */
	public int getIngredient_id() {
		return ingredient_id;
	}

	/**
	 * Setter for ingredient id
	 * 
	 * @param ingredient_id
	 *            ingredient id
	 */
	public void setIngredient_id(int ingredient_id) {
		this.ingredient_id = ingredient_id;
	}

	/**
	 * Getter for ingredient name
	 * 
	 * @return String return ingredient name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for ingredient name
	 * 
	 * @param name
	 *            ingredient name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter for measurement
	 * 
	 * @return String return ingredient measurements
	 */
	public String getMeasurement() {
		return measurement;
	}

	/**
	 * Setter for measurement
	 * 
	 * @param measurement
	 *            ingredient measurements
	 */
	public void setMeasurement(String measurement) {
		this.measurement = measurement;
	}

	/**
	 * Reveal the message
	 * 
	 * @return String return ingredient information
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(": ");
		sb.append(measurement);
		return sb.toString();
	}
}
