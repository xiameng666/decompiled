public enum hktw implements hfub {
    INCOMPLETE_JOURNEY_STATUS_UNSPECIFIED(0),
    UNRESOLVED(1),
    RESOLVED(2),
    UNRECOGNIZED(-1);

    private final int f;

    private hktw(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hktw.d) {
            return this.f;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

