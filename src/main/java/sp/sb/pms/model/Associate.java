package sp.sb.pms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Associate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int userId;
}
