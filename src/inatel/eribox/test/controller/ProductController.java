package inatel.eribox.test.controller;

import java.io.Serializable;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import inatel.eribox.test.entity.Product;
import inatel.eribox.test.service.ProductService;

@Scope("view")
@ManagedBean(name = "mbProductController")
public class ProductController implements Serializable {

	@Autowired
	private ProductService productService;
	
	private List<Product> listProducts;
	private Product product;
	
	private static final long serialVersionUID = 1L;
	
	@PostConstruct
	private void main() {
		try {
			product = new Product();
			listProducts = productService.findAll();

		} catch (Exception e) {
			System.out.println("My error->" + e);
		}

	}

	public void btUpdate() {
		productService.updateProduct(product);
	}

	public void btSave() {
		productService.saveProduct(product);
	}

	public void btDelete() {
		productService.deleteById(product.getId());
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Product> getListProducts() {
		return listProducts;
	}

	public void setListProducts(List<Product> listProducts) {
		this.listProducts = listProducts;
	}

}
