package com.krub.hosp_manager.model;

import com.krub.hosp_manager.enums.EmployeeStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    @Id
    private Long employeeId;

    private String department;

    private String name;

    @Enumerated(EnumType.STRING)
    private EmployeeStatus status;
}