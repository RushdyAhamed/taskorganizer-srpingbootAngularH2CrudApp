package com.milan.taskorganizer.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate dueDate;
    private boolean checked;

    public Task() { }

    public Task(Long id, String name, LocalDate dueDate, boolean checked) {
        this.id = id;
        this.name = name;
        this.dueDate = dueDate;
        this.checked = checked;
    }
}

