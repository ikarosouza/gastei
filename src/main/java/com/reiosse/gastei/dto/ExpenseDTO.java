package com.reiosse.gastei.dto;

import com.reiosse.gastei.model.Periodicity;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExpenseDTO {

  private Long id;
  private String title;
  private String description;
  private Long categoryId;
  private Double totalValue;
  private Date expenseDate;
  private Date createdDate;
  private Periodicity periodicity;
  private Boolean recurrent;
  private Boolean installment;
  private Integer installmentsQuantity;
}
