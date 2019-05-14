package nosi.ak.shoppingbackend.dao;


import java.util.List;

import nosi.ak.shoppingbackend.dto.Category;

public interface CategoryDAO {

	
	List<Category> list();
	Category get(int id);
}
