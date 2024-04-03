package com.mrcinkowski.weddingplanner.domain.budget.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "expense_categories_entity")
public class ExpenseCategoriesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "expenseCategoriesEntity")
    private List<ExpenseEntity> expenseEntities = new ArrayList<>();

}