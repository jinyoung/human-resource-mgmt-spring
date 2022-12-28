package human.resource.mgmt.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Employee_table")
@Data
public class Employee {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
