package sp.sb.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sp.sb.pms.model.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Integer> {
}