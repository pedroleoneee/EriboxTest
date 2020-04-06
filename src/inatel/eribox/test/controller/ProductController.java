package inatel.eribox.test.controller;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import inatel.eribox.test.dao.ProductDAO;
import inatel.eribox.test.entity.Product;

@Scope("view")
@ManagedBean(name="mbProductController")
public class ProductController implements Serializable{
	
	private List<Product> listProducts;
	private Product product;
	
	
	@PostConstruct
    private void main() {

//		try {
//			listProducts = ProductDAO.listAllProducts();
//		} catch (SQLException e) {
//		    JSFUtil.addMsgFatal("ERRO AO LISTAR CARONAS -> " + e);
//		}

	
	}
	


	public void btUpdate() {
        System.out.println("Atualizar");
    }
    
    public void btSave() {
        System.out.println("Salvar");
    }
    
    public void btDelete() {
        System.out.println("Delete");
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
