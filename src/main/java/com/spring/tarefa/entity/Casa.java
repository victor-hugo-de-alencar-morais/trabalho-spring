package com.spring.tarefa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Casa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCasa;

    @Column (nullable = false, length = 40)
    private String cidCasa;

    @Column (nullable = false, length = 11)
    private String enderecoCasa;

    @Column (nullable = false, length = 40)
    private String cidadeCasa;

    @Column (nullable = false, length = 11)
    private String nrcomodosCasa;

    @Column (nullable = false, length = 40)
    private String metrosquadCasa;
    
}

