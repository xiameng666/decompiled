public enum gzxs implements hfub {
    UNKNOWN_ABANDON_LOCATION(0),
    FLOW_COMPLETED(1),
    FLOW_ABANDONED_AUTHENTICATION(2),
    FLOW_ABANDONED_EXPLANATION(3),
    FLOW_ABANDONED_DISCOVERY(4),
    FLOW_ABANDONED_SCREEN_LOCK_SETUP(5),
    FLOW_ABANDONED_SETUP_COMPLETE(6),
    FLOW_ABANDONED_PRIMARY_SCREEN_LOCK_SETUP(7),
    FLOW_ABANDONED_ENROLLED_DEVICE_LIST(8),
    UNRECOGNIZED(-1);

    private final int l;

    private gzxs(int v1) {
        this.l = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gzxs.j) {
            return this.l;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.l);
    }
}

