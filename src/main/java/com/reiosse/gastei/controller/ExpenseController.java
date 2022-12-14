package com.reiosse.gastei.controller;

import com.reiosse.gastei.dto.ExpenseDTO;
import com.reiosse.gastei.model.Expense;
import com.reiosse.gastei.service.ExpenseService;
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
@RequestMapping(path = "/expense")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ExpenseController {

  private final ExpenseService expenseService;

  @GetMapping("/{id}")
  public Expense getById(@PathVariable("id") long id) {
    return expenseService.getById(id);
  }

  @RequestMapping("/all")
  public List<Expense> getAll() {
    return expenseService.getAll();
  }

  @PostMapping
  public ResponseEntity<Expense> save(@RequestBody ExpenseDTO expense) {
    return ResponseEntity.ok(expenseService.saveExpense(expense));
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<Long> delete(@PathVariable("id") Long expenseId) {
    expenseService.delete(expenseId);
    return ResponseEntity.ok(expenseId);
  }
}
