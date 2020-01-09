package inatel.eribox.test.service.impl;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inatel.eribox.test.dao.ProductDAO;
import inatel.eribox.test.entity.Product;
import inatel.eribox.test.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDAO productDAO;
	
	public void save(Product product) {
		productDAO.save(product);
	}

	@Transactional
	public Product findById(int id) {
		return productDAO.findById(id);
	}

	@Transactional
	public void remove(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public List<Product> findAll() {
		List<Product> l = productDAO.find();
		return l;
	}

	@Override
	public void update(Product product) {
		productDAO.update(product);
		
	}
	
	
}