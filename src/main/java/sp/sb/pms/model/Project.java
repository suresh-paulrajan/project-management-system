package sp.sb.pms.model;

import lombok.Data;
import java.util.List;

@Data
public class Project {
    int projectId;
    List<Task> tasksList;   // Tasks of a Project
}
