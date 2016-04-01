package potluck.domain;


import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
/**
 * Implementation of creating a recipe.
 * 
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @version 1.0.0 Date March 26, 2016
 * @since 1.8.0_73
 * 
 * @see java.util.ArrayList
 * @see java.util.Date
 * @see java.util.Scanner
 */
public class RecipeView {
	/** 
	 * Reference to instance of RecipeController
	 */
	private RecipeController recipeController;
	
	/** 
	 * Attribute to store the list of tags 
	 */
	private ArrayList<Tag> tagList = PotLuckDatabase.getInstance().getTagList();
	
	/** 
	 * Attribute to store the list of category 
	 */
	private ArrayList<Category> categoryList = PotLuckDatabase.getInstance().getCategoryList();
	Scanner input = new Scanner(System.in);

	/**
	 * Default constructor.
	 */
	public RecipeView() {
		recipeController = new RecipeControllerImpl(PotLuckDatabase.getInstance().getCurrentMember());

		showRecipeMenu();
	}
	
	/**
	 * Allows users to choose the function which they wish to perform 
	 */
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

	/**
	 * To create a recipe
	 */
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
			System.out.println("Continue selecting recipe tag, enter 1. yes; 0. No");
			con = input.nextInt();
		} while (con != 0);

		// add categories to the recipe
		do {
			Category category = addCategoryToRecipe();
			recipe.getCategoryList().add(category);
			System.out.println("Continue selecting recipe category, enter 1. yes; 0. No");
			con = input.nextInt();
		} while (con != 0);
		// add ingredients to the recipe.

		do {
			Ingredient ingredient = addIngredientToRecipe();
			recipe.getIngredientList().add(ingredient);
			System.out.println("Continue entering recipe ingredient, enter 1. yes; 0. No");
			con = input.nextInt();
		} while (con != 0);

		recipeController.addRecipe(recipe);

	}

	/**
	 * To create a ingredient in a recipe
	 * @return ingredient
	 * A Ingredient object
	 */
	private Ingredient addIngredientToRecipe() {
		Scanner input2 = new Scanner(System.in);
		System.out.println("Please enter your ingredient name: ");
		String ingredientName = input2.nextLine();
		System.out.println("Please enter your ingredient measurement: ");
		String ingredientMeasurement = input2.nextLine();
		Ingredient ingredient = new Ingredient(ingredientName, ingredientMeasurement);
		return ingredient;
	}

	/**
	 * Allows users to choose the categories for a recipe 
	 * @return category
	 * A Category object
	 */
	private Category addCategoryToRecipe() {
		System.out.println("Please select your recipe Catagory: ");
		for (int i = 0; i < categoryList.size(); i++) {
			System.out.println((i + 1) + ". " + categoryList.get(i).getCategoryName());
		}
		int categoryIndex = input.nextInt();

		return categoryList.get(categoryIndex - 1);
	}

	/**
	 * Allows users to choose the tags for a recipe 
	 * @return tag
	 * A Tag object
	 */
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