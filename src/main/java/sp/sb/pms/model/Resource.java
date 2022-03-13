package sp.sb.pms.model;

import lombok.Data;

@Data
public class Resource {         // Could be a Printer, Meeting Room, VC Device, Server / Hardware, Software
    int resourceId;
    String name;
    String code;
    int count;                  // Total count of resource available in Organization,
                                // can check with Schedule to identify if any is free or not
}
