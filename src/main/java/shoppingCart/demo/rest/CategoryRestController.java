//package shoppingCart.demo.rest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import shoppingCart.demo.entities.Category;
//import shoppingCart.demo.entities.Product;
//import shoppingCart.demo.service.CategoryService;
//import shoppingCart.demo.service.ProductService;
//import java.util.List;
//
//@RestController
//public class CategoryRestController {
//    @Autowired
//    CategoryService categoryService;
//
//    @Autowired
//    ProductService productService;
//
//    @Autowired
//    Product product;
//
//    @GetMapping("/admin/categories")
//    @ResponseBody
//    public List<Category> getAllCategories(){
//        return categoryService.getAllCategories();
//    }
//
//    @PostMapping("/admin/categories/add")
//    public ResponseEntity<String> addCategories(@ModelAttribute("category") Category category){
//        categoryService.addCategory(category);
//        return ResponseEntity.ok("Category Added Successfully");
//    }
//
//   @DeleteMapping("/admin/categories/delete/{id}")
//    public ResponseEntity<String> deleteCategoryById(@PathVariable int id){
//        categoryService.removeCategoryById(id);
//        return ResponseEntity.ok("Category deleted Successfully");
//    }
//
//    /* PRODUCT SECTION CONTROLLERS START */
//    @GetMapping("/admin/products")
//    public List<Product> getAllProduct(){
//        return productService.getAllProducts();
//    }
//
//    @PostMapping("/admin/products/add")
//    public ResponseEntity<String> addProducts(@ModelAttribute("products") Product product){
//        productService.addProduct(product);
//        return ResponseEntity.ok("Product added Successfully");
//    }
//
//    @DeleteMapping("/admin/products/delete/{id}")
//    public ResponseEntity<String> deleteProductById(@PathVariable int id){
//        productService.removeProductById(id);
//        return ResponseEntity.ok("Category deleted Successfully");
//    }
//
//}
