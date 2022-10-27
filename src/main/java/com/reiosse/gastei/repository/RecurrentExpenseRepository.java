package com.reiosse.gastei.repository;

import com.reiosse.gastei.model.RecurrentExpense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecurrentExpenseRepository extends JpaRepository<RecurrentExpense, Long> {
}
