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
		context.scan("nosi.ak.shoppingend");
		context.refresh();	
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		
	}
	
	@Test
	public void testAddCategory() {
		
		category = new Category();
	
		
		category.setName("Radio");
		category.setDescription("This is a CD and USB player radio");
		category.setImagURL("CAT_1.png");
		
		
		assertEquals("Successfully added a category inside the table",true,categoryDAO.add(category));
	
	
	} 
	
	
	
	
}
