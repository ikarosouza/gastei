package com.reiosse.gastei.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
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
public class Category implements Serializable {

  @Id
  @GeneratedValue
  private Long id;
  @Column(unique = true, nullable = false)
  private String name;
  @Column(nullable = false)
  private CategoryType type;
}
