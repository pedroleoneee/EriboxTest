package inatel.eribox.test.controller;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.service.spi.InjectService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.sun.faces.action.RequestMapping;
import inatel.eribox.test.entity.Product;
import inatel.eribox.test.service.ProductService;

@RequestMapping("/products")
@Scope("view")
public class ProductController implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Product productSelected;
	
	private ProductService ps;
	@RequestMapping(value="{productId}")
	public @ResponseBody Product getProductJson(@PathVariable("productId") int productId) {
 
		return this.ps.findById(productId);
	}
	
	/*---------------------------------------------------------------------------------------------------------*/
	
	@RequestMapping(value = "")
	public String listaProdutos(Product product, BindingResult result,
			Map<String, Object> model) {
		
		try {
			List<Product> results = ps.findAll();
			
			model.put("selections", results);
			return "product/productsList";
		} catch (Exception e) {
			//Mensagem com erro
			return "product/productsList";
		}
		
	}
	
	/*---------------------------------------------------------------------------------------------------------*/
	
	@RequestMapping(value = "")
	public @ResponseBody Product atualizarProduct(@RequestBody Product product, BindingResult result, SessionStatus status){		
		
		System.out.println("Chamou Atualizar " + product.getId() );
			
		if (result.hasErrors()) {
			//Enviar erros
			return product;
		}else{
			this.ps.update(product);
			//status.setComplete();
			return product;
		}
	
	}
	
	/*---------------------------------------------------------------------------------------------------------*/
	
	@RequestMapping(value = "")
	public @ResponseBody Product adicionarProduto(@RequestBody Product product,
			BindingResult result, SessionStatus status) {		
		
		if (result.hasErrors()) {
			/*incluir erros*/
			return product;
		} else {
			this.ps.save(product);
			System.out.println("\n\n\n"+product.getId());
			status.setComplete();
			return product;
		}
	}
	
	/*---------------------------------------------------------------------------------------------------------*/
	
	@RequestMapping(value = "/{contatoId}")
	public @ResponseBody String deletarProduto(@PathVariable("productId") int productId) {
		Product product = this.ps.findById(productId);
		
		if (product == null) {
			/*incluir erros*/
			return "erro";
		} else {
			this.ps.remove(product);
			return "ok";
		}
	}	
	
	/*---------------------------------------------------------------------------------------------------------*/
	

	@RequestMapping("/contatos/{contatoId}")
	public ModelAndView detalharProduto(@PathVariable("productId") int productId) {
		ModelAndView mav = new ModelAndView("/product/productDetails");
		System.out.println("Entrou no método 2, id:" +productId );
		mav.addObject(this.ps.findById(productId));
		return mav;
	}

	public Product getProductSelected() {
		return productSelected;
	}

	public void setProductSelected(Product productSelected) {
		this.productSelected = productSelected;
	}

	public ProductService getPs() {
		return ps;
	}

	public void setPs(ProductService ps) {
		this.ps = ps;
	}
	
	

}
