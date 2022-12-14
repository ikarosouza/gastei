package com.reiosse.gastei.model;

import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CategoryType {
  EXPENSE(1, "Despesa"),
  INCOME(2, "Renda");

  @Id
  private final int id;
  private final String name;
}
