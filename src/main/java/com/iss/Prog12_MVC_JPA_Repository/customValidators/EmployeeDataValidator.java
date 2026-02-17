package com.iss.Prog12_MVC_JPA_Repository.customValidators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.*;

public class EmployeeDataValidator implements ConstraintValidator<ValidateEmployeeType, String> {
    @Override
    public boolean isValid(String employeeType, ConstraintValidatorContext constraintValidatorContext) {
        List<String> types= Arrays.asList("Contractor","Fulltime");
        return types.stream().anyMatch(employeeType::contains);
    }
}
