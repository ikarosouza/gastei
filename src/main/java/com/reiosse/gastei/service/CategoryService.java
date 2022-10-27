package com.reiosse.gastei.service;

import com.reiosse.gastei.model.Category;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CategoryService {
    Category getById(long id);
    List<Category> getAll();
    Category save(Category category);
    void delete(Long categoryId);
}
