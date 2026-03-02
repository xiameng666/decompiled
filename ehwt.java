public enum ehwt {
    CONNECTING(false),
    CONNECTED(true),
    FOUND(true),
    DISCONNECTED(false),
    NO_LONGER_IN_RANGE(false);

    public final boolean f;

    private ehwt(boolean z) {
        this.f = z;
    }
}

