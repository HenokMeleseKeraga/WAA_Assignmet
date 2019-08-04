package edu.mum.cs545.lab9.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FieldErrorDTO {
    private String fieldName;
    private String message;

    public FieldErrorDTO(String fieldName, String message) {
        this.fieldName = fieldName;
        this.message = message;
    }
}
