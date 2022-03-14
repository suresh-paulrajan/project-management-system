package sp.sb.pms.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sp.sb.pms.constants.DependencyTypes;
import sp.sb.pms.constants.SkillLevel;
import sp.sb.pms.model.*;
import sp.sb.pms.repository.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StartUpConfig {

    @Bean
    CommandLineRunner populateData(ProjectRepository projectRepo, TaskRepository taskRepo, SkillRepository skillRepo,
                                   AssociateRepository userRepo, ResourceRepository resourceRepo,
                                   DependencyRepository depRepo, AssociateSkillMappingRepository userSkillRepo){
        return args -> {
            Project project = new Project(1, new ArrayList<>());
            Project project2 = new Project(2, new ArrayList<>());
            Project project3 = new Project(3, new ArrayList<>());
            projectRepo.saveAll(List.of(project, project2, project3));

            Resource softwareIde = new Resource(1, "IntelliJ IDEA", "SW_JBIJ", 200);
            Resource softwareVM = new Resource(2, "Linux VM", "VM_Linux", 200);
            Resource printer = new Resource(3, "Colour Printer", "HW_Printer_Color", 3);
            resourceRepo.saveAll(List.of(softwareIde, softwareVM, printer));

            Skill java = new Skill(1, "Java");
            Skill ux = new Skill(2, "UX");
            Skill ng = new Skill(3, "Angular");
            Skill aws = new Skill(4, "AWS");
            Skill manager = new Skill(5, "Management");
            skillRepo.saveAll(List.of(java, ux, ng, aws, manager));

            Associate developer = new Associate(1);
            Associate designer = new Associate(2);
            Associate architect = new Associate(3);
            userRepo.saveAll(List.of(developer, designer, architect));

            AssociateSkillMapping e1 = new AssociateSkillMapping(1, 1, 1, SkillLevel.INDIVIDUAL_CONTRIBUTOR.level);
            AssociateSkillMapping e2 = new AssociateSkillMapping(2, 1, 3, SkillLevel.INDIVIDUAL_CONTRIBUTOR.level);
            AssociateSkillMapping e3 = new AssociateSkillMapping(3, 2, 2, SkillLevel.LEADER.level);
            AssociateSkillMapping e4 = new AssociateSkillMapping(4, 3, 4, SkillLevel.SME.level);
            userSkillRepo.saveAll(List.of(e1, e2, e3, e4));

            Dependency skillArch = new Dependency(1, DependencyTypes.SKILL.type, 8, 4, SkillLevel.SME.level, 1);
            Dependency skillDev = new Dependency(2, DependencyTypes.SKILL.type, 40, 1, SkillLevel.INDIVIDUAL_CONTRIBUTOR.level, 2);
            depRepo.saveAll(List.of(skillArch, skillDev));

            Task design = new Task(1, "Design", 8, 0, new ArrayList<>(List.of(skillArch)));
            Task develop = new Task(2, "Develop", 40, 0, new ArrayList<>(List.of(skillDev)));
            taskRepo.saveAll(List.of(design, develop));

        };
    }
}
