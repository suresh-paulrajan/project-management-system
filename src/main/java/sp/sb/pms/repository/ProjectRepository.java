package sp.sb.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sp.sb.pms.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
