package sp.sb.pms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AssociateSkillMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int mappingId;
    int userId;
    int skillId;
    int skillLevel;         // From ENUM SkillLevel
}
