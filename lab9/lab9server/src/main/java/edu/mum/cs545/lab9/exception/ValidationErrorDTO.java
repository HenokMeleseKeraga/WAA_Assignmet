package edu.mum.cs545.lab9.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@NoArgsConstructor
public class ValidationErrorDTO {
    private String errType;
    private List<FieldErrorDTO> fieldErrorDTOList= new ArrayList<>();
    public void addFieldError(FieldErrorDTO fieldErrorDTO){
        fieldErrorDTOList.add(fieldErrorDTO);
    }
}
