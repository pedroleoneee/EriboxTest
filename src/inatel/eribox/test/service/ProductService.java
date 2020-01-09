package inatel.eribox.test.service;

import java.util.List;

import inatel.eribox.test.entity.Product;

public interface ProductService {
	public abstract void save(Product product);
	
	public Product findById(int id);
	
	public abstract List<Product> findAll();
	
	public abstract void remove(Product product);
	
	public abstract void update(Product product);
}
