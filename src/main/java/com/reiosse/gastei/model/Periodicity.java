package com.reiosse.gastei.model;

import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Periodicity {
  PONTUAL(1, "Pontual"),
  MENSAL(2, "Mensal"),
  TRIMESTRAL(3, "Trimestral"),
  SEMESTRAL(4, "Semestral"),
  ANUAL(5, "Anual");

  @Id
  private final int id;
  private final String name;
}
