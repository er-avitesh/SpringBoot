package learning.springboot.service;

import java.util.Collection;

import learning.springboot.domain.Product;

public interface ProductService {
	public abstract void createProduct(Product product);

	public abstract void updateProduct(String id, Product product);

	public abstract void deleteProduct(String id);

	public abstract Collection<Product> getProducts();
}