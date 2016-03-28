package potluck.domain;

import java.util.ArrayList;
import java.util.Date;

public interface RecipeController  {
	public void addRecipe(Recipe recipe);

	public void displayRecipes();

	public void displayAllRecipes();

	public void deleteRecipe();

	public void editRecipe(Recipe recipe);
	
	
}
