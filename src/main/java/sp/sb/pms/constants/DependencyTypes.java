package sp.sb.pms.constants;

public enum DependencyTypes {
    RESOURCE(0),
    SKILL(1),
    TASK(2);

    private final int typeId;

    DependencyTypes(int typeId){
        this.typeId = typeId;
    }
}
