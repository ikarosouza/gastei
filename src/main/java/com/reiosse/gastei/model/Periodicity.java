package com.reiosse.gastei.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@AllArgsConstructor
public enum Periodicity {
    PONTUAL(1, "Pontual"),
    MENSAL(2, "Mensal"),
    TRIMESTRAL(3, "Trimestral"),
    SEMESTRAL(4, "Semestral"),
    ANUAL(5, "Anual");

    @Id
    private int id;
    private String name;
}
