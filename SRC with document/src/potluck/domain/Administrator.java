package potluck.domain;

/**
 * Implement the Adminstrator.
 * 
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @version 1.0.0 
 * Date March 26, 2016
 * @since 1.8.0_73
 */
public class Administrator extends Member {
	/**
	 * initialized constructor
	 * 
	 * @param memberBuilder
	 * the reference value of MemberBuilder ogject
	 */
	public Administrator(MemberBuilder memberBuilder) {
		super(memberBuilder);
	}

	/**
	 * add recipe
	 * 
	 */
	@Override
	public void addRecipe(Recipe recipe) {
		getRecipeList().add(recipe);
	}

	/**
	 * edit recipe
	 */
	@Override
	public void editRecipe(Recipe recipe) {

	}

	/**
	 * display recipes of this member
	 */
	@Override
	public void displayRecipes() {
		System.out.println(getRecipeList().toString());
	}

	/**
	 * delete recipe
	 * @param recipe to hold the reference value of recipe
	 */

	public void deleteRecipe(Recipe recipe) {

	}
}
