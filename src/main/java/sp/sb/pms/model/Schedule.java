package sp.sb.pms.model;

import lombok.Data;
import java.util.Date;

@Data
public class Schedule {
    int scheduleId;
    int scheduleType;   // From ENUM ScheduleTypes
    Date startTime;
    Date endTime;
    int consumerId;     // Either resourceId, userId or taskId
}
