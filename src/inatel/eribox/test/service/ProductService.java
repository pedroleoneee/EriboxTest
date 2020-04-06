package inatel.eribox.test.service;

import java.util.List;

import inatel.eribox.test.entity.Product;

public interface ProductService {

	public void saveProduct(Product product);
	public List<Product> findAll();
	public Product findById();
	public Product updateProduct(Product product);
	public void deleteById(Integer integer);
}
