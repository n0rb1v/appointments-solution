package nav;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDateTime;

public class IsValidCreateAppointmentCommandValidator implements ConstraintValidator<IsValidCreateAppointmentCommand, CreateAppointmentCommand> {
    @Override
    public boolean isValid(CreateAppointmentCommand command, ConstraintValidatorContext context) {
//        LocalDateTime now = LocalDateTime.now();
//        return command.getStart().isAfter(now) && command.getStart().isBefore(command.getEnd());
        return false;
    }
}
