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
import potluck.domain.RecipeController;
import potluck.domain.Tag;;

public class RecipeControllerTest {
	
	/**
	 * Instance variable to store RecipeController object. 
	 */
	private RecipeController testRc = null;
	
	/**
	 * Crate a RecipeController object called testSt
	 * @throws Exception Throw exception if something goes wrong.
	 */
	@Before
	public void setUp() throws Exception {
		testRc = new RecipeController();
	}

	/**
	 * Destroy the testRc object.
	 * @throws Exception Throw exception if something goes wrong.
	 */
	@After
	public void tearDown() throws Exception {
		testRc = null;
	}
	
	/**
	 * Test default constructor
	 */
	@Test
	public void testRecopeControllerDefault(){
		assertNotNull("The default constructor has an error", testRc);
		assertEquals("Error in default value of id", 10001, testRc.getRecipeId());
		assertNotNull("Error in default value of recipe name", testRc.getRecipeName());
		assertNotNull("Error in default value of date added", testRc.getDateAdded());
		assertNotNull("Error in default value of tag list", testRc.getTagList());
		assertNotNull("Error in default value of category list", testRc.getCategoryList());
		assertNotNull("Error in default value of ingredient list", testRc.getIngredientList());
		assertNotNull("Error in default value of comment list", testRc.getCommentList());			
	}

	/**
	 * Test the getter and setter for recipe id.
	 */
	@Test
	public void testRecipeIdGetSet() {
		final int EXPECTED = 10001;
		testRc.setRecipeId(EXPECTED);
		int obtainedResult = testRc.getRecipeId();
		assertEquals("Either getRecipeId or setRecipeId has an error", EXPECTED, obtainedResult);
	}
	
	/**
	 * Test the getter and setter for recipe name.
	 */
	@Test
	public void testRecipeNameGetSet() {
		final String EXPECTED = "recipe";
		testRc.setRecipeName(EXPECTED);
		String obtainedResult = testRc.getRecipeName();
		assertEquals("Either getRecipeName or setRecipeName has an error", EXPECTED, obtainedResult);
	}
	
	/**
	 * Test the getter and setter for recipe direction.
	 */
	@Test
	public void testRecipeDirectionGetSet() {
		final String EXPECTED = "direction";
		testRc.setDirection(EXPECTED);
		String obtainedResult = testRc.getDirection();
		assertEquals("Either getDirection or setDirection has an error", EXPECTED, obtainedResult);
	}
	
	/**
	 * Test the getter and setter for date added.
	 */
	@Test
	public void testDateAddedGetSet() {
		final Date EXPECTED = new Date();
		testRc.setDateAdded(EXPECTED);
		Date obtainedResult = testRc.getDateAdded();
		assertEquals("Either getDateadded or setDateAdded has an error", EXPECTED, obtainedResult);
	}
	
	/**
	 * Test the getter and setter for tag list.
	 */
	@Test
	public void testTagListGetSet() {
		final Tag EXPECTED = new Tag(1,"Tuna fish");
		testRc.addTag(EXPECTED);
		Tag obtainedResult = testRc.getTagList().get(0);
		assertEquals("Either addTag or getTagList has an error", EXPECTED, obtainedResult);
	}

	/**
	 * Test the getter and setter for Category list.
	 */
	@Test
	public void testCategoryListGetSet() {
		final Category EXPECTED = new Category(1,"breakfast");;
		testRc.addCategory(EXPECTED);
		Category obtainedResult = testRc.getCategoryList().get(0);
		assertEquals("Either addCategory or getCategoryLisg has an error", EXPECTED, obtainedResult);
	}
	
	/**
	 * Test the getter and setter for Category list.
	 */
	@Test
	public void testIngredientListGetSet() {
		final Ingredient EXPECTED = new Ingredient("Name","Measurement");;
		testRc.addIngredient(EXPECTED);
		Ingredient obtainedResult = testRc.getIngredientList().get(0);
		assertEquals("Either addIngredient or getIngredientList has an error", EXPECTED, obtainedResult);
	}
	
	/**
	 * Test the getter and setter for Category list.
	 */
	@Test
	public void testCommentListGetSet() {
		final Comment EXPECTED = new Comment(1, new Date(), 2, "comment");;
		testRc.addComment(EXPECTED);
		Comment obtainedResult = testRc.getCommentList().get(0);
		assertEquals("Either addComment or getCommentList has an error", EXPECTED, obtainedResult);
	}
}
