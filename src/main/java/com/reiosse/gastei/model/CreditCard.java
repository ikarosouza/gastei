package com.reiosse.gastei.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class CreditCard {
  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private Date dueDate;
  @OneToMany
  private List<Expense> expenses;
  @Transient
  private Long totalValue;
}
