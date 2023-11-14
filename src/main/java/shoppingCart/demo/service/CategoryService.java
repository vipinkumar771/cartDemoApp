package shoppingCart.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shoppingCart.demo.entities.Category;
import shoppingCart.demo.repository.CategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }
    public void addCategory(Category category){
        categoryRepository.save(category);
    }
    public void removeCategoryById(int id){categoryRepository.deleteById(id);}

    public Optional<Category> findCategoryById(int id){return categoryRepository.findById(id);}
}
