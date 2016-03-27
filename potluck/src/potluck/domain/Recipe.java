package potluck.domain;

import java.util.ArrayList;
import java.util.Date;

public class Recipe {
	
	/** 
	 * Attribute to get track the value of id 
	 */
	private static int id_counter = 10001;
	
	/** 
	 * Attribute to store recipe Id 
	 */
	private int recipeId;
	
	/** 
	 * Attribute to store recipe name 
	 */
	private String recipeName;
	
	/** 
	 * Attribute to store the recipe direction 
	 */
	private String direction;
	
	/** 
	 * Attribute to store the date of creation 
	 */
	private Date dateAdded;
	
	/** 
	 * Attribute to store the list of tags 
	 */
	private ArrayList<Tag> tagList;
	
	/** 
	 * Attribute to store the list of category 
	 */
	private ArrayList<Category> categoryList;
	
	/** 
	 * Attribute to store the list of ingredient 
	 */
	private ArrayList<Ingredient> ingredientList;
	
	/** 
	 * Attribute to store the list of comment 
	 */
	private ArrayList<Comment> commentList;
	
	/**
	 * Default constructor
	 */
	public Recipe(){
		recipeId=id_counter++;
		recipeName="";
		dateAdded=new Date();
		tagList=new ArrayList<>();
		categoryList=new ArrayList<>();
		ingredientList=new ArrayList<>();
		commentList=new ArrayList<>();
	}
	
	/** 
	 * Mutator for recipe id field
	 * @param recipe id
	 */
	public void setRecipeId(int recipeId){
		this.recipeId=recipeId;
	}
	
	/** 
	 * Mutator for recipe name field
	 * @param recipe name
	 */
	public void setRecipeName(String recipeName){
		this.recipeName=recipeName;
	}
	
	/** 
	 * Mutator for recipe direction field
	 * @param recipe direction
	 */
	public void setDirection(String direction){
		this.direction=direction;
	}
	
	/** 
	 * Mutator for date of creation
	 * @param date of creation
	 */
	public void setDateAdded(Date dateAdded){
		this.dateAdded=dateAdded;
	}
    
	/** 
	 * Mutator for recipe tag list field
	 * @param a single Tag object
	 */
	public void addTag(Tag tag){
		tagList.add(tag);
	}
	
	/** 
	 * Mutator for recipe category list field
	 * @param a single Category object
	 */
	public void addCategory(Category category){
		categoryList.add(category);
	}
	
	/** 
	 * Mutator for recipe ingredient list field
	 * @param a single ingredient object
	 */
	public void addIngredient(Ingredient ingredient){
		ingredientList.add(ingredient);
	}
	
	/** 
	 * Mutator for recipe comment list field
	 * @param a single Comment object
	 */
	public void addComment(Comment comment){
		commentList.add(comment);
	}
	
	/** 
	 * Accessor for recipe id field 
	 * @return value for recipe id
	 */
	public int getRecipeId(){
		return recipeId;
	}
	
	/** 
	 * Accessor for recipe name field 
	 * @return value for recipe name
	 */	
	public String getRecipeName(){
		return recipeName;
	}
	
	/** 
	 * Accessor for recipen direction field 
	 * @return value for recipe direction
	 */
	public String getDirection(){
		return direction;
	}
	
	/** 
	 * Accessor for date of creation field 
	 * @return value for the date of creation
	 */
	public Date getDateAdded(){
		return dateAdded;
	}
	
	/** 
	 * Accessor for tag list field 
	 * @return list of tags 
	 */
	public ArrayList<Tag> getTagList(){
		return tagList;
	}
	
	/** 
	 * Accessor for category list field 
	 * @return list of category 
	 */
	public ArrayList<Category> getCategoryList(){
		return categoryList;
	}
	
	/** 
	 * Accessor for ingredient list field 
	 * @return list of ingredients 
	 */
	public ArrayList<Ingredient> getIngredientList(){
		return ingredientList;
	}
	
	/** 
	 * Accessor for comment list field 
	 * @return list of comments 
	 */
	public ArrayList<Comment> getCommentList(){
		return commentList;
	}
	
	/**
	 *	Converts this class into a meaningful string.
	 *	@return	Formats recipe id, name, direction, date of creation, tags, categories
	 *          ingredients, and comment. 
	 */
	@Override
	public String toString(){
		StringBuffer text = new StringBuffer();
		text.append("Recipe Id: " + recipeId);
		text.append("/nName: " + recipeName);
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