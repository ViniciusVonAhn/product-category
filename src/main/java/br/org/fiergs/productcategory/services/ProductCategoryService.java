package br.org.fiergs.productcategory.services;

import br.org.fiergs.productcategory.entities.ProductCategory;
import br.org.fiergs.productcategory.repositories.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    public List<ProductCategory> list(){
        return productCategoryRepository.findAll();
    }

    public ProductCategory save(ProductCategory productCategory) {
        return this.productCategoryRepository.save(productCategory);
    }

    public ProductCategory edit(ProductCategory productCategory) {
        return productCategoryRepository.save(productCategory);
    }

    public void delete(Long id) {
        this.productCategoryRepository.deleteById(id);
    }
}
