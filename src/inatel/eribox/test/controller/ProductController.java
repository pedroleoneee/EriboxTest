package inatel.eribox.test.controller;

import java.io.Serializable;
import java.util.ArrayList;
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

			listProducts = new ArrayList<Product>();

			Product product1 = new Product();
			product1.setId(1);
			product1.setName("T-shirt");
			product1.setCode("TS1234M44");
			product1.setPrice(20.25);
			product1.setImage("camisa");
			listProducts.add(product1);

			Product product2 = new Product();
			product2.setId(2);
			product2.setName("Calça");
			product2.setCode("CA1234P38");
			product2.setPrice(40.44);
			product2.setImage("calça");
			listProducts.add(product2);

			Product product3 = new Product();
			product3.setId(3);
			product3.setName("Blusa Azul");
			product3.setCode("BL1234M42");
			product3.setPrice(70.00);
			product3.setImage("blusa");
			listProducts.add(product3);

			// listProducts = productService.findAll();

		} catch (Exception e) {
			System.out.println("My error->" + e);
		}

	}

	public void btUpdate() {
		System.out.println("Atulizar produto: " + product);
//		productService.updateProduct(product);
	}

	public void btSave() {
		System.out.println("Salvar produto: " + product);
//		productService.saveProduct(product);
	}

	public void btDelete() {
		System.out.println("Deletar produto: " + product);
//		productService.deleteById(product.getId());
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
