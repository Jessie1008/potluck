package potluck.domain;
/**
 * A interface for member to perform desire functions on recipe
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @version 1.0.0 Date March 26, 2016
 * @since 1.8.0_73
 */

public interface RecipeController  {
	/**
	 * add a recipe to the list of the member
	 * @param recipe
	 * A Recipe object
	 */
	public void addRecipe(Recipe recipe);

	/**
	 * show all the recipes created by the member
	 */
	public void displayRecipes();

	/**
	 * show all the recipes in the database
	 */
	public void displayAllRecipes();

	/**
	 * delete a recipes
	 */
	public void deleteRecipe();

	/**
	 * edit a recipes
	 * @param recipe
	 * A Recipe object
	 */
	public void editRecipe(Recipe recipe);
	
	
}
