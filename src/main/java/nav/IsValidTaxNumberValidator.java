package nav;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IsValidTaxNumberValidator implements ConstraintValidator<IsValidTaxNumber, String> {

    private TaxNumberValidator validatorPojo = new TaxNumberValidator();

    @Override
    public boolean isValid(String s, ConstraintValidatorContext context) {
        try {
            return validatorPojo.check(s);
        }catch (IllegalArgumentException iae) {
            return false;
        }
    }


}
