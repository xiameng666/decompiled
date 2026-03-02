public enum hogh implements hfub {
    UNKNOWN_STATE(0),
    STATE_IN_SERVICE(1),
    STATE_OUT_OF_SERVICE(2),
    STATE_EMERGENCY_ONLY(3),
    STATE_POWER_OFF(4),
    UNRECOGNIZED(-1);

    private final int h;

    private hogh(int v1) {
        this.h = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hogh.f) {
            return this.h;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}

