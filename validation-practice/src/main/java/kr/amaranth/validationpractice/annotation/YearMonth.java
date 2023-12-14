package kr.amaranth.validationpractice.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import kr.amaranth.validationpractice.validator.YearMonthValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by KimKyungHo on 2023-12-05(005)
 */

@Constraint(validatedBy = {YearMonthValidator.class})
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@NotBlank
public @interface YearMonth {
    String message() default "날짜 양식에 맞지 않습니다 ex) 1970-01";

    //    String pattern() default "/^\\d{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$/";
    String pattern() default "yyyyMM";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
