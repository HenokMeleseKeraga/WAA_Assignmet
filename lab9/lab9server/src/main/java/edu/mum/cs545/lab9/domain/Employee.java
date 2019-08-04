package edu.mum.cs545.lab9.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
public class Employee {
    @NotEmpty(message ="First Name must have value")
    private String firstName;
    @NotEmpty (message ="Last Name must have value")
    @Size(min=3,max = 20,message ="Last Name must be between 3 and 20")
    private String lastName;
    @NotEmpty(message ="Email Name must have value")
    private String email;
}
