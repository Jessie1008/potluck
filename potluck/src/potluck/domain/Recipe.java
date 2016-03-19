package potluck.domain;

import java.util.ArrayList;
import java.util.Date;

public class Recipe {
	
	private int recipeId;
	private String direction;
	private Date dateAdded;
	private ArrayList<Tag> tagList;
	private ArrayList<Category> categoryList;
	private ArrayList<Ingredient> ingredientList;
	private ArrayList<Comment> commentList;
	
	public Recipe(){
		dateAdded=new Date();
		tagList=new ArrayList<>();
		categoryList=new ArrayList<>();
		ingredientList=new ArrayList<>();
		commentList=new ArrayList<>();
	}
	
	public void setRecipeId(int recipeId){
		this.recipeId=recipeId;
	}
	
	public void setDirection(String direction){
		this.direction=direction;
	}
	
	public void setDateAdded(Date dateAdded){
		this.dateAdded=dateAdded;
	}

	public void addTag(Tag tag){
		tagList.add(tag);
	}
	
	public void addCategory(Category category){
		categoryList.add(category);
	}
	
	public void addIngredient(Ingredient ingredient){
		ingredientList.add(ingredient);
	}
	
	public void addComment(Comment comment){
		commentList.add(comment);
	}
	
	public int getRecipeId(){
		return recipeId;
	}
	
	public String getDirection(){
		return direction;
	}
	
	public Date getDateAdded(){
		return dateAdded;
	}
	
	public ArrayList<Tag> getTagList(){
		return tagList;
	}
	
	public ArrayList<Category> getCategoryList(){
		return categoryList;
	}
	
	public ArrayList<Ingredient> getIngredientList(){
		return ingredientList;
	}
	
	public ArrayList<Comment> getCommentList(){
		return commentList;
	}
	
	@Override
	public String toString(){
		StringBuffer text = new StringBuffer();
		text.append("Recipe Id: " + recipeId);
		text.append("/nDirection: " + direction);
		text.append("/nDate Added: " + dateAdded.toString());
		text.append("/nTag: ");
		for (Tag tag: tagList){
			text.append(tag.toString());
		}
		text.append("/nCategory: ");
		for (Category category: categoryList){
			text.append(category.toString());
		}
		text.append("/nIngredient: ");
		for (Ingredient ingredient: ingredientList){
			text.append("  "+ingredient.toString()+"/n");
		}
		text.append("/nComment: ");
		for (Comment comment: commentList){
			text.append("  "+comment.toString()+"/n");
		}
		return text.toString();
	}
}
