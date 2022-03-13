package sp.sb.pms.model;

import lombok.Data;
import java.util.List;

@Data
public class UserSkillMapping {
    int mappingId;
    int userId;
    int skillId;
    List<Dependencies> dependenciesList;
}
