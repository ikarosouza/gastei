package com.reiosse.gastei.controller;

import com.reiosse.gastei.model.Category;
import com.reiosse.gastei.service.CategoryService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/category")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class CategoryController {

  private CategoryService categoryService;

  @GetMapping("/{id}")
  public Category getById(@PathVariable("id") long id) {
    return categoryService.getById(id);
  }

  @RequestMapping("/all")
  public List<Category> getAll() {
    return categoryService.getAll();
  }

  @PostMapping
  public ResponseEntity<Category> save(@RequestBody Category category) {
    return ResponseEntity.ok(categoryService.save(category));
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<Long> delete(@PathVariable("id") Long categoryId) {
    categoryService.delete(categoryId);
    return ResponseEntity.ok(categoryId);
  }
}
