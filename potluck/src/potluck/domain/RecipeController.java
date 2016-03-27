package potluck.domain;

import java.util.ArrayList;
import java.util.Date;

public class RecipeController implements RecipeControllerInterface {
	
	private Recipe model;
	
	public RecipeController(){
		model = new Recipe();
	}
	public void setRecipeId(int recipeId){
		model.setRecipeId(recipeId);
	}
	
	public void setRecipeName(String recipeName){
		model.setDirection(recipeName);
	}
	
	public void setDirection(String direction){
		model.setDirection(direction);
	}
	
	public void setDateAdded(Date dateAdded){
		model.setDateAdded(dateAdded);
	}

	public void addTag(Tag tag){
		model.addTag(tag);
	}
	
	public void addCategory(Category category){
		model.addCategory(category);
	}
	
	public void addIngredient(Ingredient ingredient){
		model.addIngredient(ingredient);
	}
	
	public void addComment(Comment comment){
		model.addComment(comment);
	}
	
	public int getRecipeId(){
		return model.getRecipeId();
	}
	
	public String getRecipeName() {
		return model.getRecipeName();
	}
	
	public String getDirection(){
		return model.getDirection();
	}
	
	public Date getDateAdded(){
		return model.getDateAdded();
	}
	
	public ArrayList<Tag> getTagList(){
		return model.getTagList();
	}
	
	public ArrayList<Category> getCategoryList(){
		return model.getCategoryList();
	}
	
	public ArrayList<Ingredient> getIngredientList(){
		return model.getIngredientList();
	}
	
	public ArrayList<Comment> getCommentList(){
		return model.getCommentList();
	}
	
	@Override
	public String toString(){
		
		return model.toString();
	}
	
}
