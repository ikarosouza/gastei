package com.reiosse.gastei.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Expense implements Serializable {

  @Id
  @GeneratedValue
  private Long id;
  private String title;
  private String description;
  @Column(nullable = false)
  private Category category;
  private Double totalValue;
  private Date expenseDate;
  private Date createdDate;
  @Enumerated(EnumType.STRING)
  private Periodicity periodicity;
  private Boolean recurrent;
  private Boolean installment;
  private Integer installmentsQuantity;
  private Double installmentValue;
  @ManyToOne
  private CreditCard creditCard;

}
