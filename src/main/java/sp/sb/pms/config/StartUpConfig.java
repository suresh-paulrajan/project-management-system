package sp.sb.pms.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sp.sb.pms.model.*;
import sp.sb.pms.repository.ProjectRepository;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StartUpConfig {

    @Bean
    CommandLineRunner populateData(ProjectRepository repository){
        return args -> {
            Project project = new Project(1, new ArrayList<>());
            Project project2 = new Project(2, new ArrayList<>());
            Project project3 = new Project(3, new ArrayList<>());

            repository.saveAll(List.of(project, project2, project3));
        };
    }
}
