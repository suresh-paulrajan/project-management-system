package sp.sb.pms.constants;

public enum DependencyTypes {
    RESOURCE(0),
    SKILL(1),
    TASK(2);

    public final int type;

    DependencyTypes(int typeId){
        this.type = typeId;
    }
}
