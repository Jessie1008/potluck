package potluck.domain;


import java.util.ArrayList;
import java.util.Date;
/**
 * Implementation of the recipe.
 * 
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @version 1.0.0 Date March 26, 2016
 * @since 1.8.0_73
 * 
 * @see java.util.ArrayList
 * @see java.util.Date
 */
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
	 * @param recipeId
	 * Integer value of recipe id
	 */
	public void setRecipeId(int recipeId){
		this.recipeId=recipeId;
	}
	
	/** 
	 * Mutator for recipe name field
	 * @param recipeName
	 * String of recipe name
	 */
	public void setRecipeName(String recipeName){
		this.recipeName=recipeName;
	}
	
	/** 
	 * Mutator for recipe direction field
	 * @param direction
	 * String of recipe direction
	 */
	public void setDirection(String direction){
		this.direction=direction;
	}
	
	/** 
	 * Mutator for date of creation
	 * @param dateAdded
	 * Date of creation
	 */
	public void setDateAdded(Date dateAdded){
		this.dateAdded=dateAdded;
	}
    
	/** 
	 * Mutator for recipe tag list field
	 * @param tag
	 * A single Tag object
	 */
	public void addTag(Tag tag){
		tagList.add(tag);
	}
	
	/** 
	 * Mutator for recipe category list field
	 * @param category
	 * A single Category object
	 */
	public void addCategory(Category category){
		categoryList.add(category);
	}
	
	/** 
	 * Mutator for recipe ingredient list field
	 * @param ingredient
	 * A single ingredient object
	 */
	public void addIngredient(Ingredient ingredient){
		ingredientList.add(ingredient);
	}
	
	/** 
	 * Mutator for recipe comment list field
	 * @param comment
	 * A single Comment object
	 */
	public void addComment(Comment comment){
		commentList.add(comment);
	}
	
	/** 
	 * Accessor for recipe id field 
	 * @return recipeId
	 * Integer value for recipe id
	 */
	public int getRecipeId(){
		return recipeId;
	}
	
	/** 
	 * Accessor for recipe name field 
	 * @return recipeName
	 * String of recipe name
	 */	
	public String getRecipeName(){
		return recipeName;
	}
	
	/** 
	 * Accessor for recipe direction field 
	 * @return direction
	 * String of recipe direction
	 */
	public String getDirection(){
		return direction;
	}
	
	/** 
	 * Accessor for date of creation field 
	 * @return dateAdded
	 * The date of creation
	 */
	public Date getDateAdded(){
		return dateAdded;
	}
	
	/** 
	 * Accessor for tag list field 
	 * @return tagList
	 * ArrayList of tags 
	 */
	public ArrayList<Tag> getTagList(){
		return tagList;
	}
	
	/** 
	 * Accessor for category list field 
	 * @return categoryList
	 * ArrayList of category 
	 */
	public ArrayList<Category> getCategoryList(){
		return categoryList;
	}
	
	/** 
	 * Accessor for ingredient list field 
	 * @return ingredientList
	 * ArrayList of ingredients 
	 */
	public ArrayList<Ingredient> getIngredientList(){
		return ingredientList;
	}
	
	/** 
	 * Accessor for comment list field 
	 * @return commentList
	 * ArrayList of comments 
	 */
	public ArrayList<Comment> getCommentList(){
		return commentList;
	}
	
	/**
	 *	Converts this class into a meaningful string.
	 *	@return Formats integer of recipe id, string of name, string direction, date of creation, 
	 *	tags, categories, ingredients, and comment. 
	 */
	@Override
	public String toString(){
		StringBuffer text = new StringBuffer();
		text.append("Recipe Id: " + recipeId);
		text.append("\nName: " + recipeName);
		text.append("\nDirection: " + direction);
		text.append("\nDate Added: " + dateAdded.toString());
		text.append("\nTag: ");
		for (Tag tag: tagList){
			text.append(tag.toString());
		}
		text.append("\nCategory: ");
		for (Category category: categoryList){
			text.append(category.toString());
		}
		text.append("\nIngredient: ");
		for (Ingredient ingredient: ingredientList){
			text.append("  "+ingredient.toString()+"\n");
		}
		text.append("\nComment: ");
		for (Comment comment: commentList){
			text.append("  "+comment.toString()+"\n");
		}
		return text.toString();
	}
}