package human.resource.mgmt.domain;

import human.resource.mgmt.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class VacationDaysIntialized extends AbstractEvent {

    private String userId;
    private Integer dayCount;
}
