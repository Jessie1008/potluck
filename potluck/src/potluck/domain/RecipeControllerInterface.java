package potluck.domain;

import java.util.ArrayList;
import java.util.Date;

public interface RecipeControllerInterface {
	public void setRecipeId(int recipeId);
	public void setDirection(String direction);
	public void setDataAdded(Date dateAddded);
	public void addTag(Tag tag);
	public void addCategory(Category category);
	public void addIngredient(Ingredient ingredient);
	public void addComment(Comment comment);
	public int getRecipe();
	public String getDirection();
	public Date getDateAdded();
	public ArrayList<Tag> getTagList();
	public ArrayList<Category> getCategoryList();
	public ArrayList<Ingredient> getIngredientList();
	public ArrayList<Comment> getCommentList();
	

}
