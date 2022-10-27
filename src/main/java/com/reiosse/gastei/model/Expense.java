package com.reiosse.gastei.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@MappedSuperclass
public class Expense implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    protected String title;
    protected String description;
    protected Category category;
    protected double totalValue;
    protected Date createdDate;
    protected String periodicity;
}
