package potluck.domain;

import java.util.Scanner;

public class RecipeView {
	public RecipeView() {
		showRecipeMenu();
	}

	private void showRecipeMenu() {
		RecipeView recipeView = new RecipeView();
		System.out.println(
				"Please choose an option:\n 1. add a recipe; 2. edit a recipe; 3 delete a recipe; 4 diplay recipes; 0 quit\n");
		Scanner input = new Scanner(System.in);
		int option = input.nextInt();
		switch (option) {
		case 1:
			addRecipe();
			break;
		case 2:
			addRecipe();
			break;
		case 3:
			deleteRecipe();
			break;
		case 4:

			displayRecipe();
			break;
		case 0:
			break;
		default:

			break;
		}
	}

	public void addRecipe() {
		// TODO Auto-generated method stub

	}

	public void deleteRecipe() {
		// TODO Auto-generated method stub

	}

	public void displayRecipe() {
		// TODO Auto-generated method stub

	}

}
