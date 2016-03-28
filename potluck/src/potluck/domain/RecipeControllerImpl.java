package potluck.domain;

import java.util.ArrayList;

public class RecipeControllerImpl implements RecipeController {
	Member member = null;

	public RecipeControllerImpl() {
		member = PotLuckDatabase.getInstance().getCurrentMember();
	}

	@Override
	public void addRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		member.addRecipe(recipe);
	}

	@Override
	public void displayRecipes() {
		member.displayRecipes();

	}

	@Override
	public void displayAllRecipes() {
		ArrayList<Member> members = PotLuckDatabase.getInstance().getMemberList();
		for (int i = 0; i < members.size(); i++) {
			members.get(i).displayRecipes();
		}
	}

	@Override
	public void deleteRecipe() {
		// TODO Auto-generated method stub

	}

	@Override
	public void editRecipe(Recipe recipe) {
		// TODO Auto-generated method stub

	}

}
