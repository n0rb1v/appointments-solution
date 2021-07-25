package nav;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IsValidTypeValidator implements ConstraintValidator<IsValidType, String> {

    @Autowired
    private NavService navService;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext context) {
        return navService.hasValidType(s);
    }
}
