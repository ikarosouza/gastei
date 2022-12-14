package com.reiosse.gastei.service.impl;

import com.reiosse.gastei.dto.ExpenseDTO;
import com.reiosse.gastei.exceptions.NotFoundException;
import com.reiosse.gastei.mapper.ExpenseMapper;
import com.reiosse.gastei.model.Expense;
import com.reiosse.gastei.repository.ExpenseRepository;
import com.reiosse.gastei.service.CategoryService;
import com.reiosse.gastei.service.ExpenseService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExpenseServiceImpl implements ExpenseService {

  private CategoryService categoryService;
  private ExpenseRepository expenseRepository;

  @Override
  public Expense getById(Long id) {
    return expenseRepository.findById(id)
        .orElseThrow(() -> new NotFoundException("Category", id));
  }

  @Override
  public List<Expense> getAll() {
    return expenseRepository.findAll();
  }

  @Override
  public Expense saveExpense(ExpenseDTO expenseDTO) {
    var expense = ExpenseMapper.INSTANCE.expenseDtoToExpense(expenseDTO);
    expense.setCategory(categoryService.getById(expenseDTO.getCategoryId()));
    if (expense.getInstallment()) {
      expense.setInstallmentValue(expense.getTotalValue() / expense.getInstallmentsQuantity());
    }
    return expenseRepository.save(expense);
  }

  @Override
  public void delete(Long id){
    expenseRepository.deleteById(id);
  }
}
