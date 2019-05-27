package nosi.ak.shoppingbackend.dao;

import java.util.List;

public interface ProductDAO {

	ProductDAO get(int productId);
	List<ProductDAO> list();	
	boolean add(ProductDAO product);
	boolean update(ProductDAO product);
	boolean delete(ProductDAO product);

	List<ProductDAO> getProductsByParam(String param, int count);	
	
	
	// business methods
	List<ProductDAO> listActiveProducts();	
	List<ProductDAO> listActiveProductsByCategory(int categoryId);
	List<ProductDAO> getLatestActiveProducts(int count);
	
}
