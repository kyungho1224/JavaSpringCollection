package kr.amaranth.validationpractice.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import kr.amaranth.validationpractice.annotation.PhoneNumber;

import java.util.regex.Pattern;

/**
 * Created by KimKyungHo on 2023-12-05(005)
 */
public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {

    private String regexp;

    @Override
    public void initialize(PhoneNumber constraintAnnotation) {
//        ConstraintValidator.super.initialize(constraintAnnotation);
        this.regexp = constraintAnnotation.regexp();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean result = Pattern.matches(regexp, value);
        return result;
    }

}
