package sp.sb.pms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int projectId;

    @Transient
    List<Task> tasksList;   // Tasks of a Project

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", tasksList=" + tasksList +
                '}';
    }
}
