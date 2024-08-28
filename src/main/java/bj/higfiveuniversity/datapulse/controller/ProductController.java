package bj.higfiveuniversity.datapulse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bj.higfiveuniversity.datapulse.model.Product;
import bj.higfiveuniversity.datapulse.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {


    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    


    @PostMapping
    public Product createProduct( @RequestBody Product product) {
        return productRepository.save(product);   
    }

    @PutMapping("/{id}")
    public Product updateProduct( @PathVariable Long id, @RequestBody Product productDetail) {
        Product product = productRepository.findById(id).orElseThrow();
        product.setName(productDetail.getName());
        product.setPrice(product.getPrice());
        return productRepository.save(product);  
    }
    
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        Product product = productRepository.findById(id).orElseThrow();
        productRepository.delete(product);   
    }

}
