package com.reiosse.gastei.model;

import java.util.Date;
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
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Income {
  @Id
  @GeneratedValue
  private Long id;
  private String title;
  private String description;
  private Category category;
  private Double totalValue;
  private Date incomeDate;
  private Date createdDate;
  @Enumerated(EnumType.STRING)
  private Periodicity periodicity;
  private Boolean recurrent;

}
