package com.mrcinkowski.weddingplanner.domain.budget.entities;

import com.mrcinkowski.weddingplanner.domain.user.UserEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "budget_entity")
public class BudgetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "budget_amount", nullable = false)
    private Integer budgetAmount;

    @OneToMany(mappedBy = "budgetEntity", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<ExpenseEntity> expenseEntities = new ArrayList<>();

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_entity_id", nullable = false)
    private UserEntity userEntity;

}