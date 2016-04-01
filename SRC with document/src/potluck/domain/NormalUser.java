package potluck.domain;

/**
 * Implement normal user.
 * 
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @version 1.0.0 Date March 26, 2016
 * @since 1.8.0_73
 */

public class NormalUser extends Member {
	/**
	 * Initialized Constructor
	 * 
	 * @param memberBuilder the reference of the MemberBuilder object
	 */
	public NormalUser(MemberBuilder memberBuilder) {
		super(memberBuilder);
	}

	

	/**
	 * add recipe by normal user
	 */
	@Override
	public void addRecipe(Recipe recipe) {
		getRecipeList().add(recipe);
	}

	/**
	 * edit recipe by normal user
	 */
	@Override
	public void editRecipe(Recipe recipe) {

	}

	/**
	 * display recipe by normal user
	 */
	@Override
	public void displayRecipes() {
		System.out.println(getRecipeList().toString());
	}

}
