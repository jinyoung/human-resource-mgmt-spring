package human.resource.mgmt.external;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class UseCommand {

    private Integer dayCount;
    private String reason;
    private String vacationId;
}
