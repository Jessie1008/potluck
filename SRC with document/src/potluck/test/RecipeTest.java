package potluck.test;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import potluck.domain.Category;
import potluck.domain.Comment;
import potluck.domain.Ingredient;
import potluck.domain.Recipe;
import potluck.domain.Tag;
/**
 * Test of a recipe class.
 * 
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @version 1.0.0 Date March 26, 2016
 * @since 1.8.0_73
 * 
 * @see org.junit.Assert.*;
 * @see java.util.ArrayList;
 * @see java.util.Date;
 * @see org.junit.After;
 * @see org.junit.Before;
 * @see org.junit.Test;
 * @see potluck.domain.Category;
 * @see potluck.domain.Comment;
 * @see potluck.domain.Ingredient;
 * @see potluck.domain.Recipe;
 * @see potluck.domain.Tag;
 */
public class RecipeTest {
	
	/**
	 * Instance variable to store RecipeController object. 
	 */
	private Recipe test = null;
	
	/**
	 * Crate a RecipeController object called testSt
	 * @throws Exception Throw exception if something goes wrong.
	 */
	@Before
	public void setUp() throws Exception {
		test = new Recipe();
	}

	/**
	 * Destroy the testRc object.
	 * @throws Exception Throw exception if something goes wrong.
	 */
	@After
	public void tearDown() throws Exception {
		test = null;
	}
	
	/**
	 * Test default constructor
	 */
	@Test
	public void testRecipeDefault(){
		assertNotNull("The default constructor has an error", test);
		assertNotNull("Error in default value of recipe name", test.getRecipeName());
		assertNotNull("Error in default value of date added", test.getDateAdded());
		assertNotNull("Error in default value of tag list", test.getTagList());
		assertNotNull("Error in default value of category list", test.getCategoryList());
		assertNotNull("Error in default value of ingredient list", test.getIngredientList());
		assertNotNull("Error in default value of comment list", test.getCommentList());			
	}

	/**
	 * Test the getter and setter for recipe id.
	 */
	@Test
	public void testRecipeIdGetSet() {
		final int EXPECTED = 10001;
		test.setRecipeId(EXPECTED);
		int obtainedResult = test.getRecipeId();
		assertEquals("Either getRecipeId or setRecipeId has an error", EXPECTED, obtainedResult);
	}
	
	/**
	 * Test the getter and setter for recipe name.
	 */
	@Test
	public void testRecipeNameGetSet() {
		final String EXPECTED = "recipe";
		test.setRecipeName(EXPECTED);
		String obtainedResult = test.getRecipeName();
		assertEquals("Either getRecipeName or setRecipeName has an error", EXPECTED, obtainedResult);
	}
	
	/**
	 * Test the getter and setter for recipe direction.
	 */
	@Test
	public void testRecipeDirectionGetSet() {
		final String EXPECTED = "direction";
		test.setDirection(EXPECTED);
		String obtainedResult = test.getDirection();
		assertEquals("Either getDirection or setDirection has an error", EXPECTED, obtainedResult);
	}
	
	/**
	 * Test the getter and setter for date added.
	 */
	@Test
	public void testDateAddedGetSet() {
		final Date EXPECTED = new Date();
		test.setDateAdded(EXPECTED);
		Date obtainedResult = test.getDateAdded();
		assertEquals("Either getDateadded or setDateAdded has an error", EXPECTED, obtainedResult);
	}
	
	/**
	 * Test the getter and setter for tag list.
	 */
	@Test
	public void testTagListGetSet() {
		final Tag EXPECTED = new Tag(1,"Tuna fish");
		test.addTag(EXPECTED);
		Tag obtainedResult = test.getTagList().get(0);
		assertEquals("Either addTag or getTagList has an error", EXPECTED, obtainedResult);
	}

	/**
	 * Test the getter and setter for Category list.
	 */
	@Test
	public void testCategoryListGetSet() {
		final Category EXPECTED = new Category(1,"breakfast");;
		test.addCategory(EXPECTED);
		Category obtainedResult = test.getCategoryList().get(0);
		assertEquals("Either addCategory or getCategoryLisg has an error", EXPECTED, obtainedResult);
	}
	
	/**
	 * Test the getter and setter for Category list.
	 */
	@Test
	public void testIngredientListGetSet() {
		final Ingredient EXPECTED = new Ingredient("Name","Measurement");;
		test.addIngredient(EXPECTED);
		Ingredient obtainedResult = test.getIngredientList().get(0);
		assertEquals("Either addIngredient or getIngredientList has an error", EXPECTED, obtainedResult);
	}
	
	/**
	 * Test the getter and setter for Category list.
	 */
	@Test
	public void testCommentListGetSet() {
		final Comment EXPECTED = new Comment(1, new Date(), 2, "comment");;
		test.addComment(EXPECTED);
		Comment obtainedResult = test.getCommentList().get(0);
		assertEquals("Either addComment or getCommentList has an error", EXPECTED, obtainedResult);
	}
}
