package nav;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
//@IsValidCreateAppointmentCommand
public class CreateAppointmentCommand {

    @IsValidTaxNumber
    private String taxNumber;

//    private LocalDateTime start;
//    private LocalDateTime end;

    @IsValidInterval
    private Interval interval;

    @IsValidType
    private String typeCode;

}
