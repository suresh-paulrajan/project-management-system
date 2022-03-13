package sp.sb.pms.constants;

public enum ScheduleTypes {
    RESOURCE(0),
    USER(1),
    TASK(2);

    private final int typeId;

    ScheduleTypes(int typeId) {
        this.typeId = typeId;
    }
}
