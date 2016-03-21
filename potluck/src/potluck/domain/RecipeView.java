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
		Recipe recipe = new Recipe();
		System.out.println("Please enter your recipe name: ");
		Scanner input = new Scanner(System.in);
		String recipeName = input.nextLine();
		System.out.println("Please enter your recipe direction: ");
		String recipeDirection = input.nextLine();
		System.out.println("Please select your recipe tag: ");
		for(int i = 1; i <= potLuckDatabase.getInstance().getTagList().size(); i++){
			System.out.println(i+" "+potLuckDatabase.getInstance().getTagList().get(i));
		}
		int tagIndex = input.nextInt();
		System.out.println("Please select your recipe Catagory: ");
		for(int i = 1; i <= potLuckDatabase.getInstance().getTagList().size(); i++){
			System.out.println(i+" "+potLuckDatabase.getInstance().getCategoryList().get(i));
		}
		int catagoryIndex = input.nextInt();
		System.out.println("Please enter your ingredient name: ");
		String ingredientName = input.nextLine();
		System.out.println("Please enter your ingredient measurement: ");
		String ingredientMeasurement = input.nextLine();
		Ingredient ingredient = new Ingredient(ingredientName, ingredientMeasurement);
		recipe.setRecipeName(recipeName);
		recipe.setDirection(recipeDirection);
		recipe.addTag(potLuckDatabase.getInstance().getTagList().get(tagIndex));
		recipe.addCategory(potLuckDatabase.getInstance().getCategoryList().get(catagoryIndex));
		recipe.addIngredient(ingredient);

	}

	public void deleteRecipe() {
		// TODO Auto-generated method stub

	}

	public void displayRecipe() {
		// TODO Auto-generated method stub

	}

}
