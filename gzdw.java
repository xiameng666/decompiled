public enum gzdw implements hfub {
    ACCEPT_NEW_RECEIVER_STATE_UNSPECIFIED(0),
    ACCEPT_NEW_RECEIVER_STATE_NOT_ALLOWED(1),
    ACCEPT_NEW_RECEIVER_STATE_EXTENDED(2),
    UNRECOGNIZED(-1);

    private final int f;

    private gzdw(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gzdw.d) {
            return this.f;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

