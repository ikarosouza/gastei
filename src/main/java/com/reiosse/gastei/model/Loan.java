package com.reiosse.gastei.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@EqualsAndHashCode
public class Loan extends Expense {
    private double contractedValue;
    private int installments;
    private double installmentsValue;
}
