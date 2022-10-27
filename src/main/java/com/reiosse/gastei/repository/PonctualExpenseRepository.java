package com.reiosse.gastei.repository;

import com.reiosse.gastei.model.PonctualExpense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PonctualExpenseRepository extends JpaRepository<PonctualExpense, Long> {
}
