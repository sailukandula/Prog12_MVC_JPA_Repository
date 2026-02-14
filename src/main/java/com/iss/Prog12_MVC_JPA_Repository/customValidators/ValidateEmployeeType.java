package com.iss.Prog12_MVC_JPA_Repository.customValidators;

import com.iss.Prog12_MVC_JPA_Repository.entities.EmployeeData;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import org.springframework.stereotype.Controller;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.TYPE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EmployeeDataValidator.class)
public @interface ValidateEmployeeType {
    public String message() default "Invalid Employee Type: It should be Contractor or Fulltime";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
