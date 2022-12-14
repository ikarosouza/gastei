package com.reiosse.gastei.mapper;

import com.reiosse.gastei.dto.ExpenseDTO;
import com.reiosse.gastei.model.Expense;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ExpenseMapper {
  ExpenseMapper INSTANCE = Mappers.getMapper(ExpenseMapper.class);

  Expense expenseDtoToExpense(ExpenseDTO expenseDTO);

  ExpenseDTO expenseToExpenseDTO(Expense expense);
}
