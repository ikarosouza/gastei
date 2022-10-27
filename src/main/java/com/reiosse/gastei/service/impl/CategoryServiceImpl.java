package com.reiosse.gastei.service.impl;

import com.reiosse.gastei.model.Category;
import com.reiosse.gastei.repository.CategoryRepository;
import com.reiosse.gastei.service.CategoryService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public Category getById(long id) {
        return categoryRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void delete(Long categoryId) {
        categoryRepository.deleteById(categoryId);
    }
}
