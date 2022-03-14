package sp.sb.pms.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sp.sb.pms.model.Project;

import java.util.List;

@SpringBootTest
class ProjectRepositoryTest {

    @Autowired
    private ProjectRepository repository;

    @Test
    void getProjects(){
        List<Project> projList =  repository.findAll();
        projList.forEach(System.out::println);
    }
}