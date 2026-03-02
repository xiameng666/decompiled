public enum hlxk implements hfub {
    UNSET(0),
    OPTED_IN(1),
    OPT_IN_REJECTED(2),
    @Deprecated
    OPT_IN_VIEWED(3),
    OPT_IN_SNOOZED(4),
    UNRECOGNIZED(-1);

    private final int h;

    private hlxk(int v1) {
        this.h = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hlxk.f) {
            return this.h;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}

