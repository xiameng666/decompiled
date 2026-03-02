public enum gzym implements hfub {
    RELOCK_TYPE_UNKNOWN(0),
    RELOCK_TYPE_HEARTBEAT_BASED(1),
    RELOCK_TYPE_DISTANCE_BASED(2),
    UNRECOGNIZED(-1);

    private final int f;

    private gzym(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gzym.d) {
            return this.f;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

