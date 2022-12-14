package com.reiosse.gastei.service;

import com.reiosse.gastei.dto.ExpenseDTO;
import com.reiosse.gastei.model.Expense;
import java.util.List;

public interface ExpenseService {

  Expense getById(Long id);

  List<Expense> getAll();

  Expense saveExpense(ExpenseDTO expenseDTO);

  void delete(Long id);
}
