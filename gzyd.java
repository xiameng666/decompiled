public enum gzyd implements hfub {
    MIGRATION_TYPE_UNSPECIFIED(0),
    MIGRATION_TYPE_UPGRADE_NEW_METHOD_RELEASE(1),
    MIGRATION_TYPE_UPGRADE_RESTRICTION_REMOVAL(2),
    MIGRATION_TYPE_DOWNGRADE_METHOD_ROLLBACK(3),
    MIGRATION_TYPE_DOWNGRADE_RESTRICTION(4),
    MIGRATION_TYPE_UPGRADE_TEMP_RESTRICTION_REMOVAL(5),
    MIGRATION_TYPE_DOWNGRADE_TEMP_RESTRICTION(6),
    UNRECOGNIZED(-1);

    private final int j;

    private gzyd(int v1) {
        this.j = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gzyd.h) {
            return this.j;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.j);
    }
}

