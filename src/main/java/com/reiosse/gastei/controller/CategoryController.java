package com.reiosse.gastei.controller;

import com.reiosse.gastei.model.Category;
import com.reiosse.gastei.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.expression.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/category")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("/{id}")
    public Category getById(@PathVariable("id") long id){
        return categoryService.getById(id);
    }

    @RequestMapping("/all")
    public List<Category> getAll(){
        return categoryService.getAll();
    }

    @PostMapping
    public ResponseEntity<Category> save(@RequestBody Category category){
        return ResponseEntity.ok(categoryService.save(category));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Long> delete(@PathVariable("id") Long categoryId){
        categoryService.delete(categoryId);
        return ResponseEntity.ok(categoryId);
    }
}
