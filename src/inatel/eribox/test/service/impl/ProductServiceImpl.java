package inatel.eribox.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import inatel.eribox.test.dao.ProductDAO;
import inatel.eribox.test.entity.Product;
import inatel.eribox.test.service.ProductService;

public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDAO;

	@Override
	public Product findById() {
		// product
		return null;
	}

	@Override
	public List<Product> findAll() {
		// lista todos produtos
		return null;
	}

	@Override
	public Product updateProduct(Product product) {
		// Atualiza todos produtos
		return null;
	}

	@Override
	public void saveProduct(Product product) {
		productDAO.saveProduct(product);

	}

	@Override
	public void deleteById(Integer integer) {
		// Deleta produto por ID

	}

}