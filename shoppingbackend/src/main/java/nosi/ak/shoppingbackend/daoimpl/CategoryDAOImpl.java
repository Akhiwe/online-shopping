package nosi.ak.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import nosi.ak.shoppingbackend.dao.CategoryDAO;
import nosi.ak.shoppingbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	
	static {
		
		Category category = new Category();
		
		// adding first category
		category.setId(1);
		category.setName("Radio");
		category.setDescription("This is a CD and USB player radio");
		category.setImagURL("CAT_1.png");
		
		
		categories.add(category);
		
		//second category
		category = new Category();
		
		// adding first category
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is a a mobile cellphone with 2 simcard slots");
		category.setImagURL("CAT_2.png");
		
		
		categories.add(category);
		
		//third category
		category = new Category();
		
		// adding first category
		category.setId(3);
		category.setName("Blacket");
		category.setDescription("This is a small fleece blanket");
		category.setImagURL("CAT_3.png");
		
		
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		
		// enhanced for loop
		for(Category category : categories) {
			
			if(category.getId() == id) return category;
		}
	
		return null;
	}

}
