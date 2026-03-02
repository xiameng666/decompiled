public enum gikp implements hfub {
    THROTTLE_STATE_UNKNOWN(0),
    THROTTLE_STATE_UI_THROTTLED(1),
    THROTTLE_STATE_NOT_THROTTLED(2),
    UNRECOGNIZED(-1);

    private final int f;

    private gikp(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gikp.d) {
            return this.f;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

