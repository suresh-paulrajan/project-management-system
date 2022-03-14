package sp.sb.pms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Dependencies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int type;               // From DependencyTypes ENUM
    float timeNeeded;       // In Hours
    int typeId;             // ID of Resource, Task or Skill
    @Column(columnDefinition = "integer default '-1'")
    int skillLevel;         // Applicable only if type = SKILL, else -1
    int sequence;
}
