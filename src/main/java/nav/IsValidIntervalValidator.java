package nav;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDateTime;

public class IsValidIntervalValidator implements ConstraintValidator<IsValidInterval, Interval> {
    @Override
    public boolean isValid(Interval interval, ConstraintValidatorContext context) {
        LocalDateTime now = LocalDateTime.now();
        return interval.getStart().isAfter(now);
    }
}
