package sp.sb.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sp.sb.pms.model.Dependency;

public interface DependencyRepository extends JpaRepository<Dependency, Integer> {
}