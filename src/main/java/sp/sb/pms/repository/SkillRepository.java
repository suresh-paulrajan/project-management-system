package sp.sb.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sp.sb.pms.model.Skill;

public interface SkillRepository extends JpaRepository<Skill, Integer> {
}