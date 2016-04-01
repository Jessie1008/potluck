package potluck.domain;


import java.util.ArrayList;
/**
 * Implementation of RecipeController interface
 * Allows member to perform desire functions on recipe adding ingredients of a recipe.
 * 
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @version 1.0.0 Date March 26, 2016
 * @since 1.8.0_73
 * 
 * @see java.util.ArrayList
 */
public class RecipeControllerImpl implements RecipeController {
	/** 
	 * Reference to instance of Member
	 */
	Member member = null;

	/**
	 * Default constructor.
	 * @param member
	 * 			the reference value of Member
	 */
	public RecipeControllerImpl(Member member) {
		this.member = member;
	}

	/**
	 * add a recipe to the list of the member
	 * @param recipe
	 * A Recipe object
	 */
	@Override
	public void addRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		member.addRecipe(recipe);
	}
	
	/**
	 * show all the recipes created by the member
	 */
	@Override
	public void displayRecipes() {
		member.displayRecipes();

	}

	/**
	 * show all the recipes in the database
	 */
	@Override
	public void displayAllRecipes() {
		ArrayList<Member> members = PotLuckDatabase.getInstance().getMemberList();
		for (int i = 0; i < members.size(); i++) {
			members.get(i).displayRecipes();
		}
	}

	/**
	 * delete a recipes
	 */
	@Override
	public void deleteRecipe() {
		// TODO Auto-generated method stub

	}

	/**
	 * edit a recipes
	 * @param recipe
	 * A Recipe object
	 */
	@Override
	public void editRecipe(Recipe recipe) {
		// TODO Auto-generated method stub

	}

}
