package sp.sb.pms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Resource {         // Could be a Printer, Meeting Room, VC Device, Server / Hardware, Software
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int resourceId;
    String name;
    String code;
    int count;                  // Total count of resource available in Organization,
                                // can check with Schedule to identify if any is free or not
}
