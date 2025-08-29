package com.krub.hosp_manager.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Patient {
    @Id
    private Long patientId;

    private String name;

    private LocalDate dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "admitted_by")
    private Employee admittedBy;
}