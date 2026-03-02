public enum gzyo implements hfub {
    UNKNOWN_RPC_CONNECTION_EVENT(0),
    WEAR_CONNECTION_EVENT(1),
    WEAR_CONNECTION_LATE_RESPONSE_EVENT(2),
    UNRECOGNIZED(-1);

    private final int f;

    private gzyo(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gzyo.d) {
            return this.f;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

