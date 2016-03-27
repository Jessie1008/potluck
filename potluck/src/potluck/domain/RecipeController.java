package potluck.domain;

import java.util.ArrayList;
import java.util.Date;

public class RecipeController implements RecipeControllerInterface {
	/**
	 * Reference to instance of recipe
	 */
	private Recipe model;

	/**
	 * Default constructor
	 */	
	public RecipeController(){
		model = new Recipe();
	}
	
	/** 
	 * Mutator for recipe id field
	 * @param recipe id
	 */
	public void setRecipeId(int recipeId){
		model.setRecipeId(recipeId);
	}
	
	/** 
	 * Mutator for recipe name field
	 * @param recipe name
	 */
	public void setRecipeName(String recipeName){
		model.setRecipeName(recipeName);
	}
	
	/** 
	 * Mutator for recipe direction field
	 * @param recipe direction
	 */	
	public void setDirection(String direction){
		model.setDirection(direction);
	}
	
	/** 
	 * Mutator for date of creation
	 * @param date of creation
	 */	
	public void setDateAdded(Date dateAdded){
		model.setDateAdded(dateAdded);
	}
    
	/** 
	 * Mutator for recipe tag list field
	 * @param a single Tag object
	 */
	public void addTag(Tag tag){
		model.addTag(tag);
	}
	
	/** 
	 * Mutator for recipe category list field
	 * @param a single Category object
	 */
	public void addCategory(Category category){
		model.addCategory(category);
	}
	
	/** 
	 * Mutator for recipe ingredient list field
	 * @param a single ingredient object
	 */	
	public void addIngredient(Ingredient ingredient){
		model.addIngredient(ingredient);
	}
	
	/** 
	 * Mutator for recipe comment list field
	 * @param a single Comment object
	 */
	public void addComment(Comment comment){
		model.addComment(comment);
	}
	
	/** 
	 * Accessor for recipe id field 
	 * @return value for recipe id
	 */	
	public int getRecipeId(){
		return model.getRecipeId();
	}
	
	/** 
	 * Accessor for recipe name field 
	 * @return value for recipe name
	 */	
	public String getRecipeName() {
		return model.getRecipeName();
	}
	
	/** 
	 * Accessor for recipen direction field 
	 * @return value for recipe direction
	 */
	
	public String getDirection(){
		return model.getDirection();
	}
	
	/** 
	 * Accessor for date of creation field 
	 * @return value for the date of creation
	 */
	public Date getDateAdded(){
		return model.getDateAdded();
	}
	
	/** 
	 * Accessor for tag list field 
	 * @return list of tags 
	 */
	public ArrayList<Tag> getTagList(){
		return model.getTagList();
	}
	
	/** 
	 * Accessor for category list field 
	 * @return list of category 
	 */
	public ArrayList<Category> getCategoryList(){
		return model.getCategoryList();
	}
	
	/** 
	 * Accessor for ingredient list field 
	 * @return list of ingredients 
	 */
	public ArrayList<Ingredient> getIngredientList(){
		return model.getIngredientList();
	}
	
	/** 
	 * Accessor for comment list field 
	 * @return list of comments 
	 */
	public ArrayList<Comment> getCommentList(){
		return model.getCommentList();
	}
	
	/**
	 *	Converts this class into a meaningful string.
	 *	@return	Formats recipe id, name, direction, date of creation, tags, categories
	 *          ingredients, and comment. 
	 */
	@Override
	public String toString(){
		return model.toString();
	}
	
}
