package com.reiosse.gastei.model;

import java.time.Month;
import java.time.Year;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Balance {
  @Id
  @GeneratedValue
  private Long id;
  private Double expenseAmount;
  private Double incomeAmount;
  private Double previousBalance;
  @Enumerated(EnumType.STRING)
  private Month month;
  private Integer year;
}
