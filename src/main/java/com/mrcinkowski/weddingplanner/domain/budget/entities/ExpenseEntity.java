package com.mrcinkowski.weddingplanner.domain.budget.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "expense_entity")
public class ExpenseEntity {
    @ManyToOne
    @JoinColumn(name = "budget_entity_id")
    private BudgetEntity budgetEntity;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "amount_paid")
    private Integer amountPaid;

    @Column(name = "amount")
    private Integer amount;

    @ManyToOne
    @JoinColumn(name = "expense_categories_entity_id")
    private ExpenseCategoriesEntity expenseCategoriesEntity;

}