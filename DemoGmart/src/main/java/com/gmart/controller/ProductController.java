package com.gmart.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.gmart.dao.CategoryDao;
import com.gmart.dao.ProductDao;
import com.gmart.model.Category;
import com.gmart.model.Product;

@Controller
public class ProductController {
	@Autowired
	CategoryDao categoryDao;
	@Autowired
	ProductDao productDao;

	@RequestMapping("/products")
	public String Categories(Model m) {
		List<Product> products = productDao.listProducts();
		m.addAttribute("product", products);
		return "products";
	}

	@RequestMapping("/addProduct")
	public String showProducts(Model m) {
		
		m.addAttribute("categorylist", this.getCategories());
		return "addProduct";
	}

	@PostMapping(value = "/handleProduct")
	public String handleCategory(@ModelAttribute("product") Product product,
			@RequestParam("pimage") MultipartFile mfile, Model m) throws IOException {
		
		productDao.addProduct(product);
		Product product1 = new Product();

		m.addAttribute("categorylist", this.getCategories());
		String imagePath = "E:\\DemoGMart\\src\\main\\webapp\\WEB-INF\\resources\\images\\";
		imagePath = imagePath + String.valueOf(product.getProductId() + ".jpg");

		File image = new File(imagePath);
		FileOutputStream fos = null;
		BufferedOutputStream bs =null;
		if (!mfile.isEmpty()) {
			try 
			{
				byte buff[] = mfile.getBytes();
				fos = new FileOutputStream(image);
				 bs = new BufferedOutputStream(fos);
				bs.write(buff);
				
			} catch (Exception e) {
				m.addAttribute("errorInfo", "Exception occured during the Image Uploading" + e.getMessage());
			}
			finally
			{
				bs.close();
				fos.close();
			}
		} else {
			m.addAttribute("errorInfo", "Problem occured during the Image Uploading");
		}
		
		List<Product> listProducts = productDao.listProducts();
		m.addAttribute("productList", listProducts);
		return "addProduct";
	}

	@RequestMapping("/updatep/{productId}")
	public String updateForm(@PathVariable("productId") int productId, Model model) {
		
		Product cat = productDao.getProduct(productId);

		model.addAttribute("prod", cat);
		return "updateProduct";
	}

	@PostMapping(value = "updatep/updateProduct/{productId}")
	public RedirectView updateProduct(@PathVariable("productId") int productId,
			@RequestParam("productDesc") String productDesc, @RequestParam("productName") String productName,
			@RequestParam("price") float price, @RequestParam("productCategory") String productCategory, Model m,
			HttpServletRequest request) {
		Product p = productDao.getProduct(productId);
		p.setProductName(productName);
		p.setProductDesc(productDesc);
		p.setPrice(price);
		p.setProductCategory(productCategory);

		productDao.updateProduct(p);

		Product product1 = new Product();
		m.addAttribute(product1);

		m.addAttribute("categorylist", this.getCategories());

		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/products");
		return redirectView;
	}

	@RequestMapping(value = "/deletep/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId, Model m, HttpServletRequest request) {
		Product product = productDao.getProduct(productId);
		productDao.deleteProduct(product);

		Product product1 = new Product();
		m.addAttribute(product1);

		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/products");
		return redirectView;
	}

	

	public Map<Integer, String> getCategories() {
		List<Category> listCategories = categoryDao.listCategorys();
		LinkedHashMap<Integer, String> categoryList = new LinkedHashMap<Integer, String>();
		for (Category category : listCategories) {
			categoryList.put(category.getCategoryId(), category.getCategoryName());
		}
		return categoryList;
	}
}
