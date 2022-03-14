package sp.sb.pms.constants;

public enum SkillLevel {
    BEGINNER(0),
    EXPERIENCED(1),
    INDIVIDUAL_CONTRIBUTOR(2),
    LEADER(3),
    SME(4);

    public int level;

    SkillLevel(int level){
        this.level = level;
    }
}
