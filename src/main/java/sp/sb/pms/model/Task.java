package sp.sb.pms.model;

import lombok.Data;
import java.util.List;

@Data
public class Task {
    int taskId;
    String name;
    float estimatedHours;
    float actualHours;
    List<Dependencies> dependenciesList;
}
