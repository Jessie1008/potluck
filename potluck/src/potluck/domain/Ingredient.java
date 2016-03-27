package potluck.domain;

/**
 * Implement adding ingredients of a recipe.
 * 
 * @author XXXXXX Zhe Huang
 * @version 1.0.0 Date March 12, 2016
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
		ingredient_id = 0;
		name = null;
		measurement = null;
	}

	/**
	 * Constructor for id, name and measurement parameters
	 * 
	 * @param ingredient_id
	 * @param name
	 * @param measurement
	 */
	public Ingredient(int ingredient_id, String name, String measurement) {
		this.ingredient_id = ingredient_id;
		this.name = name;
		this.measurement = measurement;
	}

	/**
	 * Getter for ingredient id
	 * 
	 * @return int
	 */
	public int getIngredient_id() {
		return ingredient_id;
	}

	/**
	 * Setter for ingredient id
	 * 
	 * @param ingredient_id
	 */
	public void setIngredient_id(int ingredient_id) {
		this.ingredient_id = ingredient_id;
	}

	/**
	 * Getter for ingredient name
	 * 
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for ingredient name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter for measurement
	 * 
	 * @return String
	 */
	public String getMeasurement() {
		return measurement;
	}

	/**
	 * Setter for measurement
	 * 
	 * @param measurement
	 */
	public void setMeasurement(String measurement) {
		this.measurement = measurement;
	}

}
