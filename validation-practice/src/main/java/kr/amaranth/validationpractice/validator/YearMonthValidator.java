package kr.amaranth.validationpractice.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import kr.amaranth.validationpractice.annotation.YearMonth;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by KimKyungHo on 2023-12-05(005)
 */
public class YearMonthValidator implements ConstraintValidator<YearMonth, String> {

    private String pattern;

    @Override
    public void initialize(YearMonth constraintAnnotation) {
        this.pattern = constraintAnnotation.pattern();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        var reValue = value + "01";
        var rePattern = pattern + "dd";

        try {
            LocalDate date = LocalDate.parse(reValue, DateTimeFormatter.ofPattern(rePattern));
            System.out.println(date);
            return true;
        } catch (Exception e) {
            return false;
        }

//        return Pattern.matches(pattern, value);
    }
}
