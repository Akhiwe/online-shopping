package nosi.ak.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import nosi.ak.shoppingbackend.dao.CategoryDAO;
import nosi.ak.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	
	private Category category;
	
	
	
	@BeforeClass
	public static void init() {	
		context = new AnnotationConfigApplicationContext();
		context.scan("nosi.ak.shoppingbackend");
		context.refresh();	
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		
	}
	
	/*@Test
	public void testAddCategory() {
		
		category = new Category();
	
		
		category.setName("Radio");
		category.setDescription("This is a CD and USB player radio");
		category.setImagURL("CAT_1.png");
		
		
		assertEquals("Successfully added a category inside the table", true, categoryDAO.add(category));
 	
	
	} 
	*/
	
/*	@Test
	public void testGetCategory() {
		
		category = categoryDAO.get(3);
		
		category.setName("RadioS");
		
		assertEquals("Successfully  updated category inside the table", true, categoryDAO.update(category));
	}
	*/
	
	/*@Test
	public void testDeleteCategory() {
		
		category = categoryDAO.get(3);
		assertEquals("Successfully  deleted a single category inside the table", true, categoryDAO.delete(category));
	}
	*/

	/*@Test
	public void testListCategory() {
		
		assertEquals("Successfully successfully fetched the list of categories from the table",3, categoryDAO.list().size());
	}
	*/

	
		@Test
		public void testCRUDCategory() {
		
			
			category = new Category();
			
			
			category.setName("Radio");
			category.setDescription("This is a CD and USB player radio");
			category.setImagURL("CAT_1.png");
			
			
			assertEquals("Successfully added a category inside the table", true, categoryDAO.add(category));
	 	
		
			category = new Category();
			
			category.setName("Television");
			category.setDescription("This is some description for television!");
			category.setImagURL("CAT_2.png");
			
			assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));

		
			//fetching and updating
			category = categoryDAO.get(2);
			
			category.setName("RadioS");
			
			assertEquals("Successfully  updated category inside the table", true, categoryDAO.update(category));
		
			
			//delete the category
			assertEquals("Successfully  deleted a single category inside the table", true, categoryDAO.delete(category));
			
			
			//fetching the list
			assertEquals("Successfully successfully fetched the list of categories from the table",3, categoryDAO.list().size());
		}



}

