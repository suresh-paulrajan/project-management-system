package sp.sb.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sp.sb.pms.model.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}