package potluck.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class RecipeView {
	private RecipeController recipeController;
	private ArrayList<Tag> tagList = PotLuckDatabase.getInstance().getTagList();
	private ArrayList<Category> categoryList = PotLuckDatabase.getInstance().getCategoryList();
	Scanner input = new Scanner(System.in);

	public RecipeView() {
		recipeController = new RecipeControllerImpl();

		showRecipeMenu();
	}

	private void showRecipeMenu() {
		System.out.println(
				"Please choose an option:\n 1. add a recipe; 2. edit a recipe; 3. delete a recipe; 4. diplay recipes; 5. displayAllRecipes; 0 quit\n");
		// Scanner input = new Scanner(System.in);
		int option = input.nextInt();
		switch (option) {
		case 1:
			addRecipe();
			break;
		case 2:
			Recipe recipe=new Recipe();
			recipeController.editRecipe(recipe);
			break;
		case 3: 
			recipeController.deleteRecipe();
			break;
		case 4:
			// show only current member's recipes
			recipeController.displayRecipes();
			break;
		case 5:
			// show all recipes of all members
			recipeController.displayAllRecipes();
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
		recipe.setRecipeName(recipeName);
		System.out.println("Please enter your recipe direction: ");
		String recipeDirection = input.nextLine();
		recipe.setDirection(recipeDirection);
		recipe.setDateAdded(new Date());

		int con = 0;
		// add tags to the recipe
		do {
			Tag tag = addTagsToRecipe();
			recipe.getTagList().add(tag);
			System.out.println("Continue selecting recipe tag, enter 0. yes; 1. No");
			con = input.nextInt();
		} while (con != 1);

		// add categories to the recipe
		do {
			Category category = addCategoryToRecipe();
			recipe.getCategoryList().add(category);
			System.out.println("Continue selecting recipe category, enter 0. yes; 1. No");
			con = input.nextInt();
		} while (con != 1);
		// add ingredients to the recipe.

		do {
			Ingredient ingredient = addIngredientToRecipe();
			recipe.getIngredientList().add(ingredient);
			System.out.println("Continue entering recipe ingredient, enter 0. yes; 1. No");
			con = input.nextInt();
		} while (con != 1);

		recipeController.addRecipe(recipe);

	}

	private Ingredient addIngredientToRecipe() {
		Scanner input2 = new Scanner(System.in);
		System.out.println("Please enter your ingredient name: ");
		String ingredientName = input2.nextLine();
		System.out.println("Please enter your ingredient measurement: ");
		String ingredientMeasurement = input2.nextLine();
		Ingredient ingredient = new Ingredient(ingredientName, ingredientMeasurement);
		return ingredient;
	}

	private Category addCategoryToRecipe() {
		System.out.println("Please select your recipe Catagory: ");
		for (int i = 0; i < categoryList.size(); i++) {
			System.out.println((i + 1) + ". " + categoryList.get(i).getCategoryName());
		}
		int categoryIndex = input.nextInt();

		return categoryList.get(categoryIndex - 1);
	}

	private Tag addTagsToRecipe() {
		int con = 0;
		System.out.println("Please select your recipe tag: ");
		for (int i = 0; i < tagList.size(); i++) {
			System.out.println((i + 1) + ". " + tagList.get(i).getTagText());
		}
		int tagIndex = input.nextInt();

		Tag tag = tagList.get(tagIndex - 1);
		return tag;

	}

	

}